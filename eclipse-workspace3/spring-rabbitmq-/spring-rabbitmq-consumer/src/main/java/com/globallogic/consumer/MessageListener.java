package com.globallogic.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import com.globallogic.constant.Constants;
import com.globallogic.dao.CustomMessage;

@Component
public class MessageListener {

	
	@RabbitListener(queues = Constants.QUEUE)
	public void listener(CustomMessage custom) {
		System.out.println("messae");
		System.out.println(custom);
	}
}
