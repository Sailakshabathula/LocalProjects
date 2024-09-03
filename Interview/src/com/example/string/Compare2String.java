package com.example.string;


import java.util.stream.IntStream;
public class Compare2String {
	
	public static void main(String args[])
	{
		
		String str1="A3c";
		String str2="Abc";
		
		boolean isequal=false;
		
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)!=str2.charAt(i))
			{
				isequal=false;
				break;
				
			}
			isequal=true;
		}
		
		System.out.println(isequal);
		
		
		boolean allMatch = IntStream.range(0, str1.length()).allMatch(i->str1.charAt(i)==str2.charAt(i));
		
	System.out.println(allMatch);
	
	
	CustomString s=new CustomString(20);
	CustomString s2=s.modify(20);
	System.out.println(s.hashCode()+" "+s2.hashCode());
	
	String s3=new String("A");
	String s4=new String("B");
	
	System.out.println(s3.hashCode()+" "+s4.hashCode());
	}


}
