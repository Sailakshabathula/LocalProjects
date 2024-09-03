package com.example.demo.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
public class WebClients {
	
	public static final String data="https://jsonplaceholder.typicode.com/posts";
	
	public void getData()
	{
	 WebClient client = WebClient.create();
	 Mono<String> bodyToMono = client.get().uri(data).retrieve().bodyToMono(String.class);
	 
	 System.out.println(bodyToMono.block());
	 //headers are used to which formated we need the data.
	 }
	
	public void getData1()
	{
		System.out.println("Welcome to start methodd");
		WebClient client = WebClient.create();
		client.get().uri(data).retrieve().bodyToMono(String.class).subscribe(WebClients::getPath);
	    System.out.println("welcome to completed method");
	}
	
	public static void getPath(String s)
	{
		System.out.println(s);
	}

}
