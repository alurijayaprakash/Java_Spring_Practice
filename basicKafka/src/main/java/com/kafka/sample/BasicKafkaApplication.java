package com.kafka.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.kafka"})
public class BasicKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicKafkaApplication.class, args);
	}

}
