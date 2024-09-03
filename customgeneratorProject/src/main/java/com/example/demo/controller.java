package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.Entity.Employee;
import com.example.demo.Repo.userRepo;

@Controller
public class controller {
	
	@Autowired
	private userRepo user;
	
	void getdata()
	{
		Employee u=new Employee();
		u.setOrderName("Birayani");
		u.setOrderPlace("gudivada");
		user.save(u);
	}


}
