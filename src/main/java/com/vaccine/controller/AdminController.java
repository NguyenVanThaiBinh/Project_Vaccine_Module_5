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
import org.springframework.core.io.FileSystemResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {

    //
    @Autowired
    ICustomerRepository customerRepository;

    @Autowired
    JavaMailSender mailSender;

    @Autowired
    IDestinationRepository destinationRepository;

    @Autowired
    IVaccineRepository vaccineRepository;

    @Autowired
    ICustomerRoleRepository customerRoleRepository;


    @Autowired
    IWarehouseRepository iWarehouseRepository;

    @Autowired
    CustomerServiceVerifyAccount customerServiceVerifyAccount;

//
    LocalDate localDate = LocalDate.now();
    String[] day = localDate.toString().split("-");
    String currentDay = day[2] + "-" + day[1] + "-" + day[0] + " ";

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

    @GetMapping("/dashboard_api")
    public List<ChartData> getDateOfAllCustomer() {
        List<ChartData> chartDataList = new ArrayList<>();
        List<String> listAllDay = customerRepository.ListDayOfAllCustomer();
        for (String day : listAllDay) {
            // Mu???n so s??nh chuy???n v??? Object m???i so s??nh ???????c v?? ch???a gi?? tr??? null
            if (!Objects.equals(day, null)) {
                int registerNumber = customerRepository.getRegisterNumberInOneDay(day);
                int injectionNumber = customerRepository.getIsInjectionNumberInOneDay(day);
                ChartData chartData = new ChartData(day, registerNumber, injectionNumber);
                chartDataList.add(chartData);
            }
        }
        return chartDataList;
    }
    @GetMapping("/dashboard_api_destination")
    public List<ChartData> getChartData() {
        List<ChartData> chartDataList = new ArrayList<>();
        List<String> listAllDay = customerRepository.ListDestinationChart();
        for (String destination : listAllDay) {
            // Mu???n so s??nh chuy???n v??? Object m???i so s??nh ???????c v?? ch???a gi?? tr??? null
            if (!Objects.equals(destination, null)) {

                int registerNumber = customerRepository.getRegisterNumberInDestination(destination);
                int injectionNumber = customerRepository.getIsInjectionNumberDestination(destination);
                ChartData chartData = new ChartData(registerNumber, injectionNumber,destination);
                chartDataList.add(chartData);
            }
        }
        return chartDataList;
    }

    ////  ajax user
    @GetMapping("/api-full")
    public ResponseEntity<Page<Customer>> allUser(@PageableDefault(value =  Integer.MAX_VALUE) Pageable pageable) {
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



//      <---------------------------------??i???m ti??m ch???ng------------------------------------------>

    @PutMapping("/destination/edit/{id}")
    public ResponseEntity<Destination> editDestination(@RequestBody Destination destination, @PathVariable Long id) {
        destination.setId(id);
        return new ResponseEntity<>(destinationRepository.save(destination), HttpStatus.OK);
    }

    @GetMapping("/destination/api-full-0")
    public ResponseEntity<Page<Destination>> fullApi0(Pageable pageable) {
        return new ResponseEntity<>(destinationRepository.findAllBySttDelete(0, pageable), HttpStatus.OK);
    }

    @GetMapping("/destination/api-full-1")
    public ResponseEntity<Page<Destination>> fullApi1(Pageable pageable) {
        return new ResponseEntity<>(destinationRepository.findAllBySttDelete(1, pageable), HttpStatus.OK);
    }

    @GetMapping("/destination/apiId/{id}")
    public ResponseEntity<Destination> getApiId(@PathVariable Long id) {
        return new ResponseEntity<>(destinationRepository.findById(id).get(), HttpStatus.OK);
    }

    @GetMapping("/destination/allCusByDes/{id}")
    public ResponseEntity<List<Customer>> getFullCustomerByDestination(@PathVariable Long id) {
        return new ResponseEntity<>(customerRepository.findByDestination(id), HttpStatus.OK);
    }


    private String getSiteURL(HttpServletRequest request) {
        String siteURL = request.getRequestURL().toString();
        return siteURL.replace(request.getServletPath(), "");
    }

    @GetMapping("/destination/sendEmailEnd/{id}/{date}")
    public void sendEmailDateEnd(@PathVariable("id") Long id, @PathVariable("date") String date, HttpServletRequest request) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

                String[] arr2 = date.trim().split("-");
                String date_end = arr2[2] + "-" + arr2[1] + "-" + arr2[0];
                List<Customer> list = customerRepository.findByDestination(id);
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getDate_vaccine() != null) {
                        String[] arr = list.get(i).getDate_vaccine().trim().split("-");
                        String date_vaccine = arr[2] + "-" + arr[1] + "-" + arr[0];
                        if (date_vaccine.compareTo(date_end) > 0) {
                            // Set date_vaccine , time = null
                            list.get(i).setDate_vaccine(list.get(i).getDate_vaccine() + "cancel");
                            list.get(i).setTime_vaccine(list.get(i).getDate_vaccine() + "cancel");
                            customerRepository.save(list.get(i));

                            // G???i email
                            sendEmailSorry(list.get(i));

                        }
                    }
                }

            }
        });
        thread1.start();
    }

    @GetMapping("/destination/sendEmailStart/{id}/{date}")
    public void sendEmailDateStart(@PathVariable("id") Long id, @PathVariable("date") String date) {
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

                String[] arr2 = date.trim().split("-");
                String date_end = arr2[2] + "-" + arr2[1] + "-" + arr2[0];
                List<Customer> list = customerRepository.findByDestination(id);
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getDate_vaccine() != null) {
                        String[] arr = list.get(i).getDate_vaccine().trim().split("-");
                        String date_vaccine = arr[2] + "-" + arr[1] + "-" + arr[0];
                        if (date_vaccine.compareTo(date_end) < 0) {
                            list.get(i).setDate_vaccine(list.get(i).getDate_vaccine() + "cancel");
                            list.get(i).setTime_vaccine(list.get(i).getTime_vaccine() + "cancel");
                            customerRepository.save(list.get(i));

                            // G???i email
                            sendEmailSorry(list.get(i));
                        }
                    }
                }

            }
        });
        thread2.start();
    }
    //    <-------------------------------- G???i mail xin l???i ------------------------>
    public void sendEmailSorry(Customer customer) {
        MimeMessage msg = mailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(msg, true, "UTF-8");
            helper.setSubject("Th??ng b??o ti??m ch???ng th???t b???i");
            helper.setFrom("boyte.vaccine.covid@gmail.com");
            helper.setTo(customer.getEmail());
            MailText mailText = new MailText();

            helper.setText(mailText.getMailApologyToCustomerFail(), true);
            mailSender.send(msg);
        } catch (Exception e) {
            System.err.println("L???i g???i mail r???i!!!");
        }
    }
