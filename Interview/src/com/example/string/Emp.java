package com.example.string;



public class Emp {

	
	private String name;
	private Integer Id;
	private String std;
	
	
	public Emp(String name, Integer id, String std) {
		super();
		this.name = name;
		this.Id = id;
		this.std = std;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	
	
	
}
