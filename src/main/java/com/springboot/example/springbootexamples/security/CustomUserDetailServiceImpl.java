package com.springboot.example.springbootexamples.security;

import com.springboot.example.springbootexamples.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component("customUserDetailServiceImpl")
public class CustomUserDetailServiceImpl implements UserDetailsService {

    private final UserRepository userRepoService;

    public CustomUserDetailServiceImpl(UserRepository userRepoService) {
        this.userRepoService = userRepoService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepoService.findByUsername(username);
    }
}
