package com.kafkaRealWorldProject.basedomains.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEvent {
    private String message;
    private String status;
    private Order Order;
    // this is the class which is using for data transfer between producer and consumer using apache kafka.
}
