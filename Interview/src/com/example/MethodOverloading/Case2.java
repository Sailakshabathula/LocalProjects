package com.example.MethodOverloading;

public class Case2 {
	
	
	//child and parent object when we sent the null child reference will be execute
	
	
	public void m1(Object obj)
	{
		System.out.println("Obj-Arg method");
	}
	public void m1(String str)
	{
		
		System.out.println("String-Arg method");
	}
	public static void main(String args[])
	{
		Case2 c=new Case2();
		c.m1(new Object());
		c.m1("welcome");
		c.m1(null);
		
	}

}
