package com.example.demo.Service;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


@Service
public class ApiConsumeService {
	
	
	
	
	public void getUser()
	{
		RestTemplate rt=new RestTemplate();
		
		String url="http://localhost:8080/user/data";
	ResponseEntity<UserInfo[]> forEntity = rt.getForEntity(url, UserInfo[].class);
		UserInfo[] body = forEntity.getBody();
		
		List<UserInfo> asList = Arrays.asList(body);
		
		System.out.println(asList);
		
		
		
		
	}
public void saveData()
{
	UserInfo userInfo = new UserInfo(102,"L", "Chanti", 78945, "chanti@gmail.com","nearGudivada");
	RestTemplate rt=new RestTemplate();
	String url="http://localhost:8080/";
	UriComponentsBuilder path = UriComponentsBuilder.fromUriString(url).path("/userdatails");
	String uri = path.build().toString();
	//String url="http://localhost:8080/user";
	ResponseEntity<String> postForEntity = rt.postForEntity(uri,userInfo, String.class);
	
	String body = postForEntity.getBody();
	System.out.println(body);
	

}
}
