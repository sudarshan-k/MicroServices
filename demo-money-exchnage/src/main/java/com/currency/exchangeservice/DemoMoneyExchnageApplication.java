package com.currency.exchangeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DemoMoneyExchnageApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMoneyExchnageApplication.class, args);
	}

}
