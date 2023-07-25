package com.globallogic.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.globallogic.rabbitmq.constant.Constants;
import com.globallogic.rabbitmq.dto.Order;
import com.globallogic.rabbitmq.dto.OrderStatus;

@Component
public class Consumer {

	@RabbitListener(queues= Constants.QUEUE)
	public void consumeMessageFromQueue(Order order) {
		System.out.println("Message received from Queue: "+order);
	}
	
}
