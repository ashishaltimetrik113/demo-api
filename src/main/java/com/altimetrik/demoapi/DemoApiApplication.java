package com.altimetrik.demoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
@SpringBootApplication
public class DemoApiApplication {
	
	@GetMapping("get/welcome")
	public String welcomeApi() {
		return "{\"message\":\"Welcome to this API\"}";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApiApplication.class, args);
	}

}
