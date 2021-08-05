package com.vaccine.controller;



import com.vaccine.model.*;

import com.vaccine.model.Customer;
import com.vaccine.model.Destination;
import com.vaccine.model.WarehouseVaccine;

import com.vaccine.repository.ICustomerRepository;
import com.vaccine.repository.ICustomerRoleRepository;
import com.vaccine.repository.IDestinationRepository;

import com.vaccine.repository.IVaccineRepository;

import com.vaccine.repository.IWarehouseRepository;

import com.vaccine.service.CustomerServiceVerifyAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
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

    @Autowired
    ICustomerRoleRepository customerRoleRepository;

//    @Autowired
//    IWarehouseVaccineService warehouseVaccineService;
//
    @Autowired
    IWarehouseRepository iWarehouseRepository;

    @Autowired
    CustomerServiceVerifyAccount customerServiceVerifyAccount;
//
    //
//    @Autowired
//    IAdminDestinationService adminDestinationService;
//
//    @Autowired
//    IDayTimeStart iDayTimeStart;
//
//    int countSort=0;
//
    @ModelAttribute("warehouses")
    public Iterable<WarehouseVaccine> warehouseVaccineResponseEntity() {
        return iWarehouseRepository.findAll();
    }
//

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
//    @DeleteMapping("/destination/{id}")
//    public ResponseEntity<Destination> destinationResponseEntity(@PathVariable long id) {
//        Destination Destination = destinationRepository.findById(id).get();
//        Destination.setIsDelete(1);
//        destinationRepository.save(Destination);
//        return new ResponseEntity<>(Destination, HttpStatus.NO_CONTENT);
//    }
    @PutMapping("/destination/edit/{id}")
    public ResponseEntity<Destination> editDestination(@RequestBody Destination destination,@PathVariable Long id){
        destination.setId(id);
        return new ResponseEntity<>(destinationRepository.save(destination),HttpStatus.OK);
    }

    @GetMapping("/destination/api-full-0")
    public ResponseEntity<Page<Destination>> fullApi0(Pageable pageable){
        return new ResponseEntity<>(destinationRepository.findAllBySttDelete(0,pageable),HttpStatus.OK);
    }
    @GetMapping("/destination/api-full-1")
    public ResponseEntity<Page<Destination>> fullApi1(Pageable pageable){
        return new ResponseEntity<>(destinationRepository.findAllBySttDelete(1,pageable),HttpStatus.OK);
    }
    @GetMapping("/destination/apiId/{id}")
    public ResponseEntity<Destination> getApiId(@PathVariable Long id){
        return new ResponseEntity<>(destinationRepository.findById(id).get(),HttpStatus.OK);
    }

    @GetMapping("/destination/allCusByDes/{id}")
    public ResponseEntity<List<Customer>> getFullCustomerByDestination(@PathVariable Long id){
        return new ResponseEntity<>(customerRepository.findByDestination(id),HttpStatus.OK);
    }

    private String getSiteURL(HttpServletRequest request) {
        String siteURL = request.getRequestURL().toString();
        return siteURL.replace(request.getServletPath(), "");
    }

    @GetMapping("/destination/sendEmailEnd/{id}/{date}")
    public void sendEmailDateEnd(@PathVariable("id") Long id, @PathVariable("date") String date, HttpServletRequest request){
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int countCustomer=0;
                String[] arr2 = date.trim().split("-");
                String date_end = arr2[2]+"-"+arr2[1]+"-"+arr2[0];
                List<Customer> list = customerRepository.findByDestination(id);
                for(int i=0;i<list.size();i++){
                    if(list.get(i).getDate_vaccine()!=null){
                        String[] arr = list.get(i).getDate_vaccine().trim().split("-");
                        String date_vaccine = arr[2]+"-"+arr[1]+"-"+arr[0];
                        if(date_vaccine.compareTo(date_end)>0){
                            // Set date_vaccine , time = null
                            list.get(i).setDate_vaccine(list.get(i).getDate_vaccine()+"cancel");
                            list.get(i).setTime_vaccine(list.get(i).getDate_vaccine()+"cancel");
                            customerRepository.save(list.get(i));
                            // Hàm gửi email
                            countCustomer++;
//                            customerServiceVerifyAccount.sendEmailVerifyAccount("boyte.vaccine.covid@gmail.com", list.get(i),getSiteURL(request));
                        }
                    }
                }
                System.out.println("end:"+countCustomer);
            }
        });
        thread1.start();
    }

    @GetMapping("/destination/sendEmailStart/{id}/{date}")
    public void sendEmailDateStart(@PathVariable("id") Long id, @PathVariable("date") String date){
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int countCustomer=0;
                String[] arr2 = date.trim().split("-");
                String date_end = arr2[2]+"-"+arr2[1]+"-"+arr2[0];
                List<Customer> list = customerRepository.findByDestination(id);
                for(int i=0;i<list.size();i++){
                    if(list.get(i).getDate_vaccine()!=null){
                        String[] arr = list.get(i).getDate_vaccine().trim().split("-");
                        String date_vaccine = arr[2]+"-"+arr[1]+"-"+arr[0];
                        if(date_vaccine.compareTo(date_end)<0){
                            list.get(i).setDate_vaccine(list.get(i).getDate_vaccine()+"cancel");
                            list.get(i).setTime_vaccine(list.get(i).getDate_vaccine()+"cancel");
                            customerRepository.save(list.get(i));
                            // Hàm gửi email
                            // Set date_vaccine , time = null
                            countCustomer++;
                        }
                    }
                }
                System.out.println("start"+countCustomer);
            }
        });
        thread2.start();
    }
