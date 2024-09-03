package com.example.demo.Entity;

import org.hibernate.annotations.GenericGenerator;

import com.example.demo.Generators.OrderIdGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	

    @Id
    @GenericGenerator(name = "client_id", type= OrderIdGenerator.class)
    @GeneratedValue(generator = "client_id")  
    @Column(name="client_id")
    private String clientId;
	
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	private String orderName;
	private String orderPlace;
	
	@Override
	public String toString() {
		return "Employee [clientId=" + clientId + ", orderName=" + orderName + ", orderPlace=" + orderPlace + "]";
	}
	
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderPlace() {
		return orderPlace;
	}
	public void setOrderPlace(String orderPlace) {
		this.orderPlace = orderPlace;
	}
	

}
