package com.vaccine.controller;

import com.vaccine.model.Customer;
import com.vaccine.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping(value = "/doctor")
public class DoctorController {

    @Autowired
    ICustomerRepository icustomerRepository;

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
        System.out.println( "Key is: "+key);
//        Lấy lại quyền để lấy ID
        String userName = principal.getName();
        Customer customer1 = icustomerRepository.findByUserCMND(userName);
//        Lấy danh sách
        Page<Customer> searchResultCustomer = icustomerRepository.searchCustomerByCMND("01-10-2021 ",customer1.getDestination().getId(),PageRequest.of(Integer.parseInt(pageNumber[0]), 5), key);
        if(key.equals("binhhu")){
            Page<Customer> customerListIsDone = icustomerRepository.findCustomerIsDoneInDay("01-10-2021 ",customer1.getDestination().getId(), PageRequest.of(Integer.parseInt(pageNumber[0]), 5));
            return  customerListIsDone;
        }
        return  searchResultCustomer;
    }


//    int count=0;
//    int countSort=0;
//    static int countCheckBefore =0;
//    static int countCheckAfter =0;
//    static int checkSetAll = 0;
//    static int checkAmountRegister=0;
//    List<Customer> listTest = new ArrayList<>();
//    String[] str = LocalDate.now().toString().split("-");
//    String date = str[2]+"-"+str[1]+"-"+str[0]+" ";
//    @Autowired
//    IUserService userService;
//    @Autowired
//    IUserRepository iUserRepository;
//    @Autowired
//    IAdminDestinationService adminDestinationService;
//    @Autowired
//    IWarehouseVaccineService warehouseVaccineService;
//    @Autowired
//    IDayVaccineRegisterRepository dayVaccineService;
//    @Autowired
//    IDayTimeStart dayTimeStart;
//    @GetMapping("/list")
//    public ResponseEntity<Page<Customer>> allUsers(@PageableDefault(value = 15) Pageable pageable){
//        return new ResponseEntity<>(userService.findAllPageListOne(pageable,date), HttpStatus.OK);
//    }
//    @GetMapping("/list/{date}")
//    public ResponseEntity<Page<Customer>> allUsersDate(@PageableDefault(value = 15) Pageable pageable, @PathVariable String date){
//        date+=" ";
//        return new ResponseEntity<>(userService.findAllPageListOne(pageable,date),HttpStatus.OK);
//    }
//    @GetMapping("/api/{date}/{search}")
//    public ResponseEntity<Page<Customer>> searchUsers(@PageableDefault(value = 15) Pageable pageable, @PathVariable String date, @PathVariable String search){
//        date+=" ";
//        return new ResponseEntity<>(userService.searchUsersDoctor(pageable,search,date), HttpStatus.OK);
//    }
//    @GetMapping("/apiRegister")
//    public ResponseEntity<WarehouseVaccine> getAmount(){
//        return new ResponseEntity<>(warehouseVaccineService.findById(1L).get(),HttpStatus.OK);
//    }
////    @GetMapping("/apiDateTime")
////    public ResponseEntity<DayTimeStart> getDayTime(){
////        return new ResponseEntity<>(dayTimeStart.findById(1L).get(),HttpStatus.OK);
////    }
//    @GetMapping("/fullApiUser")
//    public ResponseEntity<Iterable<Customer>> getFullUser(){
//        return new ResponseEntity<>(iUserRepository.findAll(),HttpStatus.OK);
//    }
//    @GetMapping("/{date}")
//    public ModelAndView showFormDate(@PageableDefault(value = 15) Pageable pageable, @RequestParam("page") Optional<Integer> page,@PathVariable String date) {
//        date +=" ";
//        String[] str = date.trim().split("-");
//        String dateAfter = str[2]+"-"+str[1]+"-"+str[0];
//        int currentPage = page.orElse(0);
//        ModelAndView modelAndView = new ModelAndView("/doctor/ListUserIsDone");
//        Page<Customer> userList = userService.findAllPageListOne(pageable,date);
//        modelAndView.addObject("userList", userList);
//        List<Integer> list = new ArrayList<>();
//        for(int i=0;i<userList.getTotalPages();i++){
//            list.add(i);
//        }
//        if(dateAfter.compareTo(LocalDate.now().toString())!=0) {
//            modelAndView.addObject("check", 1);
//        }
//        modelAndView.addObject("list",list);
//        modelAndView.addObject("pageActive",currentPage);
//        modelAndView.addObject("dateUrl",date);
//        return modelAndView;
//    }
//
//    @GetMapping("/check/{id}")
//    public void setCheck(@PathVariable Long id,@PageableDefault(value = 15) Pageable pageable){
//        Customer user = userService.findById(id).get();
//        user.setCheckStatus(1);
//        userService.save(user);
//        checkSetAll++;
//        count++;
//    }
//    @GetMapping("/unchecked/{id}")
//    public void setUnchecked(@PathVariable Long id,@PageableDefault(value = 15) Pageable pageable){
//        Customer user = userService.findById(id).get();
//        user.setCheckStatus(0);
//        userService.save(user);
//        checkSetAll++;
//        count--;
//    }
//    @GetMapping("/setAll")
//    public ModelAndView setAll(@PageableDefault(value = 15) Pageable pageable,@RequestParam("page") Optional<Integer> page){
//        AmountVaccineRegisterInDay amountVaccineRegisterInDay = dayVaccineService.findByDate(date).get();
//        Page<Customer> list = userService.findAllPageListOne(pageable,date);
//        listTest = iUserRepository.getUserOneDay(date);
//        for(Customer item:list){
//            if(item.getCheckStatus()==0){
//                countCheckAfter++;
//            }
//        }
//        WarehouseVaccine warehouseVaccine = warehouseVaccineService.findById(1L).get();
//        if(amountVaccineRegisterInDay.getCountSubmit()==0){
//            warehouseVaccine.setAmountRegister(warehouseVaccine.getAmountRegister()-countCheckBefore+countCheckAfter+list.getTotalElements());
//        }
//        else{
//            if(countCheckAfter!=countCheckBefore){
//                warehouseVaccine.setAmountRegister(warehouseVaccine.getAmountRegister()-countCheckBefore+countCheckAfter);
//            }
//        }
//        amountVaccineRegisterInDay.setCountSubmit(amountVaccineRegisterInDay.getCountSubmit()+1);
//        dayVaccineService.save(amountVaccineRegisterInDay);
//        warehouseVaccine.setAmountVaccine(warehouseVaccine.getAmountVaccine()-count);
//        warehouseVaccineService.save(warehouseVaccine);
//        countCheckBefore=0;
//        countCheckAfter=0;
//        count=0;
//        checkSetAll=0;
//        return showForm(pageable,page);
//    }
//    @GetMapping("/sort")
//    public ModelAndView sortByName(){
//        ModelAndView modelAndView = new ModelAndView("/admin/ListUserIsDone");
//        Iterable<Customer> userList;
//        if(countSort%2==0){
//            userList = userService.sortById();
//        }
//        else{
//            userList = userService.sortByIdDesc();
//        }
//        modelAndView.addObject("userList",userList);
//        countSort++;
//        return modelAndView;
//    }
}