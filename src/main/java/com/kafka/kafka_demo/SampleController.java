package com.kafka.kafka_demo;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * kafka Producer
 */
@RestController
public class SampleController {

    @Autowired
    private KafkaTemplate<String, String> template;


    @GetMapping("/send")
    String send(String topic, String key, String data){
        template.send(topic, key, data);
        return "success";
    }
}
