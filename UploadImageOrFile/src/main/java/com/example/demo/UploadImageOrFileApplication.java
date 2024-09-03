package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.Service.ApiInteraction;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
public class UploadImageOrFileApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(UploadImageOrFileApplication.class, args);
		Passenger p=new Passenger("raju","raju@gmail.com", "vijayawada", "gudivada", "12/01/2023","visaka");
		ApiInteraction bean = run.getBean(ApiInteraction.class);
		bean.getdata(p);
	}

}
