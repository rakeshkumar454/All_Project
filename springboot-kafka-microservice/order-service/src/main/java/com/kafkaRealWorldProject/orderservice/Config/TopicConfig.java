package com.kafkaRealWorldProject.orderservice.Config;

import lombok.Value;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfig {
//    @Value("${spring.kafka.topic.name}")
//    private String topicName;
     //spring bean for kafka topic
    @Bean
    public NewTopic topic(){
        return TopicBuilder.name("order_topic").build();
    }
}
