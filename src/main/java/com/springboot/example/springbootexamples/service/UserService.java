package com.springboot.example.springbootexamples.service;


import com.springboot.example.springbootexamples.domain.User;

//Todo remove this
public interface UserService {
    public User findUserByEmail(String email);

    public void saveUser(User user);
}