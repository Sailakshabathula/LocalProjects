package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class RestApiConsuming {
	
	
	public List<ApiDTO> consume()
	{
		
		
		RestTemplate rt=new RestTemplate();
		
		String url="https://jsonplaceholder.typicode.com/posts";
		 //ResponseEntity<ApiDTO> forEntity = rt.getForEntity(url, ApiDTO.class);
	    // ApiDTO body = forEntity.getBody();
		
		 ApiDTO[] forObject = rt.getForObject(url, ApiDTO[].class);
		System.out.println(forObject);
		List<ApiDTO> p=new ArrayList<ApiDTO>();
		for(ApiDTO p1:forObject)
		{
			p.add(p1);
			
		}
	   return p;
	}

}
