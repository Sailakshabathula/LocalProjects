package com.example.demo.Service;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Customer;
import com.example.demo.Repo.CustomerRepo;

@Service
public class MyUserDetailsService  implements UserDetailsService {
	
	@Autowired
	private CustomerRepo repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Customer c = repo.findByCustomerUsername(username);
		
		return new User(c.getCustomerUsername(),c.getCustomerPassword(),Collections.EMPTY_LIST);
	}

}
