package com.vaccine.repository;

import com.vaccine.model.Destination;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IDestinationRepository extends JpaRepository<Destination,Long> {
}
