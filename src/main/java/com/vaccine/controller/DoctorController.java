package com.vaccine.controller;

import com.vaccine.model.Customer;
import com.vaccine.model.MailText;
import com.vaccine.model.Vaccine;
import com.vaccine.repository.ICustomerRepository;
import com.vaccine.repository.IVaccineRepository;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.security.Principal;
import java.time.LocalDate;
import java.util.*;

@RestController
@RequestMapping(value = "/doctor")
public class DoctorController {

    @Autowired
    ICustomerRepository icustomerRepository;

    @Autowired
    JavaMailSender mailSender;

    @Autowired
    IVaccineRepository iVaccineRepository;

    Map<Long,Integer> mapCountDone = new HashMap<>();


    //        Xử lý lấy ngày hiện tại
    LocalDate localDate = LocalDate.now();
    String[] day = localDate.toString().split("-");
    String currentDay = day[2] + "-" + day[1] + "-" + day[0] + " ";

    @GetMapping("/full-api/{id}")
    public ResponseEntity<List<Customer>> fullApi(@PathVariable Long id){
        return new ResponseEntity<>(icustomerRepository.ListCustomerIsOneInDay(currentDay,id), HttpStatus.OK);
    }

    @GetMapping
    public ModelAndView showFormListDone(HttpServletRequest request, Principal principal) {
//        Kiểm tra tài khoản và truy cập vào điểm tiêm tương ứng
        if (request.isUserInRole("ROLE_ADMIN") || request.isUserInRole("ROLE_DOCTOR")) {
            String userName = principal.getName();
            Customer user = new Customer();
            user = icustomerRepository.findByUserCMND(userName);
            // Lấy danh sách ngày
            List<String> stringDayList = icustomerRepository.findDayInOneDestination(user.getDestination().getId());

            //            Phân trang
            Page<Customer> customerListIsDone = icustomerRepository.findCustomerIsDoneInDay(currentDay, user.getDestination().getId(), PageRequest.of(0, 5));
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
        } else {
            ModelAndView modelAndView = new ModelAndView("index/home");
            return modelAndView;
        }
    }



    @RequestMapping("/done/{id}")
    public void done(@PathVariable Long id) {
        Vaccine vaccine = icustomerRepository.findById(id).get().getVaccine();
        if(!mapCountDone.containsKey(vaccine.getId())){
            mapCountDone.put(vaccine.getId(),1);
        }
        else{
            mapCountDone.put(vaccine.getId(),mapCountDone.get(vaccine.getId())+1);
        }
    }
    @RequestMapping("/undone/{id}")
    public void unDone(@PathVariable Long id){
        Vaccine vaccine = icustomerRepository.findById(id).get().getVaccine();
        if(!mapCountDone.containsKey(vaccine.getId())){
            mapCountDone.put(vaccine.getId(),-1);
        }
        else{
            mapCountDone.put(vaccine.getId(),mapCountDone.get(vaccine.getId())-1);
        }
    }

    @ResponseBody
    @RequestMapping(path = "/setInjectToNone", method = RequestMethod.POST)
    public void setInjectToNone(@RequestBody Long[] itemIDs, Principal principal) {
        //          Set lại mấy thằng chưa đến tiêm
        for (Long id_customer : itemIDs) {
            Customer customer = icustomerRepository.findById(id_customer).get();
            if(customer.getIsInjection2()==0){
                customer.setIsInjection(0);
            }
            else{
                customer.setIsInjection2(2);
            }
            icustomerRepository.save(customer);
        }
    }

    @ResponseBody
    @RequestMapping(path = "/setInjectToDone", method = RequestMethod.POST)
    public void setInjectToDone(@RequestBody Long[] itemIDs, Principal principal, Pageable pageable,HttpServletRequest request) {

        Iterable<Vaccine> listVaccine = iVaccineRepository.findAll();
        for (Long id_customer : itemIDs) {
            Customer customer = icustomerRepository.findById(id_customer).get();



            if(customer.getIsInjection2()==0){
                //            Gửi mail xác nhận lan 1

//                sendMailToCustomerCame(customer);
                customer.setIsInjection(1);
            }
            else{
                sendMailToCustomerCame_2(customer,getSiteURL(request));

                customer.setIsInjection2(3);
            }

            icustomerRepository.save(customer);

        }
        Customer customer = icustomerRepository.findByUserCMND(principal.getName());
        Long idDes = customer.getDestination().getId();
        mapCountDone.forEach((k,v) -> {
            Vaccine vaccine = iVaccineRepository.findById(k).get();
            vaccine.setVaccine_amount(vaccine.getVaccine_amount()-v);
            iVaccineRepository.save(vaccine);
        });
        for(Vaccine vaccine:listVaccine){
            int count = 0 ;
            String dateNow = LocalDate.now().toString();
            List<Customer> list = icustomerRepository.ListCustomerByVaccine(vaccine.getId());
            for(Customer c:list){
                if(c.getDate_vaccine2()==null){
                    String[] arr = c.getDate_vaccine().trim().split("-");
                    String date = arr[2]+"-"+arr[1]+"-"+arr[0];
                    if(date.compareTo(dateNow)>0){
                        count++;
                    }
                }
                else{
                    String[] arr = c.getDate_vaccine2().trim().split("-");
                    String date = arr[2]+"-"+arr[1]+"-"+arr[0];
                    if(date.compareTo(dateNow)>0){
                        count++;
                    }
                }
            }
            vaccine.setRegister_amount(vaccine.getVaccine_amount()-Integer.parseInt(String.valueOf(count)));
            iVaccineRepository.save(vaccine);
        }
        mapCountDone.clear();

    }



