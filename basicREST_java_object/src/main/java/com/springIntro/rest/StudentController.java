package com.springIntro.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {
	
	@GetMapping("/student")
	
	public Student getStudent() {
		return new Student("Jaya", "Prakash");
	}
	
	@GetMapping("/students")
	
	public List<Student> getStudents() {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("Sony", "Company"));
		students.add(new Student("Dell", "Company"));
		students.add(new Student("Tech", "Mojo"));
		students.add(new Student("MI", "India"));
		return students;
	}

}
