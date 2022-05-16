package com.monta.CICD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class CicdApplication {
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to java cicd ";
	}

	public static void main(String[] args) {
		SpringApplication.run(CicdApplication.class, args);
	}

}
