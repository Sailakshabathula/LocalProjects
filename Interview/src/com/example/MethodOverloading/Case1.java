package com.example.MethodOverloading;

public class Case1 {
	
	//Automatic type promotion will be happen
	
	public void m1(int i)
	{
		System.out.println("Int-Arg Method");
	}
	public void m1(float f)
	{
		System.out.println("Float-Arg Method");
	}
	
	public static void main(String[] args)
	{
		
		Case1 c=new Case1();
		
		c.m1(2);
		c.m1(10.2f);
		c.m1('a');
		c.m1(10L);
		//c.m1(10.5);
		
	}

}
