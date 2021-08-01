package com.vaccine.controller;


import com.vaccine.model.Customer;
import com.vaccine.model.Destination;
import com.vaccine.repository.ICustomerRepository;
import com.vaccine.repository.IDestinationRepository;
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
//
//
//    @Autowired
//    UserRoleRepository userRoleRepository;
//
    @Autowired
    ICustomerRepository customerRepository;
    //
//    @Autowired
//    IWarehouseVaccineService warehouseVaccineService;
//
//    @Autowired
//    IWarehouseRepository iWarehouseRepository;
//
    @Autowired
    IDestinationRepository destinationRepository;
    //
//    @Autowired
//    IAdminDestinationService adminDestinationService;
//
//    @Autowired
//    IDayTimeStart iDayTimeStart;
//
//    int countSort=0;
//
//    @ModelAttribute("warehouses")
//    public Iterable<WarehouseVaccine> warehouseVaccineResponseEntity() {
//        return iWarehouseRepository.findAll();
//    }
//
    @GetMapping
    public ModelAndView showdb(){
        ModelAndView modelAndView = new ModelAndView("/admin/dashBoar");
        return modelAndView;
    }
    ////  ajax user
    @GetMapping("/api-full")
    public ResponseEntity<Page<Customer>> allUser(@PageableDefault(value = 10) Pageable pageable){
        return new ResponseEntity<>(customerRepository.findAll(pageable), HttpStatus.OK);
    }
    @GetMapping("/apiID/{id}")
    public ResponseEntity<Customer> getEntity(@PathVariable Long id){
        return new ResponseEntity<>(customerRepository.findById(id).get(), HttpStatus.OK);
    }

    @GetMapping("/api/{search}")
    public ResponseEntity<Page<Customer>> searchUsers(@PageableDefault(value = 10) Pageable pageable, @PathVariable String search){
        return new ResponseEntity<>(customerRepository.searchUserAdmin(search,pageable), HttpStatus.OK);
    }


    @PutMapping("/edit/{id}")
    public ResponseEntity<Customer> editEntity(@RequestBody Customer customer, @PathVariable Long id){
        Customer customer1 = customerRepository.findById(id).get();
        customer1.setCMND(customer.getCMND());
        customer1.setCustomer_name(customer.getCustomer_name());
        customer1.setEmail(customer.getEmail());
        customer1.setPhone_number(customer.getPhone_number());
        return new ResponseEntity<>(customerRepository.save(customer1),HttpStatus.OK);
    }
    //    @DeleteMapping("/{id}")
//    public ResponseEntity<Customer> deleteUsers(@PathVariable("id")Long id){
//        Optional<Customer> optional = userService.findById(id);
//        userService.remove(id);
//        return new ResponseEntity<>(optional.get(),HttpStatus.NO_CONTENT);
//    }
//
//
//
    @GetMapping("/user")
    public ModelAndView listUsers(@PageableDefault(value = 10) Pageable pageable, @RequestParam("page") Optional<Integer> page){
        int currentPage = page.orElse(0);
        Page<Customer> customers = customerRepository.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("/admin/user");
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<customers.getTotalPages();i++){
            list.add(i);
        }
        modelAndView.addObject("customers",customers);
        modelAndView.addObject("list",list);
        modelAndView.addObject("pageActive",currentPage);
        return modelAndView;
    }
    //
//    @GetMapping("/edit-user/{id}")
//    public ModelAndView showEdit(@PathVariable("id") Long id){
//        Customer user = userService.findById(id).get();
//        ModelAndView modelAndView = new ModelAndView("/editForm");
//        modelAndView.addObject("user",user);
//        return modelAndView;
//    }
//    @PostMapping("/edit-user")
//    public ModelAndView editUser(@ModelAttribute("user") Customer user){
//        userService.save(user);
//        ModelAndView modelAndView = new ModelAndView("/editForm");
//        modelAndView.addObject("user",new Customer());
//        return modelAndView;
//    }
//
//    //    ---------------------------------Thời gian tiêm chủng------------------------------------------>
//
//    @GetMapping("/timevaccine")
//    public ModelAndView listTimeVaccine(){
//        ModelAndView modelAndView = new ModelAndView("/admin/injectiontime");
//        if(iDayTimeStart.findById(2L).isPresent()){
//            modelAndView.addObject("error","Điểm tiêm đã được ấn định");
//        }
//
//
//
//        return modelAndView;
//    }
//
//    //    ---------------------------------Điểm tiêm chủng------------------------------------------>
    @GetMapping("/destination")
    public ModelAndView listDestination() {
        List<Destination> destinations = destinationRepository.findAll();
        ModelAndView modelAndView = new ModelAndView("/admin/injectionPoint");
        modelAndView.addObject("destination", destinations);
        return modelAndView;
    }
