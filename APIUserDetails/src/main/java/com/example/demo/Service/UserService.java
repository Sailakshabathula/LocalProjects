package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;
import com.example.demo.Repo.UserRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;


@Service
public class UserService {
	
	@Autowired
	private UserRepo repo;
	
	@PersistenceContext
	EntityManager entity;
	String jpql = "SELECT c FROM User c";
	
	public String creatUser(User user)
	{
	   //	Optional<User> data = Optional.ofNullable(repo.save(user));
		
		User save = repo.save(user);
	   	
	   	if(save!=null)
	   	{
	   		return "Data Saved";
	   	}
	   	
	   
	  return "Data Not Saved"; 	
	   	
	}
	
	public void retriv()
	{
		TypedQuery<User> createQuery = entity.createQuery(jpql, User.class);
		
		System.out.println(createQuery.getResultList());
	}
	
	
	


}
