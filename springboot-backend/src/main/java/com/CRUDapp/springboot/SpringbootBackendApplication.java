package com.CRUDapp.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.Data;

@Data
@SpringBootApplication
public class SpringbootBackendApplication {
	
	private String name;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
		String name = "Hello";
		System.out.println(name);
	}

}

