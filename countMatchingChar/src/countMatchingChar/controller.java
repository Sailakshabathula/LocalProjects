package countMatchingChar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class controller {
	public static void main(String args[]) throws Exception
	{
		
	Employee e=new Employee(102,"Sundar");
	Employee e1=new Employee(104,"Raju");
	Employee e2=new Employee(101,"Suma");
	Employee e3=new Employee(103,"Samer");
	Employee e4=new Employee(100,"Roy");
	
     List<Employee> asList = Arrays.asList(e,e1,e2,e3,e4);
     Collections.sort(asList);
       for(Employee emp:asList)
       {
    	   System.out.println(emp.toString());
       }
       
      CustomStackUsingLinkedList cl = new CustomStackUsingLinkedList();
      cl.push(10);
      cl.push(20);
      cl.push(30);
      System.out.println(cl);
      System.out.println(cl.pop());
      System.out.println(cl);
      System.out.println(cl.peek());
   
	}

}