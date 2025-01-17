package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String args[])
	{
		
		
		
		
		String name="Manasabb";
		
		/*name.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(i->i,Collectors.counting())).forEach((character, count) -> {
            if (count > 1) {
                System.out.print(String.valueOf(character).repeat(count.intValue()));
            }
        });*/
		name.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(i->i,Collectors.counting())).forEach((character,count)->{
			if(count>1)
			{
				System.out.println(String.valueOf(character).repeat(count.intValue()));
			}
		});	
		Map<Integer,String> map =new HashMap<>();
		
		map.put(3, "abc");
		map.put(2, "ghi");
		map.put(1, "def");
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		
		List l=Arrays.asList(entrySet);
		
		//Collections.sort(null);
		//Comparator<String> set
		//Collections.sort(entryset,);
		
	
	//entrySet.stream().sorted((o1,o2)->o1.getValue().compareTo(o2.getValue())).collect(Collectors.);
		
	//	I/P :- {cat,dog,bat,act,tab,god,tac}
	//	O/P :- {{cat,act,tac},{bat,tab}, {dog,god}}
		
		List<String> an=Arrays.asList("cat","dog","bat","act","tab","god","tac");
		System.out.println("Strated");
		Map<String, List<String>> collect3 = an.stream().collect(Collectors.groupingBy(i->sortString(i)));
		
		System.out.println(collect3);
		System.out.println("end");
		//List<String> collect = an.stream().sorted()
		
		Map<String,List<String>> m=new HashMap<>();
		
	for(String s:an)
	{
		String org=s;
		char[] c=s.toCharArray();
		Arrays.sort(c);
		String sc=String.valueOf(c);
		if(m.containsKey(sc))
		{
			List<String> d=m.get(sc);
			d.add(org);
			m.put(sc, d);
			
		}
		else
		{
			List<String> n=new ArrayList<>();
			n.add(org);
			m.put(sc, n);
			
		}
		
		
	
	}
	System.out.println(m); 
	
	for(Entry<String,List<String>> entry:m.entrySet())
	{
		System.out.println(entry.getValue());
	}
     List<List<String>> collect = m.entrySet().stream().map(t->t.getValue()).collect(Collectors.toList()); 
		
		System.out.println(collect);
	
	
	Map<String, Long> collect2 = an.stream().map(s->sortString(s)).collect(Collectors.groupingBy(t->t,TreeMap::new,Collectors.counting()));
	
	System.out.println(collect2);
	
	}

	
	
	public static String sortString(String str)
	{
		char[] ar=str.toCharArray();
		Arrays.sort(ar);
		return new String(ar);
		
	}

	
}
