package com.kafka.kafkaproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSend {
	@Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    String kafkaTopic = "firstTopic";

    public void send(String message) {

        kafkaTemplate.send(kafkaTopic, message);
    }

}
