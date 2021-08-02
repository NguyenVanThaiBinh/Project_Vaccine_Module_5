package com.vaccine.controller;


import com.vaccine.model.Customer;
import com.vaccine.model.Destination;
import com.vaccine.model.Vaccine;
import com.vaccine.model.WarehouseVaccine;
import com.vaccine.repository.ICustomerRepository;
import com.vaccine.repository.IDestinationRepository;
import com.vaccine.repository.IVaccineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {

    //
    @Autowired
    ICustomerRepository customerRepository;

    //
    @Autowired
    IDestinationRepository destinationRepository;

    @Autowired
    IVaccineRepository vaccineRepository;

    @GetMapping
    public ModelAndView showdb() {
        ModelAndView modelAndView = new ModelAndView("/admin/dashBoar");
        return modelAndView;
    }

    ////  ajax user
    @GetMapping("/api-full")
    public ResponseEntity<Page<Customer>> allUser(@PageableDefault(value = 10) Pageable pageable) {
        return new ResponseEntity<>(customerRepository.findAllCustomerAccount(pageable), HttpStatus.OK);
    }

    @GetMapping("/apiID/{id}")
    public ResponseEntity<Customer> getEntity(@PathVariable Long id) {
        return new ResponseEntity<>(customerRepository.findById(id).get(), HttpStatus.OK);
    }

    @GetMapping("/api/{search}")
    public ResponseEntity<Page<Customer>> searchUsers(@PageableDefault(value = 10) Pageable pageable, @PathVariable String search) {
        return new ResponseEntity<>(customerRepository.searchUserAdmin(search, pageable), HttpStatus.OK);
    }


    @PutMapping("/edit/{id}")
    public ResponseEntity<Customer> editEntity(@RequestBody Customer customer, @PathVariable Long id) {
        Customer customer1 = customerRepository.findById(id).get();
        customer1.setCMND(customer.getCMND());
        customer1.setCustomer_name(customer.getCustomer_name());
        customer1.setEmail(customer.getEmail());
        customer1.setPhone_number(customer.getPhone_number());
        return new ResponseEntity<>(customerRepository.save(customer1), HttpStatus.OK);
    }

    @GetMapping("/user")
    public ModelAndView listUsers(@PageableDefault(value = 10) Pageable pageable, @RequestParam("page") Optional<Integer> page) {
        int currentPage = page.orElse(0);
        Page<Customer> customers = customerRepository.findAllCustomerAccount(pageable);
        ModelAndView modelAndView = new ModelAndView("/admin/user");
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < customers.getTotalPages(); i++) {
            list.add(i);
        }
        modelAndView.addObject("customers", customers);
        modelAndView.addObject("list", list);
        modelAndView.addObject("pageActive", currentPage);
        return modelAndView;
    }


    //
//    //    ---------------------------------Điểm tiêm chủng------------------------------------------>
    @GetMapping("/destination")
    public ModelAndView listDestination() {
        List<Destination> destinations = destinationRepository.findAll();
        ModelAndView modelAndView = new ModelAndView("/admin/injectionPoint");
        modelAndView.addObject("destination", destinations);
        return modelAndView;
    }

//    //    ---------------------------------Nhà kho------------------------------------------>

    @GetMapping("/vaccine")
    public ModelAndView listWareH() {
        List<Vaccine> vaccineList = vaccineRepository.findAll();
        ModelAndView modelAndView = new ModelAndView("/admin/vaccine");
        modelAndView.addObject("vaccineList", vaccineList);
        return modelAndView;
    }

    @PostMapping("/create-V")
    public ResponseEntity<Vaccine> createCustomer(@RequestBody Vaccine vaccine) {
//        Một kho cho nên set thẳng luôn
        WarehouseVaccine warehouseVaccine = new WarehouseVaccine();
        warehouseVaccine.setId(1L);

        vaccine.setWarehouseVaccine(warehouseVaccine);
        return new ResponseEntity<>(vaccineRepository.save(vaccine), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete-vaccine/{id}")
    public ResponseEntity<Vaccine> deleteWarehouse(@PathVariable long id) {
        Optional<Vaccine> vaccine = vaccineRepository.findById(id);
        vaccineRepository.deleteById(id);
        return new ResponseEntity<>(vaccine.get(), HttpStatus.NO_CONTENT);
    }

    @PutMapping("/editV/{id}")
    public ResponseEntity<Vaccine> editEntityW(@RequestBody Vaccine vaccine, @PathVariable Long id) {
        Vaccine vaccine1 = vaccineRepository.getById(id);
        vaccine1.setVaccine_name(vaccine.getVaccine_name());
        vaccine1.setVaccine_amount(vaccine.getVaccine_amount());

        return new ResponseEntity<>(vaccineRepository.save(vaccine1), HttpStatus.OK);
    }

        @GetMapping("/apiIdV/{id}")
    public ResponseEntity<Vaccine> getEntityById(@PathVariable Long id){
        return new ResponseEntity<>(vaccineRepository.findById(id).get(),HttpStatus.OK);
    }

//    //    ---------------------------------Tài khoản điểm tiêm------------------------------------------>
//    @GetMapping("/all-H")
//    public ResponseEntity<Iterable<Customer>> listHosp() {
//        return new ResponseEntity<>(userRepository.getDoctor(), HttpStatus.OK);
//    }
    @GetMapping("/destinationAccount")
    public ModelAndView showHosp() {
        List<Customer> customerPage = customerRepository.getAllDestinationAccount();
        ModelAndView modelAndView = new ModelAndView("admin/destination_account");
        modelAndView.addObject("destinations", customerPage);
        return modelAndView;
    }
////    @PostMapping("/createDoctor")
////    public ResponseEntity<Customer> createDoctor(@RequestBody Customer user) {
////
////        user.setCheckDoctor(1);
////
//////        Ma` hoa'
////        String password = user.getPassword();
////        String encrytedPassword = encrytePassword(password);
////        user.setPassword(encrytedPassword);
////        try {
////            userService.save(user);
////        } catch (Exception e) {
////            return new ResponseEntity<>(userService.save(user), HttpStatus.EXPECTATION_FAILED);
////        }
//////        Them quyen`
////        //        Thêm quyền
////        Customer_Role userRole = new Customer_Role();
////        userRole.setAppUser(user);
////        Role appRole = new Role();
////        appRole.setRoleId(3L);
////        userRole.setAppRole(appRole);
////        userRoleRepository.save(userRole);
////        return new ResponseEntity<>(userService.save(user), HttpStatus.CREATED);
////    }
////    @DeleteMapping("/deleteDoctor/{id}")
////    public ModelAndView delete(@PathVariable Long id) {
////        userService.remove(id);
////        ModelAndView modelAndView = new ModelAndView("/admin/hospital");
////        return modelAndView;
////    }
////    @PutMapping("/edit-D/{id}")
////    public ResponseEntity<Customer> userResponseEntity(@RequestBody Customer user, @PathVariable Long id) {
////        Customer user1 = userService.findById(id).get();
////        user1.setId(id);
////        user1.setUserName(user.getUserName());
////        user1.setCMND(user.getCMND());
////        return new ResponseEntity<>(userService.save(user1), HttpStatus.OK);
////    }
////    // Ma~ hoa mat khau~
////    public static String encrytePassword(String password) {
////        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
////        return encoder.encode(password);
////    }
}
//
