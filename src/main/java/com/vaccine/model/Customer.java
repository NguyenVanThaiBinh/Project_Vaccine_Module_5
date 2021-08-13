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
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String customer_name;

    @Column(unique = true,length = 9)
    String CMND;

    String password;

    String phone_number;

    String email;

    int age;

    String gender;

    //    Huyen
    String district;

    //    Xa~
    String commune;

    String healthy_info;

    String date_vaccine;

    String time_vaccine;

    int healthy_status;

    String date_vaccine2;

    String time_vaccine2;

    @Column(columnDefinition = "integer default '0' ")
    int isInjection2;

//    phân biệt tài khoản mỗi điểm tiêm
    @Column(columnDefinition = "integer default '0' ")
    int isDoctor;

//    đã tiêm hay chưa
    @Column(columnDefinition = "integer default '0' ")
    int isInjection;

    @ManyToOne
    @JoinColumn(name = "id_destination")
    private Destination destination;

    @ManyToOne
    @JoinColumn(name = "id_destination2")
    private Destination destination2;

    @ManyToOne
    @JoinColumn(name = "id_vaccine")
    private Vaccine vaccine;

    public String getEncrytedPassword() {
        return password;
    }

    public Customer(String userName, String CMND, String password){
        this.customer_name = userName;
        this.CMND = CMND;
        this.password = password;
    }

    @Column(name = "verification_code", length = 64)
    private String verificationCode;

    @Column( nullable = false)
    private boolean enabled = false;

}