    @ResponseBody
    @RequestMapping(path = "/changePage", method = RequestMethod.POST)
    public Page<Customer> changePage(@RequestBody String[] pageNumber, Principal principal) {
//        Lấy lại quyền để lấy ID
        String userName = principal.getName();

        Customer customer1 = icustomerRepository.findByUserCMND(userName);
//        Lấy danh sách
        Page<Customer> customerListIsDone = icustomerRepository.findCustomerIsDoneInDay(currentDay, customer1.getDestination().getId(), PageRequest.of(Integer.parseInt(pageNumber[0]), 5));
        return customerListIsDone;
    }

    @ResponseBody
    @RequestMapping(path = "/search/{key}", method = RequestMethod.POST)
    public Page<Customer> searchByCMND(@PathVariable String key, Principal principal, @RequestBody String[] pageNumber) {
//        System.out.println( "Key is: "+key);
//        System.out.println( "Page currently: "+pageNumber[0]);
//        Lấy lại quyền để lấy ID
        String userName = principal.getName();
        Customer customer1 = icustomerRepository.findByUserCMND(userName);
//        Lấy danh sách
        Page<Customer> searchResultCustomer = icustomerRepository.searchCustomerByCMND(currentDay, customer1.getDestination().getId(), key, PageRequest.of(0, Integer.MAX_VALUE));
        if (key.equals("binhhu")) {
            Page<Customer> customerListIsDone = icustomerRepository.findCustomerIsDoneInDay(currentDay, customer1.getDestination().getId(), PageRequest.of(0, 5));
            return customerListIsDone;
        }
        return searchResultCustomer;
    }

    @ResponseBody
    @RequestMapping(path = "/getCustomerByDay/{day}", method = RequestMethod.POST)
    public Page<Customer> getCustomerByDay(@PathVariable String day, Principal principal) {
        //        Lấy lại quyền để lấy ID
        String userName = principal.getName();
        Customer customer1 = icustomerRepository.findByUserCMND(userName);
        // Nếu không có giá trị, tức bằng -1
        if (day.equals("-1")) {
            Page<Customer> customerListIsDone = icustomerRepository.findCustomerIsDoneInDay(currentDay, customer1.getDestination().getId(), PageRequest.of(0, 5));
            return customerListIsDone;
        }
//        Lấy danh sách
        Page<Customer> customerListIsDone = icustomerRepository.findCustomerIsDoneInDay(day+" ", customer1.getDestination().getId(), PageRequest.of(0, Integer.MAX_VALUE));
//        Page<Customer> searchResultCustomer = icustomerRepository.searchCustomerByCMND(currentDay,customer1.getDestination().getId(), key,PageRequest.of(0, Integer.MAX_VALUE));
//        if(key.equals("binhhu")){
//            Page<Customer> customerListIsDone = icustomerRepository.findCustomerIsDoneInDay(currentDay,customer1.getDestination().getId(), PageRequest.of(Integer.parseInt(pageNumber[0]), 5));
//            return  customerListIsDone;
//        }
        return customerListIsDone;
    }


    //    <-------------------------------- Gửi mail chứng nhận ------------------------>
    // Lấy địa chỉ URL trang hiện tại
    private String getSiteURL(HttpServletRequest request) {
        String siteURL = request.getRequestURL().toString();
        return siteURL.replace(request.getServletPath(), "");
    }

    public void sendMailToCustomerCame_2(Customer customer,String url) {
        MimeMessage msg = mailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(msg, true, "UTF-8");
            helper.setSubject("Xác nhận hoàn thành tiêm chủng");
            helper.setFrom("boyte.vaccine.covid@gmail.com");
            helper.setTo(customer.getEmail());

            if(Objects.equals(customer.getVerificationCode(),null)){
                String randomCode = RandomString.make(64);
                customer.setVerificationCode(randomCode);
                icustomerRepository.save(customer);
            }
            //      Tạo link email

            String verifyURL = "https://api.qrserver.com/v1/create-qr-code/?size=150x150&data="+ url+"/getInfo/" + customer.getVerificationCode();
            MailText mailText = new MailText(customer.getCustomer_name(), customer.getCMND(), customer.getIsInjection(),verifyURL);
            String path1 = "src\\main\\resources\\static\\ChungNhanTiemChung.txt";
            FileSystemResource file2 = new FileSystemResource(new File(path1));
            helper.addAttachment("Giấy Chứng Nhận.txt", file2);
            helper.setText(mailText.getMailTextCustomerDone(), true);
            mailSender.send(msg);
        } catch (Exception e) {
            System.err.println("Lỗi gửi mail rồi!!!");
        }
    }

}