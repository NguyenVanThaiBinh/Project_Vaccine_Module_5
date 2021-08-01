package com.vaccine.model;

import javax.persistence.*;

@Entity
@Table(name = "Customer_Role" //
//        uniqueConstraints = { //
//                @UniqueConstraint(name = "USER_ROLE_UK", columnNames = { "User_Id", "Role_Id" }) }
)
public class Customer_Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "Customer_Id")
    private Customer appUser;

    @ManyToOne
    @JoinColumn(name = "Role_Id")
    private Role appRole;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getAppUser() {
        return appUser;
    }

    public void setAppUser(Customer appUser) {
        this.appUser = appUser;
    }

    public Role getAppRole() {
        return appRole;
    }

    public Customer_Role(Customer appUser, Role appRole) {
        this.appUser = appUser;
        this.appRole = appRole;
    }

    public Customer_Role() {
    }

    public void setAppRole(Role appRole) {
        this.appRole = appRole;
    }

}
