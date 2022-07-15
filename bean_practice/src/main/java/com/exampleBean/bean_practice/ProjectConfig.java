package com.exampleBean.bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

	// bean creation
	@Bean
	Vehicle vehicle() {
		Vehicle veh = new Vehicle();
		veh.setName("Audi 8");
		return veh;
	}
}