//
//    @PutMapping("/destination/setOff/{id}")
//    public ResponseEntity<Destination> setOff(Long id){
//        Destination destination = destinationRepository.findById(id).get();
//        destination.setIsOpen(0);
//        return new ResponseEntity<>(destinationRepository.save(destination),HttpStatus.NO_CONTENT);
//    }

    @GetMapping("/destination/setOff/{id}")
    public void setOff(@PathVariable Long id) {
        Destination destination = destinationRepository.findById(id).get();
        destination.setIsOpen(1);
        destinationRepository.save(destination);
//
    }

    @GetMapping("/destination/sendEmailOff/{id}")
    public void sendMailOff(@PathVariable Long id) {
        String dateNow = LocalDate.now().toString();
        List<Customer> list = customerRepository.findByDestination(id);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIsInjection() == 0 && list.get(i).getHealthy_status() != 3 && list.get(i).getDate_vaccine() != null && list.get(i).getDate_vaccine().trim().split(" ").length==1) {
                String[] arr = list.get(i).getDate_vaccine().trim().split("-");
                String date = arr[2] + "-" + arr[1] + "-" + arr[0];
                if (date.compareTo(dateNow) >= 0) {
                    list.get(i).setDate_vaccine(list.get(i).getDate_vaccine()+"cancel");
                    customerRepository.save(list.get(i));
                    // G???i email
//                    sendEmailSorry(list.get(i));
                }
            }
        }

    }


    @GetMapping("/destination/setOn/{id}")
    public void setOn(@PathVariable Long id) {
        Destination destination = destinationRepository.findById(id).get();
        destination.setIsOpen(0);
        destinationRepository.save(destination);
    }

    @GetMapping("/destination")
    public ModelAndView listDestination(Pageable pageable) throws ParseException {
        Page<Destination> destinations = destinationRepository.findAllBySttDelete(0, pageable);
        ModelAndView modelAndView = new ModelAndView("/admin/injectionPoint");
//        for(Destination d:destinations){
//            String[] arr_S = d.getDate_start().trim().split("-");
//            String[] arr_E = d.getDate_end().trim().split("-");
//            String dateS = arr_S[2]+"-"+arr_S[1]+"-"+arr_S[0];
//            String dateE = arr_E[2]+"-"+arr_E[1]+"-"+arr_E[0];
//            String dateNow = LocalDate.now().toString();
//            if(dateS.compareTo(dateNow)<0 && dateE.compareTo(dateNow)>0 && d.getAmountOff()==0){
//                d.setIsOpen(1);
//                d.setAmountOff(1);
//                destinationRepository.save(d);
//            }
//        }
//        System.out.println(new SimpleDateFormat("yyy-mm-dd").format(new SimpleDateFormat("dd-mm-yyyy").parse(destinationRepository.findById(1L).get().getDate_end().trim())));
        modelAndView.addObject("destination", destinations);
        modelAndView.addObject("dateNow", LocalDate.now().toString());
        return modelAndView;
    }

