package countMatchingChar;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestEmployee {
	public static void main(String args[])
	{
		Employee e=new Employee(102,"Sundar");
		Employee e1=new Employee(104,"Raju");
		Employee e2=new Employee(101,"Suma");
		Employee e3=new Employee(103,"Samer");
		Employee e4=new Employee(100,"Roy");
		
	     List<Employee> asList = Arrays.asList(e,e1,e2,e3,e4);
	     Collections.sort(asList,new EmpComparator());
	     
	   
	       for(Employee emp:asList)
	       {
	    	   System.out.println(emp.toString());
	       }
	       
	       System.out.println("Name comparator:");
	       Collections.sort(asList,new NameCompartor());
	       for(Employee emp:asList)
	       {
	    	   System.out.println(emp.toString());
	       }
	       int[] a=new int[700];
	       
	       for(int i=0;i<700;i++)
	       {
	       	a[i]=i+1;
	       	
	       }
	       System.out.println(Arrays.toString(a));
	       
	}

}
