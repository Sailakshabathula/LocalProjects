package com.example.demo;

public class Passenger {
	
	public String name;
	public String email;
	public String from;
	public String to;
	public String doj;
	public String trainName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	@Override
	public String toString() {
		return "Passenger [name=" + name + ", email=" + email + ", from=" + from + ", to=" + to + ", doj=" + doj
				+ ", trainName=" + trainName + "]";
	}
	
	
	

}
