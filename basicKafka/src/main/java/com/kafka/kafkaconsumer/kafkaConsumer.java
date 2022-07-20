package com.kafka.kafkaconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
@Component
public class kafkaConsumer {
	@KafkaListener(topics = "secondTopic", groupId = "group_id")
    public void processMessage(String content){
        System.out.println("Message: " + content);
    }

}
