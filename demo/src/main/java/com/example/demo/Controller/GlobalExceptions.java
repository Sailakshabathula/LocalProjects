package com.example.demo.Controller;

import java.io.IOException;

//import java.net.http.HttpResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.fasterxml.jackson.core.JsonProcessingException;

import jakarta.servlet.http.HttpServletResponse;

@RestControllerAdvice
public class GlobalExceptions {
	
	
	
	
	@ExceptionHandler(value=ArithmeticException.class)
	public ResponseEntity<String> handler(Exception e)
	{
		return new ResponseEntity<String>("anything is not divisible by 0",HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(value=UserNotFound.class)
	public ResponseEntity<Error> handlers(Exception e,HttpServletResponse res) throws IOException
	{
		Error er=new Error();
		er.setErrorId("ACI");
		er.setErrorCode(String.valueOf(HttpStatus.BAD_REQUEST.value()));
		er.setDescription("NOT FOUND");
		//res.sendError(400, "Not found");
		
	
		
		return  new ResponseEntity<Error>(er,HttpStatus.BAD_REQUEST);
	}
	/*@ExceptionHandler(value=JsonProcessingException.class)
	public ResponseEntity<String> jsonhandler(Exception e)
	{
		return new ResponseEntity<String>("anything is not divisible by 0",HttpStatus.INTERNAL_SERVER_ERROR);
	}*/
	@ExceptionHandler(value=HttpMessageNotReadableException.class)
	public ResponseEntity<String> jsonhandler(Exception e)
	{
		return new ResponseEntity<String>("Wrong json",HttpStatus.BAD_REQUEST);
	}
	
	

}
