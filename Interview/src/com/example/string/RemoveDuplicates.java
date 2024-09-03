package com.example.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;



public class RemoveDuplicates {
	
	public static void main(String args[])
	{
		
		//Emp(String name, Integer id, String std)
		
		Emp e=new Emp("abc",34,"1stclass");
		Emp e1=new Emp("dbc",45,"2ndclass");
		Emp e2=new Emp("dbcg",45,"2ndclass");
		
		List<Emp> eal=Arrays.asList(e,e1,e2);
		Map<Integer,String> map=eal.stream().collect(Collectors.toMap(i->i.getId(),i->i.getName(),(existing,replacement)->replacement));
		
		System.out.println(map);
		
		
		int n=10;
		long count2 = IntStream.rangeClosed(1, n).filter(i->n%i==0).count();
		
		System.out.println(count2);
		/*String str="welcome";
		
		
		Set<Character> set=new HashSet<>();
		
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
		   Character c= str.charAt(i);
		   if(!set.contains(c))
		   {
			   set.add(c);
			   sb.append(c);
		   }
		}
		
		System.out.println(sb.toString());
		
		
		//Using Java8
		
		String collect = str.chars().mapToObj(i->(char)i).distinct().map(i->String.valueOf(i)).collect(Collectors.joining());
		System.out.println(collect);
		
		
		
		String name="aabc";
		Map<Character,Integer> map=new HashMap<>();
		for(char c:name.toCharArray())
		{
			if(!map.containsKey(c))
			{
				map.put(c, 1);
			}
			else
			{
				int i = map.get(c);
				map.put(c, i+1);
			}
		}*/
		
		String s="aabcvv";
		char[] ch=s.toCharArray();
		int x,y;
		String s1="";
		for (x = 0; x < s.length(); x++)
		{
			  
			  if(!s1.contains(Character.toString(s.charAt(x))))
			  {
				  s1=s1+s.charAt(x);
				  int count=0;
	         for (y = x + 1; y < s.length(); y++)
	         {
	        	
	        	
	            if (ch[x] == ch[y]) {
	            	if(count==0)
	            	{
	                 System.out.print(ch[x]+" "+ch[y] + " ");
	            	}
	            	else {
	            	System.out.print(ch[y] + " ");
	            	}
	              count++;
	            }
	         }
}
		}
		
		
		
	}

}
