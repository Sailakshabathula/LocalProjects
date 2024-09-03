package com.example.MethodOverloading;

import java.util.StringTokenizer;

public class StringInternals {
	
	public static void main(String args[])
	{
		
		String s1=new String("i love my java");
		
		String s3="i love my java";
		String s5="i love "+"my java";
		if(s5==s3)
		{
			System.out.print("true");
		}
		
		String s6="i love";
		
		String s7=s6+"my java";
		System.out.println(s3==s7);
		
		String s="Java Is Very Easy";
		StringTokenizer st=new StringTokenizer(s);
		System.out.println(st.countTokens());
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		
	}

}
