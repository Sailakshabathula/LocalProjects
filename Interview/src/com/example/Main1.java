package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class Main1 {
	
	public static void main(String args[])
	{
		
		Map a=new HashMap();
		
		Integer p=new Integer();
		List<Employee> el=new ArrayList<>();
		el.add(new Employee("E123","ABC"));
		el.add(new Employee("E345","IOP"));
		el.add(new Employee("E678","PUI"));
	    el.add(new Employee("E123","DYC"));
	    
		el.stream().map(Employee::getEmpName).forEach(System.out::println);
		
	  TreeMap<String, Set<Employee>> collect = el.stream().collect(Collectors.groupingBy(emp->emp.getEmpid(),TreeMap::new,Collectors.toSet()));
		System.out.println(collect);
		
		
		char[] ch= {'a','b','a','b','c'};
		
		 Map<Character, Long> collect2 = new String(ch).chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(i->i,Collectors.counting()));
		
		System.out.println(collect2);
		
		String str="fourbyfourfrog";
		Map<Character, Long> collect3 = str.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(i->i,Collectors.counting()));
		
		System.out.print(collect3);
		
		List<Long> collect4 = str.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(i->i,Collectors.counting())).values().stream().collect(Collectors.toList());
		
		System.out.println(collect4);
		
		Collection<Long> values = str.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(i->i,Collectors.counting())).values();
		
		
		List<Long> s1=str.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(i->i,Collectors.counting())).values().stream().sorted().collect(Collectors.toList());
	    
	Test t=new Test();
	System.out.println(t.x);
	}

}
