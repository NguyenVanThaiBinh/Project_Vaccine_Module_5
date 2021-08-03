package com.vaccine.repository;

import com.vaccine.model.WarehouseVaccine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IWarehouseRepository extends JpaRepository<WarehouseVaccine, Long> {
}
