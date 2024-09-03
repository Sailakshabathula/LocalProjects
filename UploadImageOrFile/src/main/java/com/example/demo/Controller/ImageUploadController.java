package com.example.demo.Controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.demo.Response;
import com.example.demo.Entity.Image;
import com.example.demo.Service.ImageService;

@RestController
public class ImageUploadController {
	
	@Autowired
	private ImageService service;
	
	/*@PostMapping(value ="/save")
	public String upload(@RequestPart("file") MultipartFile file,@RequestParam("name") String name) throws IOException
	{
		String imageUpload = service.imageUpload(file, name);
		
		return imageUpload;
	}*/
	
	
	@PostMapping("/upload")
	public Response uploadfile(@RequestParam("file") MultipartFile file) throws Exception
	{
		Image img=null;
		String downloadUri="";
	   img = service.saveAttachment(file);
	   downloadUri=ServletUriComponentsBuilder.fromCurrentContextPath()
       .path("/download/")
       .path(String.valueOf(img.getImageId()))
       .toUriString();
	   return new Response(img.getName(),downloadUri,file.getContentType(),file.getSize());

             
	
	
	}
	
	@GetMapping("/download/{id}")
	public ResponseEntity<Resource> downloadFile(@PathVariable String id) throws Exception
	{
		Image img=null;
		System.out.println(id);
		img = service.getAttachment(id);
		
		return ResponseEntity.ok().contentType(MediaType.parseMediaType(img.getFiletype()))
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\""+img.getName()+"\"")
				.body(new ByteArrayResource(img.getImage()));
	}
	

}
