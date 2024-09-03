package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;
import com.example.demo.Repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo userrepo;
	
	
	public String saveUser(User user)
	{
		
		
		Optional<User> data= Optional.ofNullable(userrepo.save(user));
		if(!data.isPresent())
		{
			return "error";
		}
		
		
		return "Successfull";
	}

}
