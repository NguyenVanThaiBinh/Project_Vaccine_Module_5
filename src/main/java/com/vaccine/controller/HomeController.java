package com.vaccine.controller;


import com.vaccine.model.*;
import com.vaccine.repository.ICustomerRepository;
import com.vaccine.repository.ICustomerRoleRepository;
import com.vaccine.repository.IDestinationRepository;
import com.vaccine.repository.IVaccineRepository;
import com.vaccine.service.CustomerServiceVerifyAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.query.Param;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import springfox.documentation.RequestHandler;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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


    @ModelAttribute("destinations")
    public List<Destination> destinationList() {
        return iDestinationRepository.findAllOpen();
    }

    @ModelAttribute("vaccineList")
    public List<Vaccine> vaccineList() {
        return iVaccineRepository.findAll();
    }


    @GetMapping
    public ModelAndView home(HttpServletRequest request, Principal principal) {
        if (request.isUserInRole("ROLE_DOCTOR")) {
            String userName = principal.getName();
            Customer user = new Customer();
            user = iCustomerRepository.findByUserCMND(userName);
//            Phân trang
            Page<Customer> customerListIsDone = iCustomerRepository.findCustomerIsDoneInDay("01-10-2021 ", user.getDestination().getId(), PageRequest.of(0, 5));
//          Lấy số page
            List<Integer> pageNumber = new ArrayList<>();
            for (int i = 0; i < customerListIsDone.getTotalPages(); i++) {
                pageNumber.add(i);
            }

            ModelAndView modelAndView = new ModelAndView("doctor/ListUserIsDone");
            modelAndView.addObject("customerListIsDone", customerListIsDone);
            modelAndView.addObject("customerInfo", user);
            modelAndView.addObject("pageNumber", pageNumber);
            modelAndView.addObject("maxPage",customerListIsDone.getTotalPages());
            return modelAndView;
        }
        if (request.isUserInRole("ROLE_USER")) {
            ModelAndView modelAndView = new ModelAndView("index/home");
            String userName = principal.getName();
            Customer user = iCustomerRepository.findByUserCMND(userName);
            modelAndView.addObject("userInfo", user.getCustomer_name());
        }
        if (request.isUserInRole("ROLE_ADMIN")) {
            ModelAndView modelAndView = new ModelAndView("admin/dashBoar");
            String userName = principal.getName();
            Customer user = iCustomerRepository.findByUserCMND(userName);
            modelAndView.addObject("userInfo", user.getCustomer_name());
        }
        ModelAndView modelAndView = new ModelAndView("index/home");
        modelAndView.addObject("user", new Customer());
        return modelAndView;
    }

    @GetMapping("/form")
    public ModelAndView showForm() {
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
    public ModelAndView createUser(Customer user, HttpServletRequest request) throws InterruptedException, ExecutionException
//            ,@RequestParam(name ="g-recaptcha-response") String captchaResponse)
    {
        //        Recaptcha
//        String url = "https://www.google.com/recaptcha/api/siteverify";
//        String params ="?secret=6LfXcRMbAAAAAIqUiv2NJ1GA3kjpkt3uTOnCHZrf&response="+captchaResponse;
//
//        ReCaptchaResponse reCaptchaResponse = restTemplate.exchange(url+params, HttpMethod.POST,null,ReCaptchaResponse.class).getBody();
//        if(!reCaptchaResponse.isSuccess()){
//            ModelAndView modelAndView = new ModelAndView("/index/form");
//            modelAndView.addObject("user", new User());
//            modelAndView.addObject("fail", "Vui lòng hoàn thành Captcha!!!");
//            return modelAndView;
//        }

        //       set age and status
        user.setAge(java.time.LocalDate.now().getYear() - user.getAge());
        user.setHealthy_status(2);
//        user.setHealthy_status(setStatus(user));


//                Gửi mail xác minh tài khoản
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                customerServiceVerifyAccount.sendEmailVerifyAccount("boyte.vaccine.covid@gmail.com", user,getSiteURL(request));
            }
        });

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
        iCustomerRepository.save(user);
        try {
            setDayTimeVaccine(user);
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
            //        Thêm một quyền ADMIN
            appRole.setRoleId(2L);
            iCustomerRoleRepository.save(new Customer_Role(user, appRole));
            //        Thêm một quyền DOCTOR
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
        if (user.getEmail() != null) {
            thread1.start();
        }
        modelAndView.addObject("fail", "Vui lòng kiểm tra email để xác minh tài khoản!");
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
                                    @RequestParam(value = "email", required = false) String email) {
        ModelAndView modelAndView = new ModelAndView("/security/forgotPassword");
        Customer user = iCustomerRepository.findByUserCMND(CMND);
        if (user != null && user.getEmail().equals(email)) {
            modelAndView.addObject("msg", "Kiểm tra mail để lấy lại mật khẩu!");

//            Tuỳ trường hợp
//            String link1 = "https://vaccinevietnam.herokuapp.com/set-password/" + user.getCMND();
            String link = "http://localhost:8080/set-password/" + user.getCMND();
            getPasswordByMail(user.getCustomer_name(), user.getEmail(), link);
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

    @GetMapping("/set-password/{token}")
    public ModelAndView setNewPassword(@PathVariable String token) {

        ModelAndView modelAndView = new ModelAndView("/security/setNewPassword");
        modelAndView.addObject("userInfo", token);
        return modelAndView;
    }

    @PostMapping("/set-new-password")
    public ModelAndView setNewPassword2(@RequestParam("CMND") String CMND,
                                        @RequestParam("password") String newPassword) {
        ModelAndView modelAndView = new ModelAndView("/security/setNewPassword");
        Customer user = iCustomerRepository.findByUserCMND(CMND);
        String lastPassword = user.getPassword();
        if (user.getPassword().equals(lastPassword)) {
            user.setPassword(encrytePassword(newPassword));
            iCustomerRepository.save(user);
            modelAndView.addObject("msg", "Mật khẩu đã thay đổi thành công!");
        } else {
            modelAndView.addObject("msg", "Oh no! Đã có lỗi xảy ra!");
        }


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
