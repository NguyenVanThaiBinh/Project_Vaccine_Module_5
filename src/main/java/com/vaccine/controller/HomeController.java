package com.vaccine.controller;


import com.vaccine.model.*;
import com.vaccine.repository.ICustomerRepository;
import com.vaccine.repository.ICustomerRoleRepository;
import com.vaccine.repository.IDestinationRepository;
import com.vaccine.repository.IVaccineRepository;
import com.vaccine.service.CustomerServiceVerifyAccount;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpMethod;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import springfox.documentation.RequestHandler;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.*;

@RestController
@RequestMapping(value = {"/"}, method = RequestMethod.GET, produces = "application/x-www-form-urlencoded;charset=UTF-8")
public class HomeController {

    @Autowired
    JavaMailSender mailSender;

    @Autowired
    ICustomerRepository iCustomerRepository;

    @Autowired
    ICustomerRoleRepository iCustomerRoleRepository;

    @Autowired
    IDestinationRepository iDestinationRepository;

    @Autowired
    IVaccineRepository iVaccineRepository;

    @Autowired
    CustomerServiceVerifyAccount customerServiceVerifyAccount;

    @Autowired
    private RestTemplate restTemplate;


    @ModelAttribute("destinations")
    public List<Destination> destinationList() {
        return iDestinationRepository.findAllOpen();
    }

    @ModelAttribute("vaccineList")
    public List<Vaccine> vaccineList() {
        return iVaccineRepository.findAllByRegister();
    }

    //        Xử lý lấy ngày hiện tại
    LocalDate localDate = LocalDate.now();
    String[] day = localDate.toString().split("-");
    String currentDay = day[2]+"-"+day[1]+"-"+day[0]+" ";


    @GetMapping
    public ModelAndView home(HttpServletRequest request, Principal principal) {
        if (request.isUserInRole("ROLE_DOCTOR")) {
            sendEmail2(principal);
            String userName = principal.getName();
            Customer user = new Customer();
            user = iCustomerRepository.findByUserCMND(userName);
//            Phân trang
            Page<Customer> customerListIsDone = iCustomerRepository.findCustomerIsDoneInDay(currentDay, user.getDestination().getId(), PageRequest.of(0, 5));

            //          Lấy số page
            List<Integer> pageNumber = new ArrayList<>();
            for (int i = 0; i < customerListIsDone.getTotalPages(); i++) {
                pageNumber.add(i);
            }
            ModelAndView modelAndView = new ModelAndView("doctor/ListUserIsDone");
            modelAndView.addObject("idDes",user.getDestination().getId());
            modelAndView.addObject("customerListIsDone", customerListIsDone);
            modelAndView.addObject("customerInfo", user);
            modelAndView.addObject("pageNumber", pageNumber);
            modelAndView.addObject("maxPage", customerListIsDone.getTotalPages());
            return modelAndView;
        }
        if (request.isUserInRole("ROLE_USER")) {
            ModelAndView modelAndView = new ModelAndView("user/userPage");
            String userName = principal.getName();
            Customer user = iCustomerRepository.findByUserCMND(userName);
            modelAndView.addObject("userInfo", user);
            return modelAndView;
        }
        if (request.isUserInRole("ROLE_ADMIN")) {
            ModelAndView modelAndView = new ModelAndView("admin/dashBoar");
            String userName = principal.getName();
            Customer user = iCustomerRepository.findByUserCMND(userName);
            modelAndView.addObject("userInfo", user);
            return modelAndView;
        }
        ModelAndView modelAndView = new ModelAndView("index/home");
        modelAndView.addObject("user", new Customer());
        return modelAndView;

    }
    @GetMapping("/checkRole")
    public ModelAndView checkRoleAndSession(HttpServletRequest request, Principal principal) {

        // Nếu có remember me
        for (Cookie c : request.getCookies()) {
            if (c.getName().equals("remember-me") || c.getName().equals("JSESSIONID")) {
                //    <----------------------------- Phân trang đúng quyền ------------------------------>
                if (request.isUserInRole("ROLE_DOCTOR")) {
                    sendEmail2(principal);
                    String userName = principal.getName();
                    Customer user = new Customer();
                    user = iCustomerRepository.findByUserCMND(userName);
                    // Lấy danh sách ngày
                    List<String> stringDayList = iCustomerRepository.findDayInOneDestination(user.getDestination().getId());
                    //            Phân trang
                    Page<Customer> customerListIsDone = iCustomerRepository.findCustomerIsDoneInDay(currentDay, user.getDestination().getId(), PageRequest.of(0, 5));
                    //          Lấy số page
                    List<Integer> pageNumber = new ArrayList<>();
                    for (int i = 0; i < customerListIsDone.getTotalPages(); i++) {
                        pageNumber.add(i);
                    }
                    ModelAndView modelAndView = new ModelAndView("doctor/ListUserIsDone");
                    modelAndView.addObject("customerListIsDone", customerListIsDone);
                    modelAndView.addObject("customerInfo", user);
                    modelAndView.addObject("stringDayList", stringDayList);
                    modelAndView.addObject("pageNumber", pageNumber);
                    modelAndView.addObject("maxPage", customerListIsDone.getTotalPages());
                    return modelAndView;
                }
                if (request.isUserInRole("ROLE_USER")) {
                    ModelAndView modelAndView = new ModelAndView("user/userPage");
                    String userName = principal.getName();
                    Customer user = iCustomerRepository.findByUserCMND(userName);
                    modelAndView.addObject("userInfo", user);
                    return modelAndView;
                }
                if (request.isUserInRole("ROLE_ADMIN")) {
                    ModelAndView modelAndView = new ModelAndView("admin/dashBoar");
                    String userName = principal.getName();
                    Customer user = iCustomerRepository.findByUserCMND(userName);
                    modelAndView.addObject("userInfo", user);
                    return modelAndView;
                }
            }
        }
        HttpSession session = request.getSession(false);
        if (session == null || !request.isRequestedSessionIdValid()) {
            ModelAndView modelAndView = new ModelAndView("/security/login");
            modelAndView.addObject("sessionIdValid", "Phiên làm việc đã hết hạn!");
            return modelAndView;
        }
        ModelAndView modelAndView = new ModelAndView("index/home");
        modelAndView.addObject("user", new Customer());
        return modelAndView;
    }

