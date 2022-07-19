package com.exampleBean.bean_practice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example {
	
	// Basic Java Implementation
	public static void main (String args[]) {
		Vehicle vehicle = new Vehicle();
		vehicle.setName("Audi111");
		System.out.println(vehicle.getName());
	
	
	// Spring implementation
	var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
	
//	Vehicle veh = context.getBean(Vehicle.class);
//	System.out.println("Spring implemented data" + veh.getName());
	
//	// Another Spring
//	String mydata = context.getBean(String.class);
//	System.out.println("Spring implemented String " + mydata);
//	
//	// Another Num
//	int mynum = context.getBean(Integer.class);
//	System.out.println("Spring implemented num " + mynum);
	
	Vehicle veh = context.getBean(Vehicle.class);
	System.out.println("Spring implemented data " + veh.getName());
//	context.close();
	
	}
}
