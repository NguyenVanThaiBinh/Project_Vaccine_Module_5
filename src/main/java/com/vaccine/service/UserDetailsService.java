package com.vaccine.service;




import com.vaccine.model.Customer;
import com.vaccine.model.Customer_Role;
import com.vaccine.repository.ICustomerRepository;
import com.vaccine.repository.ICustomerRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private ICustomerRepository appUserRepository;

    @Autowired
    private ICustomerRoleRepository userRoleRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException, DisabledException {
        Customer appUser = this.appUserRepository.findByUserCMND(userName);

        if (appUser == null ) {
            System.err.println("User not found !!! " + userName);
            throw new UsernameNotFoundException("User " + userName + " was not found !!! ");
        }
        if (appUser.isEnabled() == false) {
            System.err.println("User is disable !!! " + userName);
            throw new DisabledException("User " + userName + " was disable !!! ");
        }




        // [ROLE_USER, ROLE_ADMIN,..]
        List<Customer_Role> userRoleList = this.userRoleRepository.findByAppUser(appUser);


        List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
        if (userRoleList != null) {
            for (Customer_Role userRole : userRoleList) {
                // ROLE_USER, ROLE_ADMIN,..
                GrantedAuthority authority = new SimpleGrantedAuthority(userRole.getAppRole().getRoleName());
                grantList.add(authority);
            }
        }

        UserDetails userDetails = (UserDetails) new User(appUser.getCMND(), //
                appUser.getEncrytedPassword(), grantList);

        return userDetails;
    }

}
