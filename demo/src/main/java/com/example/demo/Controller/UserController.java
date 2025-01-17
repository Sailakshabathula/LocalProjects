package com.example.demo.Controller;

import java.io.IOException;
import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Content;
import jakarta.servlet.http.HttpServletResponse;

@RestController
public class UserController {
	
	@Autowired
	private UserService user;
	
	@GetMapping("/data")
	public void getdata(HttpServletResponse reponse) throws IOException
	{
		reponse.setContentType("application/octet-stream");
		String headerKey="Content-Disposition";
		String headerValue="attachment;filename=user.xls";
		reponse.setHeader(headerKey, headerValue);
		 
		user.generateExcel(reponse);
		
	}
	@Operation
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success"),
            @ApiResponse(responseCode ="400", description = "Not Found",content = {@Content(mediaType="application/json")})
    })
	@GetMapping("/display/{id}")
	public Optional<UserEntity> display(@PathVariable Integer id)
	{
		return user.getUser(id);
	}
	
	@Operation
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success"),
            @ApiResponse(responseCode ="400", description = "Not Found")
    })
	@GetMapping("/exe")
	public ResponseEntity<?> msg()
	{
		int i=1;
	    if(i==1)
	    {
	    	throw new UserNotFound("welcome");
	    }
	     System.out.println(i);
	     return ResponseEntity.ok("welcome");
	}

	@PostMapping("/mis")
	public ResponseEntity<String> fetch(@RequestBody Error er) throws JsonProcessingException,HttpMessageNotReadableException
	{
		System.out.println(er);
		
		return new ResponseEntity<String>("string",HttpStatus.OK);
	}
}
