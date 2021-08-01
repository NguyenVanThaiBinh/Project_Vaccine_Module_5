package com.vaccine.repository;


import com.vaccine.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {

    @Query("SELECT e FROM Customer e WHERE e.CMND = ?1")
    Customer findByUserCMND(String cmnd);

    @Query(" select count(e.time_vaccine) from Customer e where e.destination.id = ?1 and (e.healthy_status = 1 or  e.healthy_status = 2) and" +
            "  e.time_vaccine = (select max(time_vaccine) from e where e.destination.id = ?1 and e.date_vaccine =  (select max(date_vaccine) from e where e.destination.id = ?1))  " +
            "and e.date_vaccine =  (select max(date_vaccine) from e where e.destination.id = ?1)")
    Integer  countMaxTimeInDay(Long id_destination);

    @Query(" select count(e.date_vaccine) from Customer e where e.destination.id = ?1 and (e.healthy_status = 1 or  e.healthy_status = 2) and  e.date_vaccine = (select max(date_vaccine) from e where e.destination.id = ?1)")
    int  countMaxDayToNext(Long id_destination);

    @Query("select max(e.date_vaccine) from Customer e where e.destination.id = ?1 and  (e.healthy_status = 1 or  e.healthy_status = 2) ")
    String getMaxDayFromData(Long id_destination);

    @Query("select max(e.time_vaccine) from Customer e where e.destination.id = ?1 and (e.healthy_status = 1 or  e.healthy_status = 2) and  e.date_vaccine = (select max(date_vaccine) from e where e.destination.id = ?1)")
    String getMaxTimeFromData(Long id_destination);

    @Query("SELECT u FROM Customer u WHERE u.verificationCode = ?1")
    public Customer findByVerificationCode(String code);

//     Khanh
    @Query("SELECT c FROM Customer c WHERE c.CMND LIKE %?1%")
    Page<Customer> searchUserAdmin(String search, Pageable pageable);





}
