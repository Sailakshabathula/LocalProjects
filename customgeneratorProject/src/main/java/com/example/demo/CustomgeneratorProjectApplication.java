package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.Entity.Employee;
import com.example.demo.Generators.OrderIdGenerator;
import com.example.demo.Repo.userRepo;

@SpringBootApplication
@EnableJpaRepositories
public class CustomgeneratorProjectApplication {

	
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(CustomgeneratorProjectApplication.class, args);
		
	    //userRepo bean = run.getBean(userRepo.class);
		controller bean = run.getBean(controller.class);
		bean.getdata();
		
	
		
		
		
		
	}

}
