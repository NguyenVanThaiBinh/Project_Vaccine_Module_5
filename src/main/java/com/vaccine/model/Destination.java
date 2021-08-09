package com.vaccine.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Table(name="destinations")
public class Destination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String destination_name;

    String date_start;

    String date_end;

    @Column(columnDefinition = "integer default '0' ")
    int isOpen;

    @Column(columnDefinition = "integer default '0' ")
    int isDelete;

    int people_perHour;




    @ManyToOne
    @JoinColumn(name = "id_warehouse_vaccine")
    private WarehouseVaccine warehouseVaccine;
}
