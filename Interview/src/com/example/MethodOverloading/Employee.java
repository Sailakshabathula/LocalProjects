package com.example.MethodOverloading;

public class Employee {
	
	public Integer age;
	public Integer sal;
	public String name;
	
	
	
	@Override
	public String toString() {
		return "Employee [age=" + age + ", sal=" + sal + ", name=" + name + "]";
	}
	public Employee(Integer age, Integer sal, String name) {
		super();
		this.age = age;
		this.sal = sal;
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getSal() {
		return sal;
	}
	public void setSal(Integer sal) {
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