//    @PostMapping("/create-DS")
//    public ResponseEntity<Destination> createDestination(@RequestBody Destination adminDestination) {
//        return new ResponseEntity<>(adminDestinationService.save(adminDestination), HttpStatus.CREATED);
//    }
////    @DeleteMapping("/deleteDestination/{id}")
////    public ResponseEntity<AdminDestination> destinationResponseEntity(@PathVariable long id) {
////        Optional<AdminDestination> adminDestination = adminDestinationService.findById(id);
////        adminDestination.get().setDeleteStatus(1);
////        return new ResponseEntity<>(adminDestination.get(), HttpStatus.NO_CONTENT);
////    }
////    @GetMapping("/apiDs/{id}")
////    public ResponseEntity<AdminDestination> adminDestinationResponseEntity(@PathVariable Long id) {
////        return new ResponseEntity<>(adminDestinationService.findById(id).get(), HttpStatus.OK);
////    }
////    @PutMapping("/editDs/{id}")
////    public ResponseEntity<AdminDestination> editEntityDS(@RequestBody AdminDestination adminDestination, @PathVariable Long id) {
////        adminDestination.setId(id);
////        return new ResponseEntity<>(adminDestinationService.save(adminDestination), HttpStatus.OK);
////    }
//
//
//    //    ---------------------------------Nhà kho------------------------------------------>
//
//    @GetMapping("/all-W")
//    public ResponseEntity<Iterable<WarehouseVaccine>> allwareHouse(){
//    return new ResponseEntity<>(iWarehouseRepository.findAll(),HttpStatus.OK);
//}
//    @GetMapping("/warehouse")
//    public ModelAndView listWareH(){
//        List<WarehouseVaccine> warehouseVaccineList = iWarehouseRepository.findAll();
//        ModelAndView modelAndView = new ModelAndView("/admin/warehousevaccine");
//        modelAndView.addObject("warehousevaccine",warehouseVaccineList);
//        return modelAndView;
//    }
//    @PostMapping("/create-W")
//    public ResponseEntity<WarehouseVaccine> createCustomer(@RequestBody WarehouseVaccine warehouseVaccine) {
//        warehouseVaccine.setAmountRegister(warehouseVaccine.getAmountVaccine());
//        return new ResponseEntity<>(warehouseVaccineService.save(warehouseVaccine), HttpStatus.CREATED);
//    }
//    @GetMapping("/apiIdW/{id}")
//    public ResponseEntity<WarehouseVaccine> getEntityById(@PathVariable Long id){
//        return new ResponseEntity<>(warehouseVaccineService.findById(id).get(),HttpStatus.OK);
//    }
//    @PutMapping("/editW/{id}")
//    public ResponseEntity<WarehouseVaccine> editEntityW(@RequestBody WarehouseVaccine warehouseVaccine,@PathVariable Long id){
//        WarehouseVaccine  warehouseVaccine1 = warehouseVaccineService.findById(id).get();
//        warehouseVaccine1.setId(id);
//        warehouseVaccine1.setWarehouseName(warehouseVaccine.getWarehouseName());
//        warehouseVaccine1.setWarehouseAddress(warehouseVaccine.getWarehouseAddress());
//        warehouseVaccine1.setAmountVaccine(warehouseVaccine.getAmountVaccine());
//        return new ResponseEntity<>(warehouseVaccineService.save(warehouseVaccine1),HttpStatus.OK);
//    }
//    @DeleteMapping("/delete-warehouse/{id}")
//    public ResponseEntity<WarehouseVaccine> deleteWarehouse(@PathVariable long id) {
//        Optional<WarehouseVaccine> customerOptional = warehouseVaccineService.findById(id);
//        warehouseVaccineService.remove(id);
//        return new ResponseEntity<>(customerOptional.get(), HttpStatus.NO_CONTENT);
//    }
//    //    ---------------------------------Bác sĩ------------------------------------------>
//    @GetMapping("/all-H")
//    public ResponseEntity<Iterable<Customer>> listHosp() {
//        return new ResponseEntity<>(userRepository.getDoctor(), HttpStatus.OK);
//    }
//    @GetMapping("/hospital")
//    public ModelAndView showHosp() {
//        Page<Destination> destinations = customerRepository.getAllDestination();
//        ModelAndView modelAndView = new ModelAndView("/admin/hospital");
//        modelAndView.addObject("destinations", destinations);
//        return modelAndView;
//    }
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
