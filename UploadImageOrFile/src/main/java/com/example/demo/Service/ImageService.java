package com.example.demo.Service;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Entity.Image;
import com.example.demo.Repo.ImageRepo;

@Service
public class ImageService {
	
	@Autowired
	private ImageRepo repo;
	
	/*public String imageUpload(MultipartFile file,String name) throws IOException
	{
		Image img=new Image();
		img.setName(name);
		img.setImage(file.getBytes());
		
		Image save = repo.save(img);
		if(save.getImageId()!=null)
		{
			return "Image stored successfully";
		}
		return "Image not loaded into db";
		
	}*/
	
	public Image saveAttachment(MultipartFile file) throws Exception
	{
		String cleanPath = StringUtils.cleanPath(file.getOriginalFilename());
		System.out.println(cleanPath);
		try
		{
			if(cleanPath.contains(".."))
			{
				throw new Exception("filename contains invlid path sequence"+cleanPath);
			}
			Image img=new Image(cleanPath,file.getContentType(),file.getBytes());
			System.out.println(img.toString());
			
			return repo.save(img);
		}
		catch(Exception e)
		{
			throw new Exception("Couldn't Save the File"+cleanPath);
		}
	}
	public Image getAttachment(String id) throws Exception
	{
		
		return repo.findById(id).orElseThrow(()->new Exception("File not found exception"));
	}
}
