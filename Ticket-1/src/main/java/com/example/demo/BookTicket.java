package com.example.demo;

public class BookTicket {
	
	private Integer tickNum;
	private String name;
	private String email;
	private String from;
	private String to;
	private String doj;
	private String trainName;
	private String status;
	public Integer getTickNum() {
		return tickNum;
	}
	public void setTickNum(Integer tickNum) {
		this.tickNum = tickNum;
	}
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "BookTicket [tickNum=" + tickNum + ", name=" + name + ", email=" + email + ", from=" + from + ", to="
				+ to + ", doj=" + doj + ", trainName=" + trainName + ", status=" + status + "]";
	}
	

}
