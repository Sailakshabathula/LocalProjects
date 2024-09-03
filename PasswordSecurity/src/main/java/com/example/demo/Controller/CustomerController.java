package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Customer;
import com.example.demo.Repo.CustomerRepo;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerRepo repo;
	@Autowired
	private PasswordEncoder pwdEncoder;
	
	@Autowired
	private AuthenticationManager authManager;
	
	@PostMapping("/login")
	public String loginCustomer(@RequestBody Customer customer)
	{
		UsernamePasswordAuthenticationToken user = new UsernamePasswordAuthenticationToken(customer.getCustomerUsername(),customer.getCustomerPassword());
		Authentication authenticate = authManager.authenticate(user);
		if(authenticate.isAuthenticated())
		{
			return "Welcome";
		}
		
		return "Bad Username and password";
	}
	
	@PostMapping("/register")
	public String registerCustomer(@RequestBody Customer customer)
	{
	  customer.setCustomerPassword(pwdEncoder.encode(customer.getCustomerPassword()));
	  
	  repo.save(customer);
	  
	  return "User Registerated";
	}

}
