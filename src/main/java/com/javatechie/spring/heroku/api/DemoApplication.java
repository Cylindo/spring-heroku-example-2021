package com.javatechie.spring.heroku.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
	@GetMapping("/")
	public String sayHi() {
		return "Welcome to heroku";
	};

	@GetMapping("/message/{input}")
	public String getMessage() {
		return "Welcome" + input;
	};
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