//    //    ---------------------------------Qu???n l?? vaccine------------------------------------------>

    @GetMapping("/vaccine")
    public ModelAndView listWareH() {
        List<Vaccine> vaccineList = vaccineRepository.findAll();
        ModelAndView modelAndView = new ModelAndView("/admin/vaccine");
        modelAndView.addObject("vaccineList", vaccineList);
        return modelAndView;
    }

    @PostMapping("/create-V")
    public ResponseEntity<Vaccine> createCustomer(@RequestBody Vaccine vaccine) {
//        M???t kho cho n??n set th???ng lu??n
        WarehouseVaccine warehouseVaccine = new WarehouseVaccine();
        warehouseVaccine.setId(1L);

        vaccine.setWarehouseVaccine(warehouseVaccine);

        vaccine.setRegister_amount(vaccine.getVaccine_amount());
        return new ResponseEntity<>(vaccineRepository.save(vaccine), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete-vaccine/{id}")
    public Vaccine deleteWarehouse(@PathVariable long id) {
        Vaccine vaccine = vaccineRepository.findById(id).get();

        try {
            vaccineRepository.deleteById(id);
        } catch (Exception e) {
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


//    //    ---------------------------------B??c s??------------------------------------------>


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


        //      Set l?? t??i kho???n ??i???m ti??m
        user.setIsDoctor(1);
        //        M?? ho?? m???t kh???u
        String password = user.getPassword();
        String encrytedPassword = encrytePassword(password);
        user.setPassword(encrytedPassword);
        try {
            customerRepository.save(user);
        } catch (Exception e) {
            return new ResponseEntity<>(user, HttpStatus.CREATED);
        }


        //  L???y th??ng tin ??i???m ti??m v???
        Optional<Destination> destination = destinationRepository.findById(user.getDestination().getId());
        user.setDestination(destination.get());
        //        Set enable
        user.setEnabled(true);

        //        Th??m quy???n
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
