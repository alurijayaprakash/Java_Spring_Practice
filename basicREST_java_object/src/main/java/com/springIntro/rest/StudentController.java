package com.springIntro.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {
	
	// get single java object
	
	// http://localhost:8080/student/
	
	@GetMapping("/student")
	
	public Student getStudent() {
		return new Student("Jaya", "Prakash");
	}
	
	
	// get list of Java Objects
	// http://localhost:8080/students/
	
	@GetMapping("/students")
	
	public List<Student> getStudents() {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("Sony", "Company"));
		students.add(new Student("Dell", "Company"));
		students.add(new Student("Tech", "Mojo"));
		students.add(new Student("MI", "India"));
		return students;
	}
	
	// use path variable to read data from end point
	// @PathVariable Annotation 
	// http://localhost:8080/student/Jaya/Prakash
	@GetMapping("/student/{firstName}/{lastName}")
	public Student getStudentPathVariable(@PathVariable ("firstName") String firstName, @PathVariable ("lastName") String lastName) {
		return new Student(firstName, lastName);
	}
	
	// Request params
	// http://localhost:8080/student/query?firstName=Jaya&lastName=Prakash
	@GetMapping("/student/query")
	public Student getStudentParams(@RequestParam (name = "firstName") String firstName, @RequestParam (name = "lastName") String lastName) {
		return new Student(firstName, lastName);
	}

}
