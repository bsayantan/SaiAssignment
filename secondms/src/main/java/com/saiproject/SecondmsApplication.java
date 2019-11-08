package com.saiproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SecondmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondmsApplication.class, args);
	}

}