    public void sendEmail2(Principal principal){
        String dateBefore = LocalDate.now().minusDays(7L).toString();
        Customer customer = iCustomerRepository.findByUserCMND(principal.getName());
        List<Customer> list = iCustomerRepository.ListCustomerInjection2(customer.getDestination().getId());
//        System.out.println(dateBefore);
        if(checkDestinationIsOpen()){
            for(Customer c:list){
                String[] arr = c.getDate_vaccine().trim().split("-");
                String date = arr[2]+"-"+arr[1]+"-"+arr[0];
                if(date.compareTo(dateBefore)<=0){
//                    System.out.println(c.toString());
                    // gửi mail thông báo tiêm lần 2



                    //Set setISjection = 1 : đang chờ
                    c.setIsInjection2(1);
                    iCustomerRepository.save(c);
                }
            }
        }

    }

    @PostMapping("/registerVaccine2")
    public ModelAndView registerVaccine2(Customer customer){
        ModelAndView modelAndView = new ModelAndView("/index/form2");
        System.out.println(customer.toString());
        Customer customer1 = iCustomerRepository.findByUserCMND(customer.getCMND());
        customer1.setDestination2(customer.getDestination());
        customer1.setId(customer1.getId());
        iCustomerRepository.save(customer1);
        modelAndView.addObject("msg","Đăng Ký tiêm lần 2 thành công !! ");
        return modelAndView;
    }

    @GetMapping("/getForm/{certify}")
    public ModelAndView showForm2(@PathVariable String certify){
        //$2a$10$GpOvzF2B7ZI84xVP9cngOPW97tE1qoGCdkofU3D.owsVzjjjj2thM7He
        Customer customer = iCustomerRepository.findByVerificationCode(certify);
        ModelAndView modelAndView = new ModelAndView("/index/form2");
        modelAndView.addObject("customer",customer);
        return modelAndView;
    }


    public boolean checkDestinationIsOpen(){
        List<Destination> list = iDestinationRepository.findAllOpen();
        for(Destination d:list){
            if(d.getIsOpen()==0){
                return true;
            }
        }
        return false;
    }

    @GetMapping("/form")
    public ModelAndView showForm() {
        //redirect if amount vaccine ==0
        int sumVaccine = iVaccineRepository.sumVaccine();
        if(sumVaccine<=0){
            return new ModelAndView("/security/regisFound");
        }

        ModelAndView modelAndView = new ModelAndView("/index/form");
        modelAndView.addObject("user", new Customer());
        return modelAndView;

    }

