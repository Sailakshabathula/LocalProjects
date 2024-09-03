package com.example.MethodOverloading;

public class Case3 {
	
	//String and StringBuffer ,if you check the null in the argument, we get the ambiguous problem
	
	public void m1(String str)
	{
		System.out.println("String-Version");
	}
	
	public void m1(StringBuffer sb)
	{
		System.out.println("StringBuffer-Version");
	}
	
	public static void main(String[] args)
	{
		
		Case3 c=new Case3();
		c.m1("welcome");
		c.m1(new StringBuffer("python"));
		//c.m1(null);
	}

}
