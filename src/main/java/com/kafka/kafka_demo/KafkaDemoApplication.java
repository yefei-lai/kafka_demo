package com.kafka.kafka_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KafkaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaDemoApplication.class, args);
    }

    @KafkaListener(topics = "data")
    public void listenerTest(String consumerRecord) throws Exception{
        System.out.println("listenTest收到消息 >>> "+ consumerRecord);
    }

}
