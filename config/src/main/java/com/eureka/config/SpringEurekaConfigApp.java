package com.eureka.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringEurekaConfigApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaConfigApp.class, args);
	}
}