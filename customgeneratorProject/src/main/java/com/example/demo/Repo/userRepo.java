package com.example.demo.Repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Employee;

@Repository
public interface userRepo extends JpaRepository<Employee,Serializable>{

}
