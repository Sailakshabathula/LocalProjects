package countMatchingChar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Pattern {
	public static void main(String args[])
	{
		//two equavalent objects have same hashcode
		
		List<Product> pl=new ArrayList<Product>();
		pl.add(new Product(1,"sundar"));
		pl.add(new Product(1,"sundar"));
		pl.add(new Product(2,"chanti"));
		
		//pl.forEach(p->System.out.println(p.getName()));
		pl.stream().distinct().forEach(p->System.out.println(p.getName()));
		
		
		
	/*	
		
	List<Integer> l=new ArrayList<Integer>();
		l.add(20);
		l.add(30);
		l.add(40);
		l.forEach((i)->System.out.println(i));
		l.removeIf(p->p==20);
		System.out.print(l);
		
		String haystack="sadbutsad";
		String needle="sad";
		*/
	/*	haystack = "leetcode"; needle = "leeto";
		for(int i=0;i<haystack.length()-needle();i++)
	       {
	           if(haystack.substring(i,needle.length()+i).equals(needle))
	           {
	              System.out.println(i);
	              break;
	           }
	           
	       } 
		*/
		//char[] a=needle.toCharArray();
		
		 //a.stream().map((t)->t).forEach((t)->System.out.println(t));
	/*	
		String s="abbac";
		char[] s1=s.toCharArray();
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			char ch=s1[i];
		   if(!map.containsKey(ch))
		   {
			   map.put(ch, i);
		   }
		   else
		   {
			   i=map.get(ch);
			   map.clear();
		   }
		}
		System.out.println(map);*/
		
		/*String basepackage="EP100000133";
		String pakageOfferingId="EP100000037";
		
		try
		{
			
		if(pakageOfferingId.isEmpty())
		{
			if(basepackage.equals("EP100000133"))
			{
				System.out.println("Correct Packaging Id");
			}
			else
			{
				throw new MyException("Invalid Packaging Id");
			}
		}
		
		}
		catch(MyException e)
		{
			System.out.println(e.getMessage());
		}*/
	}

}
