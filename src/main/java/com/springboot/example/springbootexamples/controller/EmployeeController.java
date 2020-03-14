package com.springboot.example.springbootexamples.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {

    @GetMapping(path = "/list")
    public List listEmployee(){
        ArrayList arrayList = new ArrayList<String>();
        arrayList.add("employee1");
        arrayList.add("employee2");
        arrayList.add("employee3");
        return arrayList;
    }
}
