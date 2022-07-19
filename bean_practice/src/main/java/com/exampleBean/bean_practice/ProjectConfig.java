package com.exampleBean.bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

	// bean creation
	@Bean(name = "veh11")
	Vehicle vehicle1() {
		Vehicle veh = new Vehicle();
		veh.setName("Audi 1");
		return veh;
	}
	
	@Bean(value = "veh22")
	Vehicle vehicle2() {
		Vehicle veh = new Vehicle();
		veh.setName("Audi 2");
		return veh;
	}
	
	@Primary
	@Bean("veh33")
	Vehicle vehicle3() {
		Vehicle veh = new Vehicle();
		veh.setName("Audi 3");
		return veh;
	}
	
	
	@Bean
	String companyName() {
		return "Techmojo";
	}
	
	@Bean
	Integer empNum() {
		return 3426;
		
	}
}
