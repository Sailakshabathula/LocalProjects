package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.Sender.Sender;

@SpringBootApplication
public class DualApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DualApplication.class, args);
		
		Sender bean = run.getBean(Sender.class);
		bean.sendMessage("IDEA.DATALOAD.FDS", "Hello welcome to Active MQ");
	}

}
