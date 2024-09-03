package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;
import com.example.demo.Repo.UserRepo;
import com.example.demo.Service.ApiDTO;
import com.example.demo.Service.RestApiConsuming;
import com.example.demo.Service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
public class UserController {
	
	
	@Autowired
	private UserService ser;
	
	@Autowired
	private UserRepo repo;
	
	
	@Autowired
	private RestApiConsuming consume;
	@Operation(
		      summary = "Retrieve a Tutorial by Id",
		      description = "Get a Tutorial object by specifying its id. The response is Tutorial object with id, title, description and published status."
		     )
	@PostMapping("/userdatails")
    public String userData(@RequestBody User user)
	{
	  String creatUser = ser.creatUser(user);
	
	return creatUser;
	}
	
	@GetMapping("/allUser")
	public List<User> getData()
	{
		List<User> findAll = repo.findAll();
		return findAll;
	}
	
	@GetMapping("/user/{id}")
	public Optional<User> getUserData(@PathVariable Integer id)
	{
		Optional<User> findById = repo.findById(id);
		
		return findById;
	}
	
	@GetMapping("/data/{name}")
	public User getUserdata(@PathVariable String name)
	{
		User findByUsername = repo.findByUserName(name);
		return findByUsername;
	}
	
	@GetMapping("/details")
	public List<ApiDTO> getConsume()
	{
		List<ApiDTO> consume2 = consume.consume();
		return consume2;
	}
	
	

}
