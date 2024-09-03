package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Service.MakeMyTripService;

@SpringBootApplication
public class MakeMyTripApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(MakeMyTripApplication.class, args);
		
		MakeMyTripService bean = run.getBean(MakeMyTripService.class);
		Passenger p=new Passenger("sundar","sundar@gmail.com","vijayawada","Gudivada","12/04/2024","Visaka");
		  ResponseEntity<String> data = bean.getData(p);
		System.out.println(data.getBody());
		
		
		
	}
	@Bean
	public RestTemplate rest()
	{
	return new RestTemplate(); 	
	}

}
