package countMatchingChar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DigitsCount {
	
	public static void main(String args[])
	{
		
	/*	123->
		
		123%10=3
		123/10=12-count=1
		
		n=n/10
		12%10=2
		12/10=1count=count+1=2
		
		n=n/10;
		1%10=1
	  1/10=0count=count+1=3*/
		
		int n=1235678;
		
		
		int count=0;
		while(n>0)
		{
			count=count+1;
			n=n/10;
		}
	  System.out.println(count);
	  
	  Map<Character,Integer> map=new HashMap();
	  
	  String str="aabcc";
	  for(char ch:str.toCharArray())
	  {
		  if(!map.containsKey(ch))
		  {
			  map.put(ch, 1);
		  }
		  else
		  {
			  int i=map.get(ch);
			  map.put(ch,i+1);
		  }
	  }
	  System.out.println(map);
	  
	  
      int arr[]= {30,40,50,60};
      
      int arr1[]= {40,50,70,20};
      intersection(arr,arr1);
	}
	
	public static void intersection(int arr[],int arr1[])
	{
		List<Integer> l=new ArrayList<>();
		for(int a:arr)
		{
			l.add(a);
			
		}
		for(int b:arr1)
		{
		  if(l.contains(b))
		  {
			  System.out.println(b);
		  }
		}
		
		
	}
	
	

}
