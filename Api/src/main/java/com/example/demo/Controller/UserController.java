package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;
import com.example.demo.Repo.UserRepo;
import com.example.demo.Service.UserService;

@RestController
public class UserController {
	
	
	@Autowired
	private UserService service;
	
	@Autowired
	private UserRepo repo;
	
	@PostMapping("/user")
	public String saveData(@RequestBody User user)
	{
		
		  String saveUser = service.saveUser(user);
		  
		  return saveUser;
	}
	
	@GetMapping("/user/data")
	public List<User> getData()
	{
		
	    List<User> findAll = repo.findAll();
	    
	    return findAll;
	}

}
