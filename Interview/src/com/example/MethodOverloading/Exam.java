package com.example.MethodOverloading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exam {
	
	
	public  static void main(String args[])
	{
	  
		
		
List<Integer> li=Arrays.asList(5,5,5,5);


Collections.sort(li,Collections.reverseOrder());
System.out.println(li);

List<Employee> eli=new ArrayList<>();

eli.add(new Employee(45,35000,"abc"));
eli.add(new Employee(34,67000,"dbc"));
eli.add(new Employee(67,56000,"ukl"));


Collections.sort(eli,new SortComparator());

System.out.println(eli);

                         
Integer integer = li.stream().min((o1,o2)->o1.compareTo(o2)).get();


System.out.println(integer);




List<Character> cli=Arrays.asList('a','b','a','c','d','c');

 Map<Character, Long> collect = cli.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));

System.out.println(collect);

boolean anyMatch = li.stream().anyMatch(i->i==0);

boolean allMatch = li.stream().allMatch(i->i==5);

System.out.print(allMatch);


String s="dd";
int i=10;
System.out.println("value of i is "+i+" jdjhfjdhjhf"+s);


String format = String.format("value of i is %d value of is %s", i,s);

System.out.println(format);

 


























		
	}

}
