package com.example.consumer.kafka;

import com.example.consumer.model.Payload;
import com.example.consumer.repository.KafkaMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@Slf4j
public class Consumer {
    @Autowired
    private KafkaMessage kafkaMessage;
    @KafkaListener(topics = "users", groupId = "group_id" /*,autoStartup = "${listen.auto.start:true}", concurrency = "${listen.concurrency:3}"*/)
    public void consume(String message) throws IOException {
        log.info(String.format("#### -> Consumed message -> %s", message));
        Payload payload = new Payload();
        payload.setValue(message);
        kafkaMessage.save(payload);
    }
}