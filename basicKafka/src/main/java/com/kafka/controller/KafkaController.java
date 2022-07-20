package com.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.kafkaproducer.KafkaSend;


@RestController

@RequestMapping(value = "/kafka-example/")
public class KafkaController {
	@Autowired
    KafkaSend kafkaSend;
	
    @GetMapping(value = "/produce")
    public String producer(@RequestParam("message") String message) {
        kafkaSend.send(message);
        return "Success";

    }
}
