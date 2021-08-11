package com.vaccine.config;

import com.nimbusds.jwt.JWTClaimsSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Component
public class JwtRequestFilter extends OncePerRequestFilter {

    @Autowired
    private JwtUtil jwtUtil;

    private String getCookieValue(HttpServletRequest req, String cookieName) {
        return Arrays.stream(req.getCookies())
                .filter(c -> c.getName().equals(cookieName))
                .findFirst()
                .map(Cookie::getValue)
                .orElse(null);
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        final String authorizationHeader = request.getHeader("Authorization");
        UserPrincipal user = null;
        String token = null;

        try{
            final String authorizationCookie = getCookieValue(request, "JWT");
            if (authorizationCookie != null) {
                assert false;
                token = authorizationCookie;
                user = jwtUtil.getUserFromToken(authorizationCookie);
            }
        }catch (Exception e){
            System.err.println("JWT is null!!!");
            filterChain.doFilter(request, response);
            return;

        }

        if (StringUtils.hasText(authorizationHeader) && authorizationHeader.startsWith("Bearer ")) {
            String jwt = authorizationHeader.substring(7);
            user = jwtUtil.getUserFromToken(jwt);
            token = jwt;


        }

        if (null != user && token != null) {
            JWTClaimsSet claims = jwtUtil.getClaimsFromToken(token);
            // Claims là in ra cái HSD của token
//            System.out.println("Claims is: "+claims.getExpirationTime());
            if (jwtUtil.isTokenExpired(claims)) {
                System.out.println("JWT is ok??? ");
                // Còn hạn thì cho qua Spring Security
                Set<GrantedAuthority> authorities = new HashSet<>();

                user.getAuthorities().forEach(p -> authorities.add(new SimpleGrantedAuthority((String) p)));

                UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(user, null, authorities);

                authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

                SecurityContextHolder.getContext().setAuthentication(authentication);

                filterChain.doFilter(request, response);
                return;
            }else{
                System.out.println("JWT is Expired??? ");
                response.sendRedirect("/login?error=jwt");
                filterChain.doFilter(request, response);
                return;
            }
        }

        filterChain.doFilter(request, response);
    }

}
