package com.example.handout13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class Handout13Application {

	public static void main(String[] args) {
		SpringApplication.run(Handout13Application.class, args);
	}
	// The `GetMapping` annotation indicates that this method should be called
	// when handling GET requests to the "/simple-request" endpoint
	@GetMapping("/hello-world")
	public String simpleRequest() {
		// In this case, we return the plain text response "ok"
		return "hello world";
	}
}
