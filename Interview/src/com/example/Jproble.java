package com.example;

import java.util.Arrays;

public class Jproble {
	
	public static void main(String args[])
	{
		
		
		int[] i= {1,2,0,0,5,6};
		
		int b=45;
		
		
		
		int arraytoInt=ArrayToInt(i);
		
		int[] last=IntoArray(arraytoInt+b);
		
		System.out.println(Arrays.toString(last));
		//Arrays.toString(last);
		
	}
    static int ArrayToInt(int num[])
    {
    	int sum=0;
    	for(int n:num)
    	{
    	  sum=sum*10+n;	
    	}
    	
    	return sum;
    }
    
    static int[] IntoArray(int num)
    {
    	String string = Integer.toString(num);
    	System.out.println(num+" "+string.length());
    	int[] t=new int[string.length()];
    	
    	for(int i=0;i<string.length();i++)
    	{
    		
    		t[i]=Character.getNumericValue(string.charAt(i));
    	}
    	return t;
    }
}