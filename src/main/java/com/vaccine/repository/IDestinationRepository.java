package com.vaccine.repository;

import com.vaccine.model.Destination;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDestinationRepository extends JpaRepository<Destination,Long> {
    @Query("select d from Destination d WHERE d.isDelete=?1")
    Page<Destination> findAllBySttDelete(int isDelete, Pageable pageable);

    @Query("select d from Destination d WHERE d.isDelete=0 and d.isOpen=0")
    List<Destination> findAllIsOpenDestination();

}
