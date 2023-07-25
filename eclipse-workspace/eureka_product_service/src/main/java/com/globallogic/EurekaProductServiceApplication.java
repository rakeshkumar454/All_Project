package com.globallogic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaProductServiceApplication.class, args);
	}

}
