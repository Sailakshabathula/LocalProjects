package com.example;

import java.util.Objects;

public class Employee {

	
	private String empid;
	private String empName;
	
	
	public Employee(String empid, String empName) {
		super();
		this.empid = empid;
		this.empName = empName;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + "]";
	}
	/*@Override
	public int hashCode() {
		return empid.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Employee emp=(Employee)obj;
		if(this.empid.equals(emp.empid))
		{
			return true;
		}
		return false;
		
	}*/
	
	
	
}