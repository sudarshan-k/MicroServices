package com.currency.conversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoMoneyConvertorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMoneyConvertorApplication.class, args);
	}

}
