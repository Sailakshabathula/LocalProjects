package countMatchingChar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class solution {
	
	static void  m1(List<Integer> a)
	{
		Collections.sort(a);
        int i=a.get(0);
        Map map=new HashMap();
        for(Integer b:a)
        {
           if(map.containsKey(b))
           {
               int j=(int) map.get(b);
               map.put(b,j+1);
           }
            else
            {
                map.put(b,1);
            }
        }
     Collection values = map.values();
     ArrayList<Integer> p=new ArrayList(values);
     int count=0;
     for(Integer k:p)
     {
    	 
    	count=count+(k/2);
    	
     }
        
	}
	
	public static void main(String args[])
	{
		User u=new User();
		List l= Arrays.asList("er","prs","rdt");
		
		u.setPwd(l);
	    System.out.println(u.getPwd());
	    List<Integer> l1=Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
	    m1(l1);
	    List<Integer> collect = l1.stream().filter(i->i).collect(Collectors.toList());
	    System.out.println(collect);
		/*
		String str1="aaaaaataaaaaaabccccaaabbaaaaaadaaaaabbbacb";
		String str2="aaaaaaaaabaaabaaaabaaaaabbbaaaaaabt";
		Map<Object,Integer> map=new HashMap();
		Map<Object,Integer> map1=new HashMap();
		for(char s:str1.toCharArray())
		{
			if(!map.containsKey(s))
			{
				map.put(s, 1);
			}
			else
			{
				
				map.put(s,map.get(s)+1);
			}
			
		}
		for(char s:str2.toCharArray())
		{
			if(!map1.containsKey(s))
			{
				map1.put(s, 1);
			}
			else
			{
				
				map1.put(s,map.get(s)+1);
			}
			
		}
		
		Set<Object> keySet = map.keySet();
		Set<Object> set2 = map1.keySet();
		for(Object s:keySet)
		{
			//System.out.println(s);
		  for(Object s1:set2)
		  {
			  if(s.equals(s1))
			  {
				  //System.out.println(s+"  "+s1);
				  
				  
				  
				  if(map.get(s)==map1.get(s1))
				  {
					  System.out.println(s);
				  }
			  }
		  }
		}
		
		//System.out.println(map.keySet());
		//System.out.println(map1.keySet());
	}
*/
}
}