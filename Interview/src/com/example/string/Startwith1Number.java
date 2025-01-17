package com.example.string;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.*;
import java.util.Map.Entry;

public class Startwith1Number {
	
	
	public static void main(String args[])
	{
		
		
		List<Integer> li=Arrays.asList(10,20,11,15,16);
		
		li.stream().map(s->s+" ").filter(t->t.startsWith("1")).forEach(t->System.out.println(t));
		
		//Write a program to 2 list contains intersection
		
		int[] ar1= {1,2,3,3,4,5};
		int[] ar2= {3,3};
		
 Arrays.stream(ar1).filter(t->Arrays.stream(ar2).anyMatch(y->y==t)).forEach(t->System.out.println(t));;
		
		//System.out.println(filter);
 
 //Write the program find the second highest number
 
 Integer integer = Arrays.stream(ar1).boxed().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
 
 System.out.println(integer);
 //Create a java program to find longest string from a given array.
 String[] str= {"abc","bcd","tycd"};
 
 String string = Arrays.stream(str).reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get();
    
    
   System.out.println(string);
	System.out.println("completed");
	
	//write a program group same length elements
   
   String input="aabc";
 Map<String, List<String>> collect = Arrays.stream(str).collect(Collectors.groupingBy(i->i));
	
  String collect2 = Arrays.stream(input.split("")).collect(Collectors.groupingBy(i->i)).entrySet().stream().filter(t->t.getValue().size()>1).flatMap(t->t.getValue().stream()).collect(Collectors.joining());
  System.out.println(collect2);
  
  char[] ch=input.toCharArray();
  String string2 = IntStream.range(0,ch.length).mapToObj(i->String.valueOf(ch[(ch.length-1)-i])).collect(Collectors.joining());
  
  System.out.println(string2);
  
   TreeMap<String, Long> collect3 = Arrays.stream(input.split("")).collect(Collectors.groupingBy(i->i,TreeMap::new,Collectors.counting()));   //.entrySet().stream().map(t->t.getValue().longValue()).max((o1,o2)->o1.compareTo(o2));
  
  System.out.println(collect3);
  
  
  //Frequecty method
  char[] a=input.toCharArray();
 // Arrays.stream(input.split("")).filter(r->Collections.frequency(a, r)==1).forEach(System.out::println);
  
  
  
  List<String> collect4 = Arrays.stream(input.split("")).collect(Collectors.toList());
  collect4.stream().filter(r->Collections.frequency(collect4, r)==1).forEach(System.out::println);
  
  

  
  
	}

}
