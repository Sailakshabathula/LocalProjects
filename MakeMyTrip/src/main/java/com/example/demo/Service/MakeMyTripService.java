package com.example.demo.Service;

//import java.net.http.HttpHeaders;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestClientException;
//import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Passenger;
import com.example.demo.Ticket;

@Service
public class MakeMyTripService {

	
	
	public Ticket bookTicket(Passenger p)
	{
		String apiUrl="http://localhost:8080/ticket";
		RestTemplate rt=new RestTemplate();
		
		//rt.exchange(url, null)
		p.setEmail("user@gmail.com");
		p.setTrainName("visaka");
		System.out.println(p);
		try {
		    ResponseEntity<Ticket> postForEntity = rt.postForEntity(apiUrl, p, Ticket.class);
		    Ticket body = postForEntity.getBody();
		    System.out.println("Response Body: " + body);
		    return body;
		} catch (HttpClientErrorException e) {
		    // Handle client errors (4xx)
		    System.out.println("Client Error: " + e.getStatusCode() + " - " + e.getStatusText());
		} catch (HttpServerErrorException e) {
		    // Handle server errors (5xx)
		    System.out.println("Server Error: " + e.getStatusCode() + " - " + e.getStatusText());
		} catch (RestClientException e) {
		    // Handle other RestClientExceptions
		    System.out.println("RestClientException: " + e.getMessage());
		}
		return null;

	}
	
	public List<Ticket> getAll()
	{
		String apiUrl="http://localhost:8080/tickets";
		RestTemplate rt=new RestTemplate();
		 ResponseEntity<Ticket[]> forEntity = rt.getForEntity(apiUrl, Ticket[].class);
		 Ticket[] body = forEntity.getBody();
		 List<Ticket> asList = Arrays.asList(body);
		 
		return asList;
	}
	public ResponseEntity<String> getData(Passenger p)
	{
		String url="http://localhost:8080/bookticket";

		System.out.println(p);
		 ResponseEntity<String> postForEntity = rest.postForEntity(url,p,String.class);
		
		return postForEntity;
	}
}
