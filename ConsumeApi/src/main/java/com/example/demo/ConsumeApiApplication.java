package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.Service.ApiConsumeService;

@SpringBootApplication
public class ConsumeApiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(ConsumeApiApplication.class, args);
	
	ApiConsumeService bean = run.getBean(ApiConsumeService.class);
	//bean.getUser();
	bean.saveData();
	}

}
