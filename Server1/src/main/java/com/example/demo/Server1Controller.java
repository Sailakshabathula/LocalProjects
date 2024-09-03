package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Server1Controller {
	
	
	
	@Autowired
	RestTemplate restTemplate;
	@GetMapping("/getdetails")
	public String getDetails()
	{
		
		//RestTemplate rt=new RestTemplate();
		
		return restTemplate.getForEntity("http://SERVER2/search/response",String.class).getBody();
		
	}
}
