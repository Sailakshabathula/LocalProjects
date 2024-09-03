package com.example.demo.Entity;

import java.util.Arrays;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Image {
	
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String imageId;
	private String name;
	private String filetype;

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getFiletype() {
		return filetype;
	}

	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}

	@Lob
	@Column(name="image",columnDefinition="LONGBLOB")
	private byte[] image;
	
	

	

	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Image [imageId=" + imageId + ", name=" + name + ", filetype=" + filetype + ", image="
				+ Arrays.toString(image) + "]";
	}

	public Image( String name, String filetype, byte[] image) {
		super();

		this.name = name;
		
		this.filetype = filetype;
		this.image = image;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
	

}
