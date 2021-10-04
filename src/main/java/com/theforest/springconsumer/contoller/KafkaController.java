package com.theforest.springconsumer.contoller;

import com.theforest.springconsumer.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
    @Autowired
    Producer producer;

    @PostMapping(value="/post")
    public String sendMessage(@RequestParam("msg") String msg) {
        producer.publishToTopic(msg);
        return "done";
    }
}
