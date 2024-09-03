package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Image;

@Repository
public interface ImageRepo extends JpaRepository<Image,String> {

}
