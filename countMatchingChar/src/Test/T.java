package Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class T {
	 public static void main(String args[])
	{
		
	
	
		/*
		 * HashMap<Integer,String> map=new HashMap<>();
		 * 
		 * List<String> al=Arrays.asList("a","b","c");
		 * 
		 * map.put(1, "abc"); map.put(2, "bcd"); map.put(3, "pqr");
		 * System.out.println(map.entrySet());
		 * 
		 * for(Map.Entry<Integer,String> s:map.entrySet()) {
		 * System.out.println(s.getValue()); System.out.println(s.getKey());
		 * 
		 * }
		 * 
		 * Iterator<Map.Entry<Integer,String>> it=map.entrySet().iterator();
		 * 
		 * 
		 * while(it.hasNext()) { System.out.println(it.next()); }
		 */
		 
		Student s=new Student("abc", "123");
		
		

		
		
		 Student stud = T.create(s);
		 
		 
		 System.out.println(stud);
		
		 
		 
	
	}
	 
	 
	public static Student create(Student s)
	 {
		s=null;
		 Optional<Student> st=Optional.ofNullable(s);
		 
	
	  
		 
	
		 return st.orElseThrow(()->new StudentNotFound("student is not found"));
		
	 }

}
