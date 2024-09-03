package com.example.demo.Service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Passenger;



@Service
public class ApiInteraction {
	
	
	public void getdata(Passenger p)
	{
		String apiUrl="http://localhost:8080/ticket";
		RestTemplate rt=new RestTemplate();
		
		//rt.exchange(url, null)
		p.setEmail("user@gmail.com");
		p.setTrainName("visaka");
		System.out.println(p);
		
		    ResponseEntity<String> postForEntity = rt.postForEntity(apiUrl, p, String.class);
		   System.out.println(postForEntity.getBody());
	}
	public void getUserdata()
	{
		System.out.println("data");
	}

}
