package com.jpmc.midascore.config;

import com.jpmc.midascore.foundation.Transaction;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;

@Configuration
@EnableKafka
public class KafkaConfig {
    // Let Spring Boot auto-configure Kafka for embedded testing
}
