package com.globallogic.catlog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaCatlogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaCatlogServiceApplication.class, args);
	}

}
