package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.Service.WebClients;

@SpringBootApplication
public class WebClientProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(WebClientProjectApplication.class, args);
		
		WebClients bean = run.getBean(WebClients.class);
		bean.getData1();
	}

}
