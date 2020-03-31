package com.springboot.example.springbootexamples;

import com.springboot.example.springbootexamples.domain.EntityMarker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
public class SpringBootExamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExamplesApplication.class, args);
	}

}
