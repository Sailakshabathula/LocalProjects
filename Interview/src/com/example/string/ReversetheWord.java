package com.example.string;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReversetheWord {
	
	public static void main(String args[])
	{
		
		//Write a programme reverse the each word .
		
		String st="this is javatpoint";
		
		   String[] split = st.split(" ");
		
		
		String collect = Arrays.stream(st.split(" ")).map(i->new StringBuffer(i).reverse()).collect(Collectors.joining());
		
		String collect2 = IntStream.range(0, split.length).mapToObj(i->new StringBuffer(split[(split.length-1)-i]).reverse()+" ").collect(Collectors.joining());
	
	System.out.println(collect2);
	
	
	
	String s="abc";
	
	//Map<String, Long> collect3 = Arrays.stream(st.split("")).filter(i->!i.isBlank()).collect(Collectors.groupingBy(i->i,));
	Map<String, Integer> collect3 = Arrays.stream(st.split(""))
            .filter(i -> !i.isBlank())
            .collect(Collectors.toMap(
                i -> i,
                i -> (int) i.charAt(0), // ASCII value
                (existing, replacement) -> existing // merge function for duplicate keys
            ));
	
	System.out.println(collect3);
	String u=new String("abc");
	
	if(s.equals(u))
	{
		System.out.println(u);
	}
	
	String str="-42";
	
	
	Integer i=Integer.MAX_VALUE;
	Integer j=Integer.MIN_VALUE;
	System.out.println(i+" "+j);
	
	int result=0;
	char currentChar='4';
	result = result * 10 + (currentChar - '0');
	
	System.out.println(result);
	}

}