    @GetMapping(value = {"/login"})
    public ModelAndView loginPage(HttpServletRequest request, Principal principal) {
        if (request.isUserInRole("ROLE_ADMIN") || request.isUserInRole("ROLE_USER") || request.isUserInRole("ROLE_DOCTOR")) {
//            return về trang user lại
            String userName = principal.getName();
            Customer user = new Customer();
            user = iCustomerRepository.findByUserCMND(userName);
            ModelAndView modelAndView = new ModelAndView("/user/userPage");
            modelAndView.addObject("userInfo", user);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/security/login");

            return modelAndView;
        }
    }

    // Lấy địa chỉ URL trang hiện tại
    private String getSiteURL(HttpServletRequest request) {
        String siteURL = request.getRequestURL().toString();
        return siteURL.replace(request.getServletPath(), "");
    }

    @PostMapping("/create")
    public ModelAndView createUser(Customer user, HttpServletRequest request) throws InterruptedException, ExecutionException {

        //        Recaptcha
//        , @RequestParam(name = "g-recaptcha-response") String captchaResponse
//        String url = "https://www.google.com/recaptcha/api/siteverify";
//        String params = "?secret=6LfXcRMbAAAAAIqUiv2NJ1GA3kjpkt3uTOnCHZrf&response=" + captchaResponse;
//
//        ReCaptchaResponse reCaptchaResponse = restTemplate.exchange(url + params, HttpMethod.POST, null, ReCaptchaResponse.class).getBody();
//        if (!reCaptchaResponse.isSuccess()) {
//            ModelAndView modelAndView = new ModelAndView("/index/form");
//            modelAndView.addObject("user", new Customer());
//            modelAndView.addObject("fail", "Vui lòng hoàn thành Captcha!!!");
//            return modelAndView;
//        }

        //       set age and status
        user.setAge(java.time.LocalDate.now().getYear() - user.getAge());
        user.setHealthy_status(2);
//        user.setHealthy_status(setStatus(user));


//                Gửi mail xác minh tài khoản
//        Thread thread1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                customerServiceVerifyAccount.sendEmailVerifyAccount("boyte.vaccine.covid@gmail.com", user,getSiteURL(request));
//            }
//        });

        // Kiểm tra đã có điểm tiêm đã có bắt đầu chưa?
        try {
            // Tìm không ra ID của điểm tiêm
            setDayTimeStart(user.getDestination().getId());
        } catch (Exception e) {
            ModelAndView modelAndView = new ModelAndView("/index/form");
            modelAndView.addObject("user", new Customer());
            modelAndView.addObject("fail", "Chiến dịch chưa bắt đầu, vui lòng quay lại sau!");

            return modelAndView;
        }

        //Test phân ngày

        try {
            iCustomerRepository.save(user);
            setDayTimeVaccine(user);
            user.setEnabled(true);
            iCustomerRepository.save(user);
        } catch (Exception e) {
            ModelAndView modelAndView = new ModelAndView("/index/form");
            modelAndView.addObject("user", new Customer());
            modelAndView.addObject("fail", "Đã xảy ra lỗi sắp xếp ngày!!!");
            return modelAndView;
        }

        //        Set encrytedPassword
        String password = user.getEncrytedPassword();
        String encrytedPassword = encrytePassword(password);
        user.setPassword(encrytedPassword);
        try {
            iCustomerRepository.save(user);
        } catch (Exception e) {
            ModelAndView modelAndView = new ModelAndView("/index/form");
            modelAndView.addObject("user", new Customer());
            modelAndView.addObject("fail", "Số chứng minh nhân dân đã tồn tại!!!");
            return modelAndView;
        }
        try {
            //        Thêm quyền USER
            Customer_Role userRole = new Customer_Role();
            userRole.setAppUser(user);
            Role appRole = new Role();
            appRole.setRoleId(1L);
            userRole.setAppRole(appRole);
            iCustomerRoleRepository.save(userRole);

            //        Thêm một quyền ADMIN và DOCTOR
            appRole.setRoleId(2L);
            iCustomerRoleRepository.save(new Customer_Role(user, appRole));
            appRole.setRoleId(3L);
            iCustomerRoleRepository.save(new Customer_Role(user, appRole));

        } catch (Exception e) {
            ModelAndView modelAndView = new ModelAndView("/index/form");
            modelAndView.addObject("user", new Customer());
            modelAndView.addObject("fail", "Oh no! Có vấn đề về cơ sở dữ liệu!");
            return modelAndView;
        }

        ModelAndView modelAndView = new ModelAndView("/index/form");
        modelAndView.addObject("user", new Customer());

        //  Gửi email đa luồng
//        if (user.getEmail() != null) {
//            thread1.start();
//        }
        Vaccine vaccine = iVaccineRepository.findById(user.getVaccine().getId()).get();
        vaccine.setRegister_amount(vaccine.getRegister_amount()-1);
        iVaccineRepository.save(vaccine);
        modelAndView.addObject("fail", "Vui lòng kiểm tra email để xác minh tài khoản!");
//            Đóng luồng
        //        thread1.currentThread().interrupt();
        return modelAndView;
    }

