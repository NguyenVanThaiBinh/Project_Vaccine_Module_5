package com.vaccine.config;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.nimbusds.jose.*;
import com.nimbusds.jose.crypto.MACSigner;
import com.nimbusds.jose.crypto.MACVerifier;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;
import com.vaccine.model.Customer;
import com.vaccine.model.Customer_Role;
import com.vaccine.model.security.UserPrinciple;
import com.vaccine.repository.ICustomerRepository;
import com.vaccine.repository.ICustomerRoleRepository;
import io.jsonwebtoken.*;
import io.jsonwebtoken.security.SignatureException;
import net.minidev.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.*;

@Component
public class JwtUtil {
    @Autowired
    private ICustomerRepository appUserRepository;

    @Autowired
    private ICustomerRoleRepository userRoleRepository;


    private static Logger logger = LoggerFactory.getLogger(JwtUtil.class);
    private static final String USER = "Customer Info";
    public static final long JWT_TOKEN_VALIDITY = 1000L;
    private static final String SECRET_KEY = "cogaibensongngoimotminhbuonquahuhutoiquahuhu";

    public String generateToken(UserPrincipal user) {
        String token = null;
        try {
            JWTClaimsSet.Builder builder = new JWTClaimsSet.Builder();
            builder.claim(USER, user);
            builder.expirationTime(generateExpirationDate());
            JWTClaimsSet claimsSet = builder.build();
            SignedJWT signedJWT = new SignedJWT(new JWSHeader(JWSAlgorithm.HS256), claimsSet);
            JWSSigner signer = new MACSigner(SECRET_KEY.getBytes());
            signedJWT.sign(signer);
            token = signedJWT.serialize();
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return token;
    }

    public String generateTokenLogin(Authentication authentication) {
        UserPrinciple userPrincipal = (UserPrinciple) authentication.getPrincipal();

        return Jwts.builder()
                .setSubject((userPrincipal.getUsername()))
                .setIssuedAt(new Date())
                .setExpiration(new Date((new Date()).getTime() + JWT_TOKEN_VALIDITY * 60  ))
                .signWith(SignatureAlgorithm.HS512, SECRET_KEY)
                .compact();
    }

    public Date generateExpirationDate() {
        return new Date(System.currentTimeMillis() + (1000*60));
    }

    public JWTClaimsSet getClaimsFromToken(String token) {
        JWTClaimsSet claims = null;
        if (token != null) {

            try {
                SignedJWT signedJWT = SignedJWT.parse(token);
                JWSVerifier verifier = new MACVerifier(SECRET_KEY.getBytes());
                if (signedJWT.verify(verifier)) {
                    claims = signedJWT.getJWTClaimsSet();
                }
            } catch (ParseException | JOSEException e) {
                logger.error(e.getMessage());
            }
        }
        return claims;
    }

    public UserPrincipal getUserFromToken(String token) {
        UserPrincipal user = null;
        try {
            JWTClaimsSet claims = getClaimsFromToken(token);
            if (claims != null && isTokenExpired(claims)) {
                JSONObject jsonObject = (JSONObject) claims.getClaim(USER);
                user = new ObjectMapper().readValue(jsonObject.toJSONString(), UserPrincipal.class);
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return user;
    }

    private Date getExpirationDateFromToken(JWTClaimsSet claims) {
        return claims != null ? claims.getExpirationTime() : new Date();
    }

    public boolean isTokenExpired(JWTClaimsSet claims) {
        return getExpirationDateFromToken(claims).after(new Date());
    }

    public boolean validateJwtToken(String authToken) {
        try {
            Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(authToken);
            return true;
        } catch (SignatureException e) {
            logger.error("Invalid JWT signature -> Message: {} ", e);
        } catch (MalformedJwtException e) {
            logger.error("Invalid JWT token -> Message: {}", e);
        } catch (ExpiredJwtException e) {
            logger.error("Expired JWT token -> Message: {}", e);
        } catch (UnsupportedJwtException e) {
            logger.error("Unsupported JWT token -> Message: {}", e);
        } catch (IllegalArgumentException e) {
            logger.error("JWT claims string is empty -> Message: {}", e);
        }

        return false;
    }

    public UserPrincipal findByUsername(String CMND) {
        Customer customer = appUserRepository.findByUserCMND(CMND);
        UserPrincipal userPrincipal = new UserPrincipal();
        List<Customer_Role> userRoleList = this.userRoleRepository.findByAppUser(customer);

        Set<String> authorities = new HashSet<>();
        if (userRoleList != null) {
            for (Customer_Role userRole : userRoleList) {
                // ROLE_USER, ROLE_ADMIN,..
                authorities.add(userRole.getAppRole().getRoleName());
            }
        }

        userPrincipal.setUserId(customer.getId());
        userPrincipal.setUsername(customer.getCMND());
        userPrincipal.setPassword(customer.getPassword());
        userPrincipal.setAuthorities(authorities);

        return userPrincipal;
    }


}
