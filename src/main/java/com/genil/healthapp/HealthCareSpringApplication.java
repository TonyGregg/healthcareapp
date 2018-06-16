package com.genil.healthapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@SpringBootApplication
public class HealthCareSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthCareSpringApplication.class, args);
	}

	@GetMapping("/")
	/**
	 * Return hello to the clients !
	 */
	public String sayHello() {
		return "Welcome to heathcare app. The time is "+LocalDateTime.now();
	}
}
