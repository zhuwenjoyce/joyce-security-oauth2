package com.joyce.security.security_customer_service.service;

import com.joyce.security.security_customer_service.model.MyUserDetails;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Joyce Zhu
 * @date: 2021/2/2
 */
@Slf4j
@NoArgsConstructor
public class MyUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if(StringUtils.equals(username, "joyce")){ // 模拟dao层query user结果
            MyUserDetails user = MyUserDetails.builder()
                    .userId(100L)
                    .username("joyce")
                    .password("123")
                    .age(18)
                    .build();
            log.info("build User entity. userId = 100");

            List<GrantedAuthority> authorities = new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority("AdminRole"));
            authorities.add(new SimpleGrantedAuthority("UserRole"));

            String encodePassword = new BCryptPasswordEncoder().encode(user.getPassword());

            // 重点看这个哦new BCryptPasswordEncoder().encode(user.getPassword())
            return new org.springframework.security.core.userdetails
                    .User(username, encodePassword, authorities);
        }
        log.info("cannot found user when username = {}", username);
        return null;
    }
}
