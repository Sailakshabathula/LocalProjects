package countMatchingChar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Breaking_the_Records {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		List<Integer> l=Arrays.asList(3,4,21,36,10,28,35,5,24,42);
		int max=l.get(0);
		int min=l.get(0);
		int maxcount=0;
		int mincount=0;
		ArrayList p=new ArrayList();
		for(int i=1;i<l.size();i++)
		{
			
			
			if(l.get(i)==max || l.get(i)==min)
			{
				continue;
			}
			if(l.get(i)>=max)
			{
				max=l.get(i);
				maxcount=maxcount+1;
			}
			else if(l.get(i)<min)
			{
				min=l.get(i);
				mincount=mincount+1;
			}
			System.out.println("max value is"+max+"min value is "+min);
			
		}
		System.out.println("max count:"+maxcount+" min count"+mincount);

	}

}
