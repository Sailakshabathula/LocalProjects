package countMatchingChar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmp {

	
	public static void main(String args[])
	{
		Emp e=new Emp("sai",234,"sdfs");
		Emp e1=new Emp("rakesh",678,"jddd");
		Emp e2=new Emp("suresh",456,"dfs");
		List<Emp> l=new ArrayList<Emp>();
		l.add(e);
		l.add(e1);
		l.add(e2);
		Collections.sort(l);
		System.out.println(l);
		
	}
}
