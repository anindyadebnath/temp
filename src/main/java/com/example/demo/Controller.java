package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	@GetMapping("/")
	public String status() {
		return "Application is up and running...";
	}
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello there.......";
	}
}
