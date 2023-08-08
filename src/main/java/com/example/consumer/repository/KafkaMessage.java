package com.example.consumer.repository;

import com.example.consumer.model.Payload;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KafkaMessage extends JpaRepository<Payload, Long> {
}