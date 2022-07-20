package com.springIntro.urlmap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class firstHelloWorld {
	
	// Get HTTP Method
	// localhost url : http://localhost:8080/first
	
	@GetMapping("/first")
	public String firstProgram() {
		return "Hey Prakash...! , this is basic URL Mapping program";
	}

}
