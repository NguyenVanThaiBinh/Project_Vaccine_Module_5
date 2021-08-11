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
@Table(name = "vaccines")
public class Vaccine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String vaccine_name;

    int vaccine_amount;

    int register_amount;

    @ManyToOne
    @JoinColumn(name = "id_warehouse")
    private WarehouseVaccine warehouseVaccine;
}
