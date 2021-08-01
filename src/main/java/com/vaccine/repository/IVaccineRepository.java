package com.vaccine.repository;



import com.vaccine.model.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVaccineRepository extends JpaRepository<Vaccine, Long> {




}
