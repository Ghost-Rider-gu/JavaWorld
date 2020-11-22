/*
 * Copyright (c) 2020. Iurii Golubnichenko aka Ghost Rider
 */

package corp.siendev.com.javaworld.service;

import corp.siendev.com.javaworld.model.JavaWorldUser;
import corp.siendev.com.javaworld.model.JavaWorldUserDetails;
import corp.siendev.com.javaworld.repository.JavaWorldUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JavaWorldUserDetailsService implements UserDetailsService {

    private final JavaWorldUserRepository userRepository;

    @Autowired
    public JavaWorldUserDetailsService(JavaWorldUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        JavaWorldUser javaWorldUser = userRepository.findByUserName(userName)
                .orElseThrow(() -> new UsernameNotFoundException("User [" + userName + "] not found in database."));
        return new JavaWorldUserDetails(javaWorldUser);
    }
}
