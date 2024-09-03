package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class Server2Controller {
	
	
	@GetMapping("/response")
	public String getResponse()
	{
		
		return "Server 2 Response we got";
	}

}
