package com.example.MethodOverloading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class inver {
	
	public static void main(String args[])
	{
		
		String s="test";
		
		String s1="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			
			s1=s1+s.charAt(i);
		}
		
		System.out.println(s1);
	List<String> al=Arrays.asList("a","b","c");
	for(int i=0;i<al.size();i++)
	{
		if(al.get(i)=="b")
		{
			al.set(i, "d");
		}
	}
	
	al.set(2, "e");
		System.out.println(al);
		
		int[] ar=new int[5];
		
		ar[0]=11;  
		ar[1]=22;
		ar[2]=5;
		ar[3]=63;
		ar[4]=23;
		System.out.println(Arrays.toString(ar));
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				
				if(ar[i]>ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
					
				}
			}
			System.out.println(ar[i]+"   "+Arrays.toString(ar));
		}
		
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		
		System.out.println(ar[ar.length-2]);
		
		
		Map<String,Integer> map=new LinkedHashMap<>();
		
		map.put("a",2);
		map.put("x",5);
		map.put("u", 9);
		
		System.out.println(map);

		
	}

}