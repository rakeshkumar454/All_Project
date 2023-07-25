package com.globallogic.config;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.globallogic.constant.Constants;

@Configuration
public class MQConfig {
	
	//Create queue
	@Bean
	public Queue queue() {
		return new Queue(Constants.QUEUE);
	}
	
	//Create exchange
	@Bean
	public TopicExchange exchange() {
		return new TopicExchange(Constants.EXCHANGE);
	}
	
	//Bind together (queue and exchange).
	@Bean
	public Binding binding(Queue queue,TopicExchange exchange) {
		return BindingBuilder
				.bind(queue)
				.to(exchange)
				.with(Constants.ROUNTING_KEY);		
	}
	
	//We are passing entire class so that we have to convert as json.so we use messageconverter to send particular queue
	@Bean
	public MessageConverter messageConverter() {
		return new Jackson2JsonMessageConverter();
	}
	
	//create Rabbit MQ template .connectionfactory as input paramter and we are going to create rabbit mq template
	public AmqpTemplate template(ConnectionFactory connectionFactory) {
		 RabbitTemplate template=new RabbitTemplate(connectionFactory);
		 
		 template.setMessageConverter(messageConverter());
		 
		 return template;
	}

	
}
