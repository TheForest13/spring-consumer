package com.theforest.springconsumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics="logchannel", groupId="mygroup")
    public void consumeFromTopic(String message) {
        System.out.println("Consummed message "+message);
    }
}
