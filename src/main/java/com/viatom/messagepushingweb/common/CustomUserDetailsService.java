package com.viatom.messagepushingweb.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * @author qiujiawei
 * @description CustomUserDetailsService
 * @date 2020/11/4 10:55
 */
//@Component
public class CustomUserDetailsService implements UserDetailsService {

//    @Autowired
//    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
