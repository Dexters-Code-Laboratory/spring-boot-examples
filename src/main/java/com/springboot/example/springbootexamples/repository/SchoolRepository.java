package com.springboot.example.springbootexamples.repository;


import com.springboot.example.springbootexamples.domain.School;
import com.springboot.example.springbootexamples.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository<School, String> {

}