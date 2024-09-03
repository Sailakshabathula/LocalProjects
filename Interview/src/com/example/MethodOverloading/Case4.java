package com.example.MethodOverloading;

public class Case4 {
	
	//General Method and Var-Arg Method
	
	public void m1(int i)
	{
		System.out.println("Int-Arg Method");
	}
	public void m1(int... p)
	{
		System.out.println("Var-Arg Method");
	
	}
	public static void m2()
	{
		
	}
	public static void main(String[] args)
	{
		
		Case4 c=new Case4();
		c.m1(10);
		c.m1(10,20);
		
		
		//General  method version is came 1.0 and var argument method came1.5
	}
	
	
}