package countMatchingChar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class interfaceimple   {

	
	
	
	public static void main(String args[])
	{
		
		
		funInter i=(a)->a==10;
		System.out.println(i.m1(10));
		
		List<String> al=Arrays.asList("a","b","c","d");
		
		
		al.forEach((a)->{
			System.out.println(a);
			
		});
		
		
		al.stream().filter((a)->a.equals("a")).forEach((a)->System.out.println(a));
		
		System.out.println(al);
		
		
		List<User> u=new ArrayList<>();
		
		u.add(new User("abc","3456"));
		u.add(new User("ghc","7890"));
		u.add(new User("klm","67890"));
		u.stream().filter((a)->a.getUserName().startsWith("k")).forEach((a)->System.out.println(a.getPwd()));
		
		List<Prizes> p=new ArrayList<>();
		p.add(new Prizes("babu",40000));
		p.add(new Prizes("manasa",80000));
		p.add(new Prizes("abc",11000));
		p.add(new Prizes("Tiny",90000));
		p.stream().filter((a)->a.getPrize()>16000).forEach((x)->System.out.println(x.getName()+" "+x.getPrize()));
		
		
		List<Prizes> collect = p.stream().filter((a)->a.getPrize()>16000).collect(Collectors.toList());
     System.out.println(collect);
     collect.forEach((a)->System.out.println(a.getName()));
     
     List<String> n=new ArrayList<>();
     for(Prizes a:p)
     {
    	 System.out.println(a.getName());
    	 n.add(a.getName());
     }
     
     
    List<String> collect2 = p.stream().map((a)->a.getName()).collect(Collectors.toList());
     
     
     
     
     
    
		
		
		
		
		
	}

	/*@Override
	public boolean m1(int a) {
	    if(a==10)
	    {
	    	return true;
	    }
		return false;
	}*/

}
