package com.vaccine.model;

import javax.persistence.*;

@Entity
@Table(name = "registerDays")
public class RegisterDays {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String date;

    int amountRegister;

    @Column(columnDefinition = "integer default '0' ")
    int countSubmit;


}
