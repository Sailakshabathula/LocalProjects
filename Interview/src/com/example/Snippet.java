package com.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Snippet {
	
	public static void main(String args[])
	{
		Test t=new Test();
		
		System.out.println(t.x);
		//1.Find the Second the smallest number using java 8
		
		int[] a= {1,1,2,3,4,6,7};
		
		
		
		int orElse = Arrays.stream(a).distinct().boxed().sorted((o1,o2)->o2.compareTo(o1)).skip(1).findFirst().orElse(0);
		System.out.println(orElse);
		
		//2.Find the common element from both arrays
		int c[]= {1,2,4,5};
		int b[]= {4,5,6,7};
		fetchCommonElements(c,b);
		
		List<String> str=Arrays.asList("apple","watermelon","apple","banana","watermelong");
	 Map<String, List<String>> collect = str.stream().collect(Collectors.groupingBy(i->String.valueOf(i.charAt(0))));
	 //.entrySet().stream().filter(i->i.getValue().size()>=2).forEach(i->System.out.println(i.getKey());
		//System.out.println(colle
	 
	 System.out.println(collect);
		
	 
	 Map<String,Integer> map=new HashMap<>();
		
		map.put("s",4);
		map.put("e",2);
		map.put("t",3);
		System.out.println(map);
		map.entrySet().stream().sorted((o1,o2)->o1.getValue().compareTo(o2.getValue())).forEach(k->System.out.println(k.getKey()));
		
	}
		
		
		
		
	
	
	public static void fetchCommonElements(int num1[],int num2[])
	{
		Arrays.stream(num1).filter(ar1->Arrays.stream(num2).anyMatch(ar2->ar2==ar1)).forEach(System.out::println);
	}
}

