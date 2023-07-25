package com.globallogic.controller;

import java.util.Date;
import java.util.UUID;


import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.constant.Constants;
import com.globallogic.dao.CustomMessage;

@RestController
public class MessagePublisher {
	
	@Autowired
	RabbitTemplate template;
	
	@PostMapping("/publish")
	public String publishMessage(@RequestBody CustomMessage customMessage) {
		customMessage.setMessageId(UUID.randomUUID().toString());
		customMessage.setMessage(customMessage.getMessage());
		customMessage.setMessageDate(new Date());
		
		template.convertSendAndReceive(Constants.EXCHANGE, Constants.ROUNTING_KEY, customMessage);
		
		return "Message publish";
		
	}

}
