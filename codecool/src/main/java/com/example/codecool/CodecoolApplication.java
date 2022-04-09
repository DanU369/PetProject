package com.example.codecool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class CodecoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodecoolApplication.class, args);
	}

}
