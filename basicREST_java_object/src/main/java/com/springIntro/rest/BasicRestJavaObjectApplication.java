package com.springIntro.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicRestJavaObjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicRestJavaObjectApplication.class, args);
	}

}


// Springboot Server auto restart
/*
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-devtools</artifactId>
</dependency>
*/