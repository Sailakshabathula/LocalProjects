package countMatchingChar;

import java.util.*;
import java.util.stream.Collectors;;

public class NewThings {

	
	public static void main(String args[])
	{
		
		 // create a HashMap and add some values
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "L");
        map1.put(2, "M");
        map1.put(3, "N");
 
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(1, "B");
        map2.put(2, "G");
        map2.put(3, "R");
 
        // print map details
        System.out.println("HashMap1: " + map1.toString());
 
        System.out.println("HashMap2: " + map2.toString());
        
      //  map1.forEach((key,value)->map2.merge(key, value, (v1,v2)->v1.equalsIgnoreCase(v2)?v1:v1+","+v2));
        
		/*
		 * map2.forEach( (key, value) -> map1.merge(key, value, (v1, v2) ->
		 * v1.equalsIgnoreCase(v2) ? v1 : v1 + ", " + v2));
		 */
        for(Map.Entry<Integer,String> entry:map1.entrySet())
        {
           if(entry.getValue()=="N")
           {
        	   continue;
           }
           map2.merge(entry.getKey(), entry.getValue(), (v1,v2)->
           {
        	
        	 return v1+v2;
        		   
        		   
           });
        }
        
        // print map details
        System.out.println("HashMap1: " + map1.toString());
 
        System.out.println("HashMap2: " + map2.toString());
        
        
        List<String> al=Arrays.asList("a","b","c","d");
        String collect2 = al.stream().collect(Collectors.joining());
        System.out.println(collect2);
List<User> u=new ArrayList<>();
		
		u.add(new User("abc","3456"));
		u.add(new User("ghc","7890"));
		u.add(new User("klm","67890"));
		
		String collect = u.stream().map(x->x.getUserName()).collect(Collectors.joining());
		System.out.println(collect);
		
	}
}
