package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.Service.UserService;

import io.swagger.v3.oas.models.annotations.OpenAPI30;

@SpringBootApplication
@OpenAPI30
public class ApiUserDetailsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(ApiUserDetailsApplication.class, args);
	UserService bean = run.getBean(UserService.class);
	bean.retriv();
	
	}

}
