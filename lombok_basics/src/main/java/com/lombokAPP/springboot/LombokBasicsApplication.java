package com.lombokAPP.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LombokBasicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokBasicsApplication.class, args);
		Student student = new Student();
		student.setFirstName("JayaPrakash");
		student.setLastName("Aluri");
		student.setId(12);
		
		System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getId() + " DONE");
		
	}

}

// Ref Video : https://www.youtube.com/watch?v=VR7VaiXHJEY
//
