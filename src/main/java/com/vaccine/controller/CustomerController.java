package com.vaccine.controller;

import com.vaccine.model.Customer;
import com.vaccine.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@RestController
@RequestMapping(value = {"/user"}, method = RequestMethod.GET, produces = "application/x-www-form-urlencoded;charset=UTF-8")
public class CustomerController {

    @Autowired
    ICustomerRepository iCustomerRepository;

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