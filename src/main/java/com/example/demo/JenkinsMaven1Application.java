package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsMaven1Application {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsMaven1Application.class, args);
		
	}
	
	@GetMapping("/index")
	public String index()
	{
		return "Welcome to Springboot";
	}

}
