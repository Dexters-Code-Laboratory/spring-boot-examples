package com.springboot.example.springbootexamples.repository;


import com.springboot.example.springbootexamples.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmailId(String emailId);

    User findByUsername(String username);

    Long countByEmailId(String emailId);

}