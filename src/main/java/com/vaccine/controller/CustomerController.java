package com.vaccine.controller;

import com.vaccine.model.Customer;
import com.vaccine.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@RestController
@RequestMapping(value = {"/user"}, method = RequestMethod.GET, produces = "application/x-www-form-urlencoded;charset=UTF-8")
public class CustomerController {

    @Autowired
    ICustomerRepository iCustomerRepository;

    @RequestMapping(value = "/apiID/{id}",  produces = {"application/json", "text/xml"})
    ResponseEntity<Customer> getApiById(@PathVariable Long id){
        System.out.println(iCustomerRepository.findById(id).get().toString());
        return new ResponseEntity<>(iCustomerRepository.findById(id).get(), HttpStatus.OK);
    }

    @GetMapping()
    public ModelAndView showUserPage(Principal principal) {
//      userName mean CMND
        String userName = principal.getName();
        Customer user = new Customer();
        user = iCustomerRepository.findByUserCMND(userName);

        ModelAndView modelAndView = new ModelAndView("/user/userPage");
        modelAndView.addObject("userInfo", user);
        return modelAndView;
    }
}