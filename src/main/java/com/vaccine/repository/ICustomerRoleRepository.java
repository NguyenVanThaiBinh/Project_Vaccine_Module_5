package com.vaccine.repository;



import com.vaccine.model.Customer;
import com.vaccine.model.Customer_Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICustomerRoleRepository extends JpaRepository<Customer_Role,Long> {

    List<Customer_Role> findByAppUser(Customer customer);

    @Query("select e from Customer_Role  e where e.appUser.id = ?1")
    Customer_Role findCustomer_RoleByIdCustomer(Long id_customer);

}
