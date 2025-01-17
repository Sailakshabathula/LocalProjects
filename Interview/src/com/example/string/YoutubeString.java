package com.example.string;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class YoutubeString {
	
	public static void main(String args[])
	{
		
	//first occurance of character in a given string 
		String s="This is a simple example is";
		String s1="is";
		Map<Character, Long> frequencyMap = s1.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		char maxChar = frequencyMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(' ');
		
		System.out.println(maxChar);
		
		 long count = Arrays.stream(s.split(" ")).filter(t->t.equals(s1)).count();
		 
		 System.out.println(count);
		 
		 int indexOf = s.indexOf('i');
		 
		 System.out.println(indexOf);
		 
		 int lastIndexOf = s.lastIndexOf('i');
		
		 System.out.println(lastIndexOf);
		 
	
	}

}
