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
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
import java.util.*;
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

    //        X??? l?? l???y ng??y hi???n t???i
    LocalDate localDate = LocalDate.now();
    String[] day = localDate.toString().split("-");
    String currentDay = day[2] + "-" + day[1] + "-" + day[0] + " ";


    @GetMapping
    public ModelAndView home(HttpServletRequest request, Principal principal) {
        setOffDestination();
        if (request.isUserInRole("ROLE_ADMIN")) {
            ModelAndView modelAndView = new ModelAndView("admin/dashBoar");
            String userName = principal.getName();
            Customer user = iCustomerRepository.findByUserCMND(userName);
            modelAndView.addObject("userInfo", user);
            return modelAndView;
        }
        if (request.isUserInRole("ROLE_DOCTOR")) {
            sendEmail2(principal,request);
            String userName = principal.getName();
            Customer user = new Customer();
            user = iCustomerRepository.findByUserCMND(userName);
            // L???y danh s??ch ng??y
            List<String> stringDayList = iCustomerRepository.findDayInOneDestination(user.getDestination().getId());
            //            Ph??n trang
            Page<Customer> customerListIsDone = iCustomerRepository.findCustomerIsDoneInDay(currentDay, user.getDestination().getId(), PageRequest.of(0, 5));
            //          L???y s??? page
            List<Integer> pageNumber = new ArrayList<>();
            for (int i = 0; i < customerListIsDone.getTotalPages(); i++) {
                pageNumber.add(i);
            }
            ModelAndView modelAndView = new ModelAndView("doctor/ListUserIsDone");
            modelAndView.addObject("customerListIsDone", customerListIsDone);
            modelAndView.addObject("customerInfo", user);
            modelAndView.addObject("stringDayList", stringDayList);
            modelAndView.addObject("pageNumber", pageNumber);
            modelAndView.addObject("idDes", user.getDestination().getId());
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

        ModelAndView modelAndView = new ModelAndView("index/home");
        modelAndView.addObject("user", new Customer());
        return modelAndView;

    }
//               <----------------------------- Admin ????ng Nh???p ---------------------------------------->
    @GetMapping("/manage")
    public ModelAndView adminLogin(){
        ModelAndView modelAndView = new ModelAndView("/security/admin_login");
        return modelAndView;
    }
    @GetMapping("/getInfo/{certify}")
    public ModelAndView showInfo(@PathVariable String certify){
        Customer customer = iCustomerRepository.findByVerificationCode(certify);
        ModelAndView modelAndView = new ModelAndView("/user/user_info");
        modelAndView.addObject("userInfo", customer);
        return modelAndView;
    }
    @RequestMapping(value = "/apiID/{id}",  produces = {"application/json", "text/xml"})
    ResponseEntity<Customer> getApiById(@PathVariable Long id){
        return new ResponseEntity<>(iCustomerRepository.findById(id).get(), HttpStatus.OK);
    }

    @GetMapping("/checkRole")
    public ModelAndView checkRoleAndSession(HttpServletRequest request, Principal principal) {
        setOffDestination();
        // N???u c?? remember me
        for (Cookie c : request.getCookies()) {
            if (c.getName().equals("remember-me") || c.getName().equals("JSESSIONID")) {
                //    <----------------------------- Ph??n trang ????ng quy???n ------------------------------>
                if (request.isUserInRole("ROLE_ADMIN")) {
                    ModelAndView modelAndView = new ModelAndView("admin/dashBoar");
                    String userName = principal.getName();
                    Customer user = iCustomerRepository.findByUserCMND(userName);
                    modelAndView.addObject("userInfo", user);
                    HttpSession session = request.getSession(false);
                    return modelAndView;
                }
                if (request.isUserInRole("ROLE_DOCTOR")) {
                    Thread thread2 = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            sendEmail2(principal,request);

                        }
                    });
                    thread2.start();
                    String userName = principal.getName();
                    Customer user = new Customer();
                    user = iCustomerRepository.findByUserCMND(userName);
                    // L???y danh s??ch ng??y
                    List<String> stringDayList = iCustomerRepository.findDayInOneDestination(user.getDestination().getId());
                    //            Ph??n trang
                    Page<Customer> customerListIsDone = iCustomerRepository.findCustomerIsDoneInDay(currentDay, user.getDestination().getId(), PageRequest.of(0, 5));
                    //          L???y s??? page
                    List<Integer> pageNumber = new ArrayList<>();
                    for (int i = 0; i < customerListIsDone.getTotalPages(); i++) {
                        pageNumber.add(i);
                    }
                    ModelAndView modelAndView = new ModelAndView("doctor/ListUserIsDone");
                    modelAndView.addObject("customerListIsDone", customerListIsDone);
                    modelAndView.addObject("customerInfo", user);
                    modelAndView.addObject("stringDayList", stringDayList);
                    modelAndView.addObject("pageNumber", pageNumber);
                    modelAndView.addObject("idDes", user.getDestination().getId());
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
            }
        }
        ModelAndView modelAndView = new ModelAndView("index/home");
        modelAndView.addObject("user", new Customer());
        return modelAndView;
    }

    public void sendEmail2(Principal principal,HttpServletRequest request) {
        String url = getSiteURL(request);
        // Ki???m tra sau khi ti??m 7 ng??y sau th?? nh???n mail
        String dateBefore = LocalDate.now().minusDays(7L).toString();
        Customer customer = iCustomerRepository.findByUserCMND(principal.getName());
        List<Customer> list = iCustomerRepository.ListCustomerInjection2(customer.getDestination().getId());

        if (checkDestinationIsOpen()) {
            for (Customer c : list) {
                String[] arr = c.getDate_vaccine().trim().split("-");
                String date = arr[2] + "-" + arr[1] + "-" + arr[0];
                if (date.compareTo(dateBefore) <= 0  ) {
                    // && Objects.equals(c.getVerificationCode(),null)
                    // g???i mail th??ng b??o ti??m l???n 2
//                    setDayTimeVaccine(c);
//                     iCustomerRepository.save(c);
                    sendMailConfirmTwice(c,url);

                }
            }
        }

    }
    //    <-------------------------------- G???i mail x??c nh???n ti??m l???n 2 ------------------------>
    public void sendMailConfirmTwice(Customer customer, String url) {
        MimeMessage msg = mailSender.createMimeMessage();

        try {
            MimeMessageHelper helper = new MimeMessageHelper(msg, true, "UTF-8");
            helper.setSubject("Th??ng b??o x??c nh???n ti??m ch???ng l???n 2");
            helper.setFrom("boyte.vaccine.covid@gmail.com");
            helper.setTo(customer.getEmail());
            if(Objects.equals(customer.getVerificationCode(),null)){
                String randomCode = RandomString.make(64);
                customer.setVerificationCode(randomCode);
                iCustomerRepository.save(customer);
            }
            //      T???o link email

            String verifyURL =  url+"/getForm/" + customer.getVerificationCode();

            MailText mailText = new MailText(customer.getCustomer_name(),customer.getCMND(),verifyURL);
            helper.setText(mailText.getMailRegisterTwice(), true);
            mailSender.send(msg);

        } catch (Exception e) {
            System.err.println("L???i g???i mail r???i x??c nh???n l???n 2 r???i!!!");
        }
        System.err.println("???? g???i mail x??c nh???n l???n 2!");
    }

    public void setOffDestination() {
        String dateNow = LocalDate.now().toString();
        Iterable<Destination> listDes = iDestinationRepository.findAllOpen();
        for (Destination destination : listDes) {
            String[] arrStart = destination.getDate_start().trim().split("-");
            String dateStart = arrStart[2] + "-" + arrStart[1] + "-" + arrStart[0];
            String[] arrEnd = destination.getDate_end().trim().split("-");
            String dateEnd = arrEnd[2] + "-" + arrEnd[1] + "-" + arrEnd[0];
            if (dateNow.compareTo(dateEnd) > 0 || checkAmountRegisterByDes(destination)) {
                destination.setIsOpen(1);
                iDestinationRepository.save(destination);
            }
        }
    }

    public boolean checkAmountRegisterByDes(Destination destination) {
        Iterable<Customer> iterable = iCustomerRepository.ListCustomerInjectionByDes(destination.getId(), destination.getDate_end());
        int people_perHour = destination.getPeople_perHour();
        if (iterable.spliterator().getExactSizeIfKnown() == people_perHour * 4) {
            return true;
        }
        return false;
    }

    //          <--------------------   Ti??m l???n 2 --------------------------->
    @PostMapping("/registerVaccine2")
    public ModelAndView registerVaccine2(Customer customer) {
        ModelAndView modelAndView = new ModelAndView("/index/form2");
        Customer customer1 = iCustomerRepository.findByUserCMND(customer.getCMND());
        System.out.println(customer.getCMND());

        // L??u ?????a ??i???m m???i v??o li??n ????? ?????m
//        customer1.setDestination2(customer.getDestination());
        customer1.setIsInjection2(1);
        // L???y th??ng tin ?????a ??i???m
        setDayTimeStart(customer1.getDestination().getId());
        // Set ng??y gi??? cho ?????a ??i???m m???i
        setDayTimeVaccine(customer1);
        customer1.setVerificationCode(null);
        iCustomerRepository.save(customer1);

        //Tr??? Vaccine
        Vaccine vaccine = iVaccineRepository.findById(customer1.getVaccine().getId()).get();
        vaccine.setRegister_amount(vaccine.getRegister_amount()-1);
        iVaccineRepository.save(vaccine);
        modelAndView.addObject("msg", "????ng K?? ti??m l???n 2 th??nh c??ng !! ");
        return modelAndView;
    }

    @GetMapping("/getForm/{certify}")
    public ModelAndView showForm2(@PathVariable String certify) {

        Customer customer = iCustomerRepository.findByVerificationCode(certify);
        Vaccine vaccine = iVaccineRepository.findById(customer.getVaccine().getId()).get();
        if(vaccine.getRegister_amount()<=0){
            return new ModelAndView("/security/regisFound");
        }
        ModelAndView modelAndView = new ModelAndView("/index/form2");
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }


    public boolean checkDestinationIsOpen() {
        List<Destination> list = iDestinationRepository.findAllOpen();
        for (Destination d : list) {
            if (d.getIsOpen() == 0) {
                return true;
            }
        }
        return false;
    }

    @GetMapping("/form")
    public ModelAndView showForm() {
        //redirect if amount vaccine ==0
        // Ki???m tra c?? gi?? tr??? hay k
        if (iVaccineRepository.findAll().spliterator().getExactSizeIfKnown() > 0) {
            int sumVaccine = iVaccineRepository.sumVaccine();
            if (sumVaccine <= 0) {
                return new ModelAndView("/security/regisFound");
            }
        }

        ModelAndView modelAndView = new ModelAndView("/index/form");
        modelAndView.addObject("user", new Customer());
        return modelAndView;
    }

    @GetMapping(value = {"/login"})
    public ModelAndView loginPage(HttpServletRequest request, Principal principal) {
        if (request.isUserInRole("ROLE_ADMIN") || request.isUserInRole("ROLE_USER") || request.isUserInRole("ROLE_DOCTOR")) {
//            return v??? trang user l???i
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

    // L???y ?????a ch??? URL trang hi???n t???i
    private String getSiteURL(HttpServletRequest request) {
        String siteURL = request.getRequestURL().toString();
        return siteURL.replace(request.getServletPath(), "");
    }

    @PostMapping("/create")
    public ModelAndView createUser(Customer user, HttpServletRequest request, @RequestParam(name = "g-recaptcha-response") String captchaResponse) throws InterruptedException, ExecutionException {

        //        Recaptcha

        String url = "https://www.google.com/recaptcha/api/siteverify";
        String params = "?secret=6LfXcRMbAAAAAIqUiv2NJ1GA3kjpkt3uTOnCHZrf&response=" + captchaResponse;

        ReCaptchaResponse reCaptchaResponse = restTemplate.exchange(url + params, HttpMethod.POST, null, ReCaptchaResponse.class).getBody();
        if (!reCaptchaResponse.isSuccess()) {
            ModelAndView modelAndView = new ModelAndView("/index/form");
            modelAndView.addObject("user", new Customer());
            modelAndView.addObject("fail", "Vui l??ng ho??n th??nh Captcha!!!");
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
            modelAndView.addObject("fail", "S??? ch???ng minh nh??n d??n ???? t???n t???i!!!");
            return modelAndView;
        }
        // Ki???m tra ???? c?? ??i???m ti??m ???? c?? b???t ?????u ch??a?
        try {
            // T??m kh??ng ra ID c???a ??i???m ti??m
            setDayTimeStart(user.getDestination().getId());
            iCustomerRepository.save(user);
        } catch (Exception e) {
            ModelAndView modelAndView = new ModelAndView("/index/form");
            modelAndView.addObject("user", new Customer());
            modelAndView.addObject("fail", "Chi???n d???ch ch??a b???t ?????u, vui l??ng quay l???i sau!");

            return modelAndView;
        }

        //       set age and status
        user.setAge(java.time.LocalDate.now().getYear() - user.getAge());
//        user.setHealthy_status(2);
        user.setHealthy_status(setStatus(user));
        if (user.getHealthy_status() == 1 || user.getHealthy_status() == 2) {
            try {
                setDayTimeVaccine(user);
                iCustomerRepository.save(user);
            } catch (Exception e) {
                ModelAndView modelAndView = new ModelAndView("/index/form");
                modelAndView.addObject("user", new Customer());
                modelAndView.addObject("fail", "???? x???y ra l???i h??? th???ng!!!");
                return modelAndView;
            }
        }


//                G???i mail x??c minh t??i kho???n
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                customerServiceVerifyAccount.sendEmailVerifyAccount("boyte.vaccine.covid@gmail.com", user,getSiteURL(request));
            }
        });




        //Test ph??n ng??y

