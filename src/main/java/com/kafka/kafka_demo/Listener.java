package com.kafka.kafka_demo;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

    @KafkaListener(topics = "topic1")
    public void listenerT1(ConsumerRecord<?, ?> consumerRecord) throws Exception{
        System.out.println("listenT1收到消息！！  topic:>>>   "+ consumerRecord.topic()+"   key:>>>  "+consumerRecord.key()+"   value:>>>  "+consumerRecord.value());
    }


}
