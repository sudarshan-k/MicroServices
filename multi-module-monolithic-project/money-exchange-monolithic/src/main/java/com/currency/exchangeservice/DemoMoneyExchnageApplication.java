package com.currency.exchangeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.currency.exchangeservice.*" })
@ComponentScan(basePackages = { "com.currency.conversion.*" })
public class DemoMoneyExchnageApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMoneyExchnageApplication.class, args);
	}

}