//        try {
//
//            setDayTimeVaccine(user);
//            user.setEnabled(true);
//            iCustomerRepository.save(user);
//        } catch (Exception e) {
//            ModelAndView modelAndView = new ModelAndView("/index/form");
//            modelAndView.addObject("user", new Customer());
//            modelAndView.addObject("fail", "???? x???y ra l???i s???p x???p ng??y!!!");
//            return modelAndView;
//        }


        try {
            //        Th??m quy???n USER
            Customer_Role userRole = new Customer_Role();
            userRole.setAppUser(user);
            Role appRole = new Role();
            appRole.setRoleId(1L);
            userRole.setAppRole(appRole);
            iCustomerRoleRepository.save(userRole);

            //        Th??m m???t quy???n ADMIN v?? DOCTOR
//            appRole.setRoleId(2L);
//            iCustomerRoleRepository.save(new Customer_Role(user, appRole));
//            appRole.setRoleId(3L);
//            iCustomerRoleRepository.save(new Customer_Role(user, appRole));

        } catch (Exception e) {
            ModelAndView modelAndView = new ModelAndView("/index/form");
            modelAndView.addObject("user", new Customer());
            modelAndView.addObject("fail", "Oh no! C?? v???n ????? v??? c?? s??? d??? li???u!");
            return modelAndView;
        }

        ModelAndView modelAndView = new ModelAndView("/index/form");
        modelAndView.addObject("user", new Customer());

        //  G???i email ??a lu???ng
        if (user.getEmail() != null) {
            thread1.start();
        }
        if (user.getDate_vaccine() != null) {
            Vaccine vaccine = iVaccineRepository.findById(user.getVaccine().getId()).get();
            vaccine.setRegister_amount(vaccine.getRegister_amount() - 1);
            iVaccineRepository.save(vaccine);
        }
        modelAndView.addObject("fail", "Vui l??ng ki???m tra email ????? nh???n l???ch ti??m!");
