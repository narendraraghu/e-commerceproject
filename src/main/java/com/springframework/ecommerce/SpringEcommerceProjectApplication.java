package com.springframework.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableScheduling //Enable autoatica task Schedular
@EnableAsync
public class SpringEcommerceProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEcommerceProjectApplication.class, args);
	}
}