//
//    @PutMapping("/destination/setOff/{id}")
//    public ResponseEntity<Destination> setOff(Long id){
//        Destination destination = destinationRepository.findById(id).get();
//        destination.setIsOpen(0);
//        return new ResponseEntity<>(destinationRepository.save(destination),HttpStatus.NO_CONTENT);
//    }

    @GetMapping("/destination/sendEmailOff/{id}")
    public void sendMailOff(@PathVariable Long id){
        Destination destination = destinationRepository.findById(id).get();
        destination.setIsOpen(0);
        destinationRepository.save(destination);
        System.out.println(destination.toString());
        String dateNow = LocalDate.now().toString();
        List<Customer> list = customerRepository.findByDestination(id);
        for(int i=0;i<list.size();i++){
            if(list.get(i).getIsInjection()==0 && list.get(i).getHealthy_status()!=3){
                String[] arr = list.get(i).getDate_vaccine().trim().split("-");
                String date = arr[2]+"-"+arr[1]+"-"+arr[0];
                if(date.compareTo(dateNow)>0){
                    //Gui mail
                    System.out.println(1);
                }
            }
        }
    }

    @GetMapping("/destination")
    public ModelAndView listDestination(Pageable pageable) throws ParseException {
        Page<Destination> destinations = destinationRepository.findAllBySttDelete(0,pageable);
        ModelAndView modelAndView = new ModelAndView("/admin/injectionPoint");
        for(Destination d:destinations){
            String[] arr_S = d.getDate_start().trim().split("-");
            String[] arr_E = d.getDate_end().trim().split("-");
            String dateS = arr_S[2]+"-"+arr_S[1]+"-"+arr_S[0];
            String dateE = arr_E[2]+"-"+arr_E[1]+"-"+arr_E[0];
            String dateNow = LocalDate.now().toString();
            if(dateS.compareTo(dateNow)<0 && dateE.compareTo(dateNow)>0 && d.getAmountOff()==0){
                d.setIsOpen(1);
                d.setAmountOff(1);
                destinationRepository.save(d);
            }
        }
//        System.out.println(new SimpleDateFormat("yyy-mm-dd").format(new SimpleDateFormat("dd-mm-yyyy").parse(destinationRepository.findById(1L).get().getDate_end().trim())));
        modelAndView.addObject("destination", destinations);
        modelAndView.addObject("dateNow",LocalDate.now().toString());
        return modelAndView;
    }

