package com.globallogic.rabbitmq.publisher;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.rabbitmq.constant.Constants;
import com.globallogic.rabbitmq.dto.Order;
import com.globallogic.rabbitmq.dto.OrderStatus;


@RestController
@RequestMapping("/order")
public class OrderPublisher {

	@Autowired
	private RabbitTemplate template;
	
	@PostMapping("/{restaurantName}")
	public String bookOrder(@RequestBody Order order, @PathVariable String restaurantName) {
	order.setOrderId(UUID.randomUUID().toString());
	OrderStatus orderStatus= new OrderStatus(order, "Process","order placed successfully");
	template.convertAndSend(Constants.EXCHANGE, Constants.ROUTING_KEY, order);
	return "success";
	}
}
