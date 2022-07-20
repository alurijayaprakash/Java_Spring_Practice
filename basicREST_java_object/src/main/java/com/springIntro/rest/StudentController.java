package com.springIntro.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {
	
	@GetMapping("/studentData")
	
	public Student getStudent() {
		return new Student("Jaya", "Prakash");
	}

}