//    //    ---------------------------------Quản lý vaccine------------------------------------------>

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
    public Vaccine deleteWarehouse(@PathVariable long id) {
      Vaccine vaccine = vaccineRepository.findById(id).get();

        try{
            vaccineRepository.deleteById(id);
        }catch (Exception e){
            vaccine.setVaccine_amount(-1);
            return vaccine;
        }

        return vaccine;
    }

    @PutMapping("/editV/{id}")
    public ResponseEntity<Vaccine> editEntityW(@RequestBody Vaccine vaccine, @PathVariable Long id) {
        Vaccine vaccine1 = vaccineRepository.getById(id);
        vaccine1.setVaccine_name(vaccine.getVaccine_name());
        vaccine1.setVaccine_amount(vaccine.getVaccine_amount());

        return new ResponseEntity<>(vaccineRepository.save(vaccine1), HttpStatus.OK);
    }

    @GetMapping("/apiIdV/{id}")
    public ResponseEntity<Vaccine> getEntityById(@PathVariable Long id) {
        return new ResponseEntity<>(vaccineRepository.findById(id).get(), HttpStatus.OK);
    }

    //    //    ---------------------------------Tài khoản điểm tiêm------------------------------------------>
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
    @PostMapping("/destination/create")
    public ResponseEntity<Destination> createDestination(@RequestBody Destination adminDestination) {
        return new ResponseEntity<>(destinationRepository.save(adminDestination), HttpStatus.CREATED);
    }
    @DeleteMapping("/destination/{id}")
    public ResponseEntity<Destination> destinationResponseEntity(@PathVariable long id) {
        Destination Destination = destinationRepository.findById(id).get();
        Destination.setIsDelete(1);
        destinationRepository.save(Destination);
        return new ResponseEntity<>(Destination, HttpStatus.NO_CONTENT);
    }


//    //    ---------------------------------Bác sĩ------------------------------------------>


    @GetMapping("/destinationAccount")
    public ModelAndView showHosp() {
        List<Customer> allDestinationAccount = customerRepository.getAllDestinationAccount();
        List<Destination> destinationList = destinationRepository.findAll();
        ModelAndView modelAndView = new ModelAndView("admin/destination_account");
        modelAndView.addObject("allDestinationAccount", allDestinationAccount);
        modelAndView.addObject("destinationList", destinationList);
        return modelAndView;
    }

    @PostMapping("/createDestinationAccount")
    public ResponseEntity<Customer> createDestinationAccount(@RequestBody Customer user) {


        //      Set là tài khoản điểm tiêm
        user.setIsDoctor(1);
        //        Mã hoá mật khẩu
        String password = user.getPassword();
        String encrytedPassword = encrytePassword(password);
        user.setPassword(encrytedPassword);
        try {
            customerRepository.save(user);
        } catch (Exception e) {
            return new ResponseEntity<>(user, HttpStatus.CREATED);
        }


        //  Lấy thông tin điểm tiêm về
        Optional<Destination> destination = destinationRepository.findById(user.getDestination().getId());
        user.setDestination(destination.get());
        //        Set enable
        user.setEnabled(true);

        //        Thêm quyền
        Customer_Role userRole = new Customer_Role();
        userRole.setAppUser(user);
        Role appRole = new Role();
        appRole.setRoleId(3L);
        userRole.setAppRole(appRole);
        customerRoleRepository.save(userRole);

        return new ResponseEntity<>(customerRepository.save(user), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete_destination_account/{id}")
    public void deleteDestinationAccount(@PathVariable Long id) {
        Customer_Role customer_role = customerRoleRepository.findCustomer_RoleByIdCustomer(id);
        customerRoleRepository.deleteById(customer_role.getId());

        customerRepository.deleteById(id);

    }

    @GetMapping("/api_destination_account/{id}")
    public ResponseEntity<Customer> getAPIDestiontionAccount(@PathVariable Long id) {
        return new ResponseEntity<>(customerRepository.findById(id).get(), HttpStatus.OK);
    }

    @PutMapping("/edit_destination_account/{id}")
    public ResponseEntity<Customer> userResponseEntity(@RequestBody Customer user, @PathVariable Long id) {
        Optional<Destination> destination = destinationRepository.findById(user.getDestination().getId());

        Customer user1 = customerRepository.findById(id).get();
        user1.setCMND(user.getCMND());
        user1.setDestination(destination.get());
        user1.setPassword(encrytePassword(user.getPassword()));
        try {
            customerRepository.save(user1);
        } catch (Exception e) {
            user.setCMND("-1");
            return new ResponseEntity<>(user, HttpStatus.CREATED);
        }

        return new ResponseEntity<>(customerRepository.save(user1), HttpStatus.OK);
    }

    // Ma~ hoa mat khau~
    public static String encrytePassword(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
}
//