//            ????ng lu???ng
        //        thread1.currentThread().interrupt();
        return modelAndView;
    }

    @GetMapping("/verify")
    public ModelAndView verifyUser(@Param("code") String code) {
        Customer customer = iCustomerRepository.findByVerificationCode(code);
        if (customerServiceVerifyAccount.isVerify(code)) {

            ModelAndView modelAndView = new ModelAndView("/index/form");
            modelAndView.addObject("user", new Customer());
            modelAndView.addObject("createDone", "Ch??c m???ng b???n ???? ????ng k?? t??i kho???n th??nh c??ng!");
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/index/form");
            modelAndView.addObject("user", new Customer());
            modelAndView.addObject("fail", "X??c minh t??i kho???n th???t b???i :((");
            return modelAndView;
        }
    }


    @GetMapping("/403")
    public ModelAndView errorPage() {
        ModelAndView modelAndView = new ModelAndView("/security/403");
        modelAndView.addObject("user", new Customer());
        return modelAndView;
    }

    //    L???y l???i m???t kh???u!!!
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
            modelAndView.addObject("msg", "Ki???m tra mail ????? l???y l???i m???t kh???u!");
            //      T???o m?? ng???u nhi??n
            if(Objects.equals(user.getVerificationCode(),null)){
                String randomCode = RandomString.make(64);
                user.setVerificationCode(randomCode);
                iCustomerRepository.save(user);
            }
            //      T???o link email
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
            modelAndView.addObject("msg", "T??i kho???n kh??ng t???n t???i!!!");
            return modelAndView;
        }
    }

    public void getPasswordByMail(String name, String email, String link) {
        MimeMessage msg = mailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(msg, true, "UTF-8");
            helper.setSubject("T???o m???t kh???u m???i");
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
        // B??? v??o form t??n h??nh
        modelAndView.addObject("userInfo", randomCode);
        return modelAndView;
    }

    @PostMapping("/set-new-password")
    public ModelAndView setNewPassword2(@RequestParam("CMND") String randomCode,
                                        @RequestParam("password") String newPassword) {
//        // cmnd l?? b???ng v???i token trong form t??n h??nh
        System.out.println("CMND is: " + randomCode);
        ModelAndView modelAndView = new ModelAndView("/security/setNewPassword");
        try {
            Customer user = iCustomerRepository.findByVerificationCode(randomCode);
            user.setPassword(encrytePassword(newPassword));
            user.setVerificationCode(null);
            user.setEnabled(true);
            iCustomerRepository.save(user);
        } catch (Exception e) {
            modelAndView.addObject("msg", "Oh no! ???? c?? l???i x???y ra!");
            return modelAndView;
        }
        modelAndView.addObject("msg", "M???t kh???u ???? thay ?????i th??nh c??ng!");
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

    // BUG , FIX TOMORROW
    static int setPeoplePerHour;

    static int setToChangeDay;

    static String timeStart = "";

    public void setDayTimeStart(Long id_destination) {
        Optional<Destination> dayTimeStart = iDestinationRepository.findById(id_destination);
        setPeoplePerHour = dayTimeStart.get().getPeople_perHour();
        timeStart = dayTimeStart.get().getDate_start();
        setToChangeDay = setPeoplePerHour * 4;
    }

    public void setDayTimeVaccine(Customer customer) {
        if(customer.getDestination2()==null){
            setPeoplePerHour = iDestinationRepository.findById(customer.getDestination().getId()).get().getPeople_perHour();
        }
        else{
            setPeoplePerHour = iDestinationRepository.findById(customer.getDestination2().getId()).get().getPeople_perHour();
        }
        setToChangeDay = setPeoplePerHour*4;
        Long destination_id;
        if (!Objects.equals(customer.getDestination2(), null)) {
            destination_id = customer.getDestination2().getId();
        } else {
            destination_id = customer.getDestination().getId();
        }


        //      get maxDay, maxTime from db l???n 1
//        String str = iCustomerRepository.getMaxDayFromData(destination_id) + iCustomerRepository.getMaxTimeFromData(destination_id);
        int countMaxTime = 0;
        int countMaxDay = 0;
        // T???ng h???p s??? ng??y gi??? 2 c???t
        int countTime1 = iCustomerRepository.countMaxTimeInDay(destination_id);
        int countDay1 = iCustomerRepository.countMaxDayToNext(destination_id);
        String getDayMax1 = iCustomerRepository.getMaxDayFromData(destination_id);
        String getTimeMax1 = iCustomerRepository.getMaxTimeFromData(destination_id);

        int countDay2 = iCustomerRepository.countMaxDayToNext_2(destination_id);
        int countTime2 = iCustomerRepository.countMaxTimeInDay_2(destination_id);
        String getDayMax2 = iCustomerRepository.getMaxDayFromData_2(destination_id);
        String getTimeMax2 = iCustomerRepository.getMaxTimeFromData_2(destination_id);

        String str = "";

        System.out.println("Destination ID : "+destination_id);
        System.out.println("countTime1 : "+countTime1);
        System.out.println("countDay1 : "+countDay1);
        System.out.println("DayMax1 : "+getDayMax1);
        System.out.println("timeMax1 : "+getTimeMax1);
        System.out.println("======================");
        System.out.println("countTime2 : "+countTime2);
        System.out.println("countDay2 : "+countDay2);
        System.out.println("DayMax2 : "+getDayMax2);
        System.out.println("timeMax2 : "+getTimeMax2);
        System.out.println("=================");

        if (Objects.equals(getDayMax1, null)) {
            getDayMax1 = timeStart;
            getTimeMax1 = "08:00";
            str = timeStart + "08:00";
        } else {
            str = getDayMax1 + getTimeMax1;
        }


        if (Objects.equals(getDayMax2, null)) {
            getTimeMax2 = "000000";
            getDayMax2 = "000000";
        }
        String maxTime = "";

        if (!Objects.equals(getDayMax2, null)) {
            // T???ng h???p ng??y gi??? 2 c???t
            String maxDay = "";
            if (getDayMax1.compareTo(getDayMax2) > 0) {
                countMaxDay = countDay1;
                maxDay = getDayMax1;
                maxTime = getTimeMax1;

            }
            else if (getDayMax1.compareTo(getDayMax2) < 0) {
                maxDay = getDayMax2;
                maxTime = getTimeMax2;
                countMaxDay = countDay2;
            } else {
                maxDay = getDayMax2;
                countMaxDay = countDay1 + countDay2;
                if (getTimeMax1.compareTo(getTimeMax2) > 0){
                    maxTime = getTimeMax1;
                }else {
                    maxTime = getTimeMax2;
                }

            }
            // ?????m s??? gi??? l???n nh???t
            if (getTimeMax1.compareTo(getTimeMax2) > 0) {
                countMaxTime = countTime1;
            } else if (getTimeMax1.compareTo(getTimeMax2) < 0) {
                countMaxTime = countTime2;
            } else {
                countMaxTime = countTime1 + countTime2;
            }

            str = maxDay + maxTime;

        }


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime currentDateTime = LocalDateTime.parse(str, formatter);

        //      Divide date to time
//        CH?? ?? C?? D???U " " CU???I NG??Y
        DateTimeFormatter formatterDay = DateTimeFormatter.ofPattern("dd-MM-yyyy ");
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH:mm");
        //        Set 1 day with 8h,10h,14h,16h

//            l???y t??? db, ?????m s??? gi??? ????? chuy???n
        countTime = countMaxTime;

        if (countMaxTime == setPeoplePerHour) {
//            l???y t??? db, chuy???n gi??? li???n
            countTime = setPeoplePerHour;
        }

        if (countMaxDay == setToChangeDay) {
//           l???y t??? db, ?????m s??? l???n ????? chuy???n ng??y
            oneDayDone = setToChangeDay;
        }
        //        S??? m??i ti??m trong m???t ng??y, c??? th??? nh??n l??n
        if (oneDayDone == setToChangeDay) {
            System.out.println(oneDayDone +" " + setToChangeDay);
            System.out.println("here ...");
            currentDateTime = currentDateTime.plusDays(1);
            currentDateTime = currentDateTime.minusHours(8);
            oneDayDone = 0;
            countTime = 0;
        }
        //  M???y tk m???t gi???, ??? ????y l?? 2, 2 tk t??ng l??n 6h
        if (countTime == setPeoplePerHour) {
            currentDateTime = currentDateTime.plusHours(2);
            if (currentDateTime.getHour() == 12) {
                currentDateTime = currentDateTime.plusHours(2);
            }
            countTime = 0;
            //  Set gi?? tr??? cho t???ng tk
        }
        while (countTime < setPeoplePerHour) {
            String formattedDate = currentDateTime.format(formatterDay);
            String formattedTime = currentDateTime.format(formatterTime);

            if (Objects.equals(customer.getDate_vaccine(), null)) {
                customer.setTime_vaccine(formattedTime);
                customer.setDate_vaccine(formattedDate);
            } else {
                customer.setTime_vaccine2(formattedTime);
                customer.setDate_vaccine2(formattedDate);
            }
            System.out.println(customer.toString());
            iCustomerRepository.save(customer);
            // Bug Here ..
//            countTime++;
//            oneDayDone++;
            return;
        }
    }

    // Ma~ hoa mat khau~
    public static String encrytePassword(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
}
