package com.springIntro.component;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

// This is Component and Component scan annotation example
// JavaGuides, Siva sir

@SpringBootApplication
public class ComponentAnnotationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ComponentAnnotationApplication.class, args);
		business_logic mylogic = context.getBean(business_logic.class);
		System.out.println(mylogic.PrintHello());
		System.out.println("Congrats...!, Program successfully excecuted");
	}

}
