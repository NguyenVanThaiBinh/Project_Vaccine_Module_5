package com.vaccine.controller;

import com.vaccine.model.Customer;
import com.vaccine.model.MailText;
import com.vaccine.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping(value = "/doctor")
public class DoctorController {

    @Autowired
    ICustomerRepository icustomerRepository;

    @Autowired
    JavaMailSender mailSender;

    @GetMapping
    public ModelAndView showFormListDone(HttpServletRequest request, Principal principal) {
//        Kiểm tra tài khoản và truy cập vào điểm tiêm tương ứng
        if (request.isUserInRole("ROLE_ADMIN") || request.isUserInRole("ROLE_DOCTOR")) {
            String userName = principal.getName();
            Customer user = new Customer();
            user = icustomerRepository.findByUserCMND(userName);
// ----------------->>    Còn thiếu hàm convert ngày hiện tại thành String + " "
            Page<Customer> customerListIsDone = icustomerRepository.findCustomerIsDoneInDay("01-10-2021 ",user.getDestination().getId(), PageRequest.of(0, 5));
            ModelAndView modelAndView = new ModelAndView("doctor/ListUserIsDone");
            modelAndView.addObject("customerListIsDone",customerListIsDone);
            modelAndView.addObject("customerInfo",user);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("index/home");
            return modelAndView;
        }
    }
    @ResponseBody
    @RequestMapping(path = "/setInjectToNone", method = RequestMethod.POST)
    public String setInjectToNone(@RequestBody String[] itemIDs, Principal principal){
        //          Set lại mấy thằng chưa đến tiêm
        for (String cmnd_customer : itemIDs) {
            Customer customer = icustomerRepository.findByUserCMND(cmnd_customer);
            customer.setIsInjection(0);
            icustomerRepository.save(customer);
        }
        return "Done";
    }
    @ResponseBody
    @RequestMapping(path = "/setInjectToDone", method = RequestMethod.POST)
    public String setInjectToDone(@RequestBody String[] itemIDs, Principal principal){
        for (String cmnd_customer : itemIDs) {
            Customer customer = icustomerRepository.findByUserCMND(cmnd_customer);
//            Gửi mail xác nhận

//            sendMailToCustomerCame(customer);

            customer.setIsInjection(1);
            icustomerRepository.save(customer);
        }
        return "Done";
    }

    @ResponseBody
    @RequestMapping(path = "/changePage", method = RequestMethod.POST)
    public Page<Customer> changePage(@RequestBody String[]  pageNumber,Principal principal){
//        Lấy lại quyền để lấy ID
        String userName = principal.getName();
        Customer customer1 = icustomerRepository.findByUserCMND(userName);
//        Lấy danh sách
        Page<Customer> customerListIsDone = icustomerRepository.findCustomerIsDoneInDay("01-10-2021 ",customer1.getDestination().getId(), PageRequest.of(Integer.parseInt(pageNumber[0]), 5));
        return  customerListIsDone;
    }

    @ResponseBody
    @RequestMapping(path = "/search/{key}", method = RequestMethod.POST)
    public Page<Customer> searchByCMND(@PathVariable String key,Principal principal,@RequestBody String[]  pageNumber){
//        System.out.println( "Key is: "+key);
//        System.out.println( "Page currently: "+pageNumber[0]);
//        Lấy lại quyền để lấy ID
        String userName = principal.getName();
        Customer customer1 = icustomerRepository.findByUserCMND(userName);
//        Lấy danh sách
        Page<Customer> searchResultCustomer = icustomerRepository.searchCustomerByCMND("01-10-2021 ",customer1.getDestination().getId(), key,PageRequest.of(0, Integer.MAX_VALUE));
        if(key.equals("binhhu")){
            Page<Customer> customerListIsDone = icustomerRepository.findCustomerIsDoneInDay("01-10-2021 ",customer1.getDestination().getId(), PageRequest.of(Integer.parseInt(pageNumber[0]), 5));
            return  customerListIsDone;
        }
        return  searchResultCustomer;
    }

//    <-------------------------------- Gửi mail chứng nhận ------------------------>
    public void sendMailToCustomerCame(Customer customer) {
        MimeMessage msg = mailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(msg, true, "UTF-8");
            helper.setSubject("Xác nhận tiêm chủng lần 1");
            helper.setFrom("boyte.vaccine.covid@gmail.com");
            helper.setTo(customer.getEmail());

            MailText mailText = new MailText(customer.getCustomer_name(), customer.getCMND(),customer.getIsInjection());
            String path1 = "src\\main\\resources\\static\\ChungNhanTiemChung.txt";
            FileSystemResource file2 = new FileSystemResource(new File(path1));
            helper.addAttachment("Giấy Chứng Nhận", file2);
            helper.setText(mailText.getMailTextCustomerDone(), true);
            mailSender.send(msg);
        } catch (Exception e) {
            System.err.println("Lỗi gửi mail rồi!!!");
        }
    }

}