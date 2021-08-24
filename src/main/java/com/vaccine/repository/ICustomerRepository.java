package com.vaccine.repository;


import com.vaccine.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {

    @Query("SELECT e FROM Customer e WHERE e.CMND = ?1")
    Customer findByUserCMND(String cmnd);

        //  <----------------- Phân giờ vaccine lần 1 ------------------>

    @Query(" select count(e.time_vaccine) from Customer e where e.destination.id = ?1 and (e.healthy_status = 1 or  e.healthy_status = 2) and" +
            "  e.time_vaccine = (select max(time_vaccine) from e where e.destination.id = ?1 and e.date_vaccine =  (select max(date_vaccine) from e where e.destination.id = ?1))  " +
            "and e.date_vaccine =  (select max(date_vaccine) from e where e.destination.id = ?1)")
    Integer  countMaxTimeInDay(Long id_destination);

    @Query(" select count(e.date_vaccine) from Customer e where e.destination.id = ?1 and (e.healthy_status = 1 or  e.healthy_status = 2) and  e.date_vaccine = (select max(date_vaccine) from e where e.destination.id = ?1)")
    int  countMaxDayToNext(Long id_destination);

    @Query("select max(e.date_vaccine) from Customer e where e.destination.id = ?1 and  (e.healthy_status = 1 or  e.healthy_status = 2) ")
    String getMaxDayFromData(Long id_destination);

    @Query("select max(e.time_vaccine) from Customer e where e.destination.id = ?1  and (e.healthy_status = 1 or  e.healthy_status = 2) and  e.date_vaccine = (select max(date_vaccine) from e where e.destination.id = ?1)")
    String getMaxTimeFromData(Long id_destination);

    // <-------------------- Phân giờ vaccine lần 2 ------------------------>
    @Query(" select count(e.time_vaccine2) from Customer e where e.destination2.id = ?1 and (e.healthy_status = 1 or  e.healthy_status = 2) and" +
            "  e.time_vaccine2 = (select max(time_vaccine2) from e where e.destination2.id = ?1 and e.date_vaccine2 =  (select max(date_vaccine2) from e where e.destination2.id = ?1))  " +
            "and e.date_vaccine2 =  (select max(date_vaccine2) from e where e.destination2.id = ?1)")
    Integer  countMaxTimeInDay_2(Long id_destination);

    @Query(" select count(e.date_vaccine2) from Customer e where e.destination2.id = ?1 and (e.healthy_status = 1 or  e.healthy_status = 2) and  e.date_vaccine2 = (select max(date_vaccine2) from e where e.destination2.id = ?1)")
    int  countMaxDayToNext_2(Long id_destination);

    @Query("select max(e.date_vaccine2) from Customer e where e.destination2.id = ?1 and  (e.healthy_status = 1 or  e.healthy_status = 2) ")
    String getMaxDayFromData_2(Long id_destination);

    @Query("select max(e.time_vaccine2) from Customer e where e.destination2.id = ?1 and (e.healthy_status = 1 or  e.healthy_status = 2) and  e.date_vaccine2 = (select max(date_vaccine2) from e where e.destination2.id = ?1)")
    String getMaxTimeFromData_2(Long id_destination);



    @Query("SELECT u FROM Customer u WHERE u.verificationCode = ?1")
    Customer findByVerificationCode(String code);

//     Khanh
    @Query("SELECT c FROM Customer c WHERE c.CMND LIKE %?1%")
    Page<Customer> searchUserAdmin(String search, Pageable pageable);

//    Destination Account
    @Query("SELECT e FROM Customer e WHERE e.isDoctor = 1")
    List<Customer> getAllDestinationAccount();

    //    Customer Account
    @Query("SELECT e FROM Customer e WHERE e.isDoctor = 0")
    Page<Customer> findAllCustomerAccount(Pageable pageable);

    @Query("SELECT c from  Customer  c WHERE c.destination.id=?1 and c.isInjection=0")
    List<Customer> findByDestination(Long id);

//    Destination Page
    @Query("SELECT e from Customer  e WHERE (e.date_vaccine = ?1 or e.date_vaccine2 = ?1 ) AND (e.destination.id = ?2 or e.destination2.id = ?2)")
    Page<Customer> findCustomerIsDoneInDay(String date_vaccine, Long id_destination,Pageable pageable);

    @Query("SELECT e from Customer  e WHERE ( e.date_vaccine = ?1 or e.date_vaccine2 = ?1 ) AND ( e.destination.id = ?2 or e.destination2.id =?2 ) AND e.CMND like %?3% ")
    Page<Customer> searchCustomerByCMND(String date_vaccine, Long id_destination,String cmnd,Pageable pageable);

    @Query("SELECT DISTINCT  e.date_vaccine from Customer  e WHERE  e.destination.id = ?1 and e.isDoctor = 0")
    List<String> findDayInOneDestination(Long id_destination);

    @Query("SELECT c from Customer  c WHERE c.date_vaccine=?1 and c.destination.id=?2")
    List<Customer> ListCustomerIsOneInDay(String date_vaccine , Long id_destination);


    @Query("SELECT c from  Customer  c WHERE c.vaccine.id=?1")
    List<Customer> ListCustomerByVaccine(Long id);

                 // Dashboard
    @Query("SELECT DISTINCT  e.date_vaccine from Customer e")
    List<String> ListDayOfAllCustomer();
    @Query("SELECT DISTINCT  e.destination.destination_name from Customer e where e.destination.isDelete = 0")
    List<String> ListDestinationChart();

    @Query("SELECT  count (e) from Customer e where e.date_vaccine = ?1")
    int getRegisterNumberInOneDay(String day);
    @Query("SELECT  count (e) from Customer e where e.destination.destination_name = ?1")
    int getRegisterNumberInDestination(String name_destination);

    @Query("SELECT  count (e) from Customer e where e.date_vaccine = ?1 and (e.isInjection = 1 or e.isInjection2 = 3 )")
    int getIsInjectionNumberInOneDay(String day) ;
    @Query("SELECT  count (e) from Customer e where e.destination.destination_name = ?1 and (e.isInjection = 1 or e.isInjection2 = 3 )")
    int getIsInjectionNumberDestination(String name_destination) ;


    @Query("SELECT max(c.id) from Customer c WHERE c.destination.id=?1 and c.date_vaccine=?2 and c.vaccine.id=?3")
    Long maxIdOneDayVaccine(Long idDes,String date,Long idVac);

    @Query("SELECT c from Customer c where c.destination.id=?1 and c.isInjection=1 and c.isInjection2 = 0")
    List<Customer> ListCustomerInjection2(Long id);

    @Query("SELECT c from Customer c where c.destination.id=?1 and c.date_vaccine=?2")
    Iterable<Customer> ListCustomerInjectionByDes(Long id,String date);


}
