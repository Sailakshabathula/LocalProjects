package com.example.demo.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserEntity;
import com.example.demo.repo.UserRepo;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class UserService {

	
	@Autowired
	private UserRepo repo;
	
	
	@SuppressWarnings("resource")
	public void generateExcel(HttpServletResponse reponse) throws IOException
	{
	   List<UserEntity> findAll = repo.findAll();
	   HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
	   HSSFSheet sheet = hssfWorkbook.createSheet("UserInfo");
	   HSSFRow row = sheet.createRow(0);
	   row.createCell(0).setCellValue("UserId");
	   row.createCell(1).setCellValue("UserName");
	   row.createCell(2).setCellValue("Gender");
	   row.createCell(3).setCellValue("PhoneNumber");
	   int index=1;
	   for(UserEntity user:findAll)
	   {
		  HSSFRow rows = sheet.createRow(index);
		  rows.createCell(0).setCellValue(user.getUserId());
		  rows.createCell(1).setCellValue(user.getUserName());
		  rows.createCell(2).setCellValue(user.getGender());
		  rows.createCell(3).setCellValue(user.getPhoNo());
		  index++;
		  
	   }
	   ServletOutputStream outputStream = reponse.getOutputStream();
	   hssfWorkbook.write(outputStream);
	   hssfWorkbook.close();
	   outputStream.close();
	   
	}
	
	
	
	
	
	@SuppressWarnings("resource")
	public void userdata()
	{
		Sort by = Sort.by("phoNo");
		List<UserEntity> findAll = repo.findAll(by);
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
		findAll.forEach(e->System.out.println(e));
	}
	
	public void pagedata()
	{
		PageRequest of = PageRequest.of(1, 3);
		 org.springframework.data.domain.Page<UserEntity> findAll = repo.findAll(of);
		 List<UserEntity> content = findAll.getContent();
		content.forEach(e->System.out.println(e));
		
	}
	public void examplemethod(String gender)
	{
		//it is used to filter the data 
		System.out.println("filtering started");
		UserEntity user=new UserEntity();
		if(gender=="gender")
		{
		user.setGender("female");
		}
		else 
		{
			
			//Integer valueOf = Integer.valueOf("");
			user.setUserId(104);
		}
		Example<UserEntity> of = Example.of(user);
	List<UserEntity> findAll = repo.findAll(of);
	findAll.forEach(e->System.out.println(e));
	}
	
	
	public Optional<UserEntity> getUser(Integer id)
	{
		Optional<UserEntity> findById = repo.findById(id);
		System.out.println(findById);
		return findById;
	}
}
