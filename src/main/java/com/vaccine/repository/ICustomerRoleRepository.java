package com.vaccine.repository;



import com.vaccine.model.Customer;
import com.vaccine.model.Customer_Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICustomerRoleRepository extends JpaRepository<Customer_Role,Long> {

    List<Customer_Role> findByAppUser(Customer customer);

}
