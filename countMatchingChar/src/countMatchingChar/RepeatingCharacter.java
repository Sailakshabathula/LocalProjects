package countMatchingChar;

import java.util.*;
import java.util.stream.Collectors;

public class RepeatingCharacter {
	
	public static void main(String args[])
	{
		/*
		 * String s="abcaabcdba"; HashMap<Character,Integer> map=new HashMap<>(); int
		 * left=0,right=0; int n=s.length(); int len=0; while(right<n) {
		 * if(map.containsKey(s.charAt(right))) {
		 * left=Math.max(map.get(s.charAt(right))+1, left); } map.put(s.charAt(right),
		 * right); len=Math.max(len,right-left+1); right++; }
		 */
		
		/*
		 * System.out.println(len); Optional<String> str=Optional.of(null);
		 * System.out.println(str);
		 */
		 Map<String,String> map=new HashMap<>();
		  
		  map.put("abc", "45670"); map.put("bcd", "7890"); map.put("ght", "56789");
		  
		  Map<String, String> collect = map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).collect(Collectors.toMap((x)->x.getKey(),x->x.getValue()));
		  System.out.println(collect);
		  for(Map.Entry<String,String> entry:map.entrySet())
		  {
			  System.out.println(entry.getKey()+"-----"+entry.getValue());
		  }
		Set<String> Set = new HashSet<String>(); 
		
		  
        // Adding elements to the Set 
        // using add() method 
        Set.add("abc"); 
        Set.add("For"); 
        Set.add("Geeks"); 
        Set.add("Example"); 
        Set.add("Set"); 
        Set.forEach(fac->map.entrySet().removeIf(x->x.getKey().equals(fac)));
		System.out.println(map);
		
		
		
	}

}
