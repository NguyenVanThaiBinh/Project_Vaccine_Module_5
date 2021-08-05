package com.vaccine.model.security;

import com.vaccine.model.Customer;
import com.vaccine.model.Customer_Role;
import com.vaccine.repository.ICustomerRepository;
import com.vaccine.repository.ICustomerRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class UserPrinciple implements UserDetails {
    @Autowired
    private ICustomerRepository appUserRepository;

    @Autowired
    private ICustomerRoleRepository userRoleRepository;

    private static final long serialVersionUID = 1L;

    private Long id;

    private String username;

    private String password;

    private Collection<? extends GrantedAuthority> roles;

    public UserPrinciple(Long id,
                         String username, String password,
                         Collection<? extends GrantedAuthority> roles) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    public  UserPrinciple build(Customer user) {
//        List<GrantedAuthority> authorities = user.getRoles().stream().map(role ->
//                new SimpleGrantedAuthority(role.getName())
//        ).collect(Collectors.toList());
        List<Customer_Role> userRoleList = userRoleRepository.findByAppUser(user);
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        if (userRoleList != null) {
            for (Customer_Role userRole : userRoleList) {
                // ROLE_USER, ROLE_ADMIN,..
                GrantedAuthority authority = new SimpleGrantedAuthority(userRole.getAppRole().getRoleName());
                authorities.add(authority);
            }
        }
        return new UserPrinciple(
                user.getId(),
                user.getCustomer_name(),
                user.getPassword(),
                authorities
        );
    }

    public Long getId() {
        return id;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles;
    }


    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserPrinciple user = (UserPrinciple) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