    @GetMapping("/verify")
    public ModelAndView verifyUser(@Param("code") String code) {
        Customer customer = iCustomerRepository.findByVerificationCode(code);
        if (customerServiceVerifyAccount.isVerify(code)) {
            if (customer.getHealthy_status() == 1 || customer.getHealthy_status() == 2) {
                try {
                    setDayTimeVaccine(customer);
                } catch (Exception e) {
                    ModelAndView modelAndView = new ModelAndView("/index/form");
                    modelAndView.addObject("user", new Customer());
                    modelAndView.addObject("fail", "Đã xảy ra lỗi sắp xếp ngày!!!");
                    return modelAndView;
                }
            }
            ModelAndView modelAndView = new ModelAndView("/index/form");
            modelAndView.addObject("user", new Customer());
            modelAndView.addObject("createDone", "Chúc mừng bạn đã đăng ký tài khoản thành công!");
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/index/form");
            modelAndView.addObject("user", new Customer());
            modelAndView.addObject("fail", "Xác minh tài khoản thất bại :((");
            return modelAndView;
        }
    }


    @GetMapping("/403")
    public ModelAndView errorPage() {
        ModelAndView modelAndView = new ModelAndView("/security/403");
        modelAndView.addObject("user", new Customer());
        return modelAndView;
    }

    //    Lấy lại mật khẩu!!!
    @GetMapping("/forgot-password")
    public ModelAndView forgotPassword() {
        ModelAndView modelAndView = new ModelAndView("/security/forgotPassword");

        return modelAndView;
    }

