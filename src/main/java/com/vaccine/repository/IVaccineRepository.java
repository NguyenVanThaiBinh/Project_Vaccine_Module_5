package com.vaccine.repository;



import com.vaccine.model.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IVaccineRepository extends JpaRepository<Vaccine, Long> {
    @Query("select v from Vaccine v WHERE v.register_amount>0")
    List<Vaccine> findAllByRegister();

    @Query("select sum(v.register_amount) from Vaccine v")
    int sumVaccine();
}