    @PostMapping("/get-password")
    public ModelAndView getPassword(@RequestParam(value = "CMND", required = false) String CMND,
                                    @RequestParam(value = "email", required = false) String email,
                                    HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("/security/forgotPassword");
        Customer user = iCustomerRepository.findByUserCMND(CMND);
        if (user != null && user.getEmail().equals(email)) {
            modelAndView.addObject("msg", "Kiểm tra mail để lấy lại mật khẩu!");
            //      Tạo mã ngẫu nhiên
            String randomCode = RandomString.make(64);
            user.setVerificationCode(randomCode);
            iCustomerRepository.save(user);
            //      Tạo link email
            String link = getSiteURL(request) + "/set-password/" + user.getVerificationCode();
            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    getPasswordByMail(user.getCustomer_name(), user.getEmail(), link);
                }
            });
            thread1.start();

            return modelAndView;
        } else {
            modelAndView.addObject("msg", "Tài khoản không tồn tại!!!");
            return modelAndView;
        }
    }

    public void getPasswordByMail(String name, String email, String link) {
        MimeMessage msg = mailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(msg, true, "UTF-8");
            helper.setSubject("Tạo mật khẩu mới");
            helper.setFrom("boyte.vaccine.covid@gmail.com");
            helper.setTo(email);

            MailText mailText = new MailText(name, link);

            helper.setText(mailText.getPassword(), true);
            mailSender.send(msg);
        } catch (Exception e) {
            System.err.println("Loi roi` part 2~~~~~~~~~~~~~~~~");
        }
    }

    @GetMapping("/set-password/{randomCode}")
    public ModelAndView setNewPassword(@PathVariable String randomCode) {

        ModelAndView modelAndView = new ModelAndView("/security/setNewPassword");
        // Bỏ vào form tàn hình
        modelAndView.addObject("userInfo", randomCode);
        return modelAndView;
    }

    @PostMapping("/set-new-password")
    public ModelAndView setNewPassword2(@RequestParam("CMND") String randomCode,
                                        @RequestParam("password") String newPassword) {
//        // cmnd là bằng với token trong form tàn hình
        System.out.println("CMND is: " + randomCode);
        ModelAndView modelAndView = new ModelAndView("/security/setNewPassword");
        try {
            Customer user = iCustomerRepository.findByVerificationCode(randomCode);
            user.setPassword(encrytePassword(newPassword));
            user.setVerificationCode(null);
            iCustomerRepository.save(user);
        } catch (Exception e) {
            modelAndView.addObject("msg", "Oh no! Đã có lỗi xảy ra!");
            return modelAndView;
        }
        modelAndView.addObject("msg", "Mật khẩu đã thay đổi thành công!");
        return modelAndView;
    }

    public int setStatus(Customer user) {
//        1,2 ok
        int status;

        if (user.getHealthy_info() != null) {
            String[] arr = user.getHealthy_info().split(",");
            if (arr.length > 1 || user.getAge() < 16 || user.getAge() > 65) {
                status = 3;
            } else if (arr.length == 1 && user.getAge() >= 16 && user.getAge() <= 65) {
                status = 1;
            } else {
                status = 2;
            }
        } else {
            if (user.getAge() >= 16 && user.getAge() <= 65) {
                status = 2;
            } else {
                status = 3;
            }
        }
        return status;
    }

    static int countTime = 0;
    static int oneDayDone = 0;

    static int setPeoplePerHour = 1;
    static int setToChangeDay = setPeoplePerHour * 4;

    static String timeStart = "";

    public void setDayTimeStart(Long id_destination) {
        Optional<Destination> dayTimeStart = iDestinationRepository.findById(id_destination);
        setPeoplePerHour = dayTimeStart.get().getPeople_perHour();
        timeStart = dayTimeStart.get().getDate_start();
        setToChangeDay = setPeoplePerHour * 4;

    }

    public void setDayTimeVaccine(Customer customer) {
        Long destination_id = customer.getDestination().getId();
        //      get maxDay, maxTime from db
        String str = iCustomerRepository.getMaxDayFromData(destination_id) + iCustomerRepository.getMaxTimeFromData(destination_id);
        int countMaxTime = iCustomerRepository.countMaxTimeInDay(destination_id);
        int countMaxDay = iCustomerRepository.countMaxDayToNext(destination_id);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

//       Set day to start
        if (str.equals("nullnull")) {
            str = timeStart + "08:00";
        }

        LocalDateTime currentDateTime = LocalDateTime.parse(str, formatter);

        //      Divide date to time
//        CHÚ Ý CÓ DẤU " " CUỐI NGÀY
        DateTimeFormatter formatterDay = DateTimeFormatter.ofPattern("dd-MM-yyyy ");
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH:mm");
        //        Set 1 day with 8h,10h,14h,16h

//            lấy từ db, đếm số giờ để chuyển
        countTime = countMaxTime;

        if (countMaxTime == setPeoplePerHour) {
//            lấy từ db, chuyển giờ liền
            countTime = setPeoplePerHour;
        }
        if (countMaxDay == setToChangeDay) {
//           lấy từ db, đếm số lần để chuyển ngày
            oneDayDone = setToChangeDay;
        }
        //        Số mũi tiêm trong một ngày, cứ thế nhân lên
        if (oneDayDone == setToChangeDay) {
            currentDateTime = currentDateTime.plusDays(1);
            currentDateTime = currentDateTime.minusHours(8);
            oneDayDone = 0;
            countTime = 0;
        }
        //  Mấy tk một giờ, ở đây là 2, 2 tk tăng lên 6h
        if (countTime == setPeoplePerHour) {
            currentDateTime = currentDateTime.plusHours(2);
            if (currentDateTime.getHour() == 12) {
                currentDateTime = currentDateTime.plusHours(2);
            }
            countTime = 0;
//  Set giá trị cho từng tk
        }
        while (countTime < setPeoplePerHour) {
            String formattedDate = currentDateTime.format(formatterDay);
            String formattedTime = currentDateTime.format(formatterTime);
            customer.setTime_vaccine(formattedTime);
            customer.setDate_vaccine(formattedDate);
            iCustomerRepository.save(customer);
            countTime++;
            oneDayDone++;
            return;
        }
    }

    // Ma~ hoa mat khau~
    public static String encrytePassword(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
}
