package countMatchingChar;

import java.util.Arrays;
import java.util.List;
import java.util.regex.*;
public class Validations {
	
	public static void main(String args[])
	{
	   List<Integer> al=Arrays.asList(4);
	   System.out.println(birthday(al,4,1));
	    
	}
	  public static int birthday(List<Integer> s, int d, int m) {
		    // Write your code here
		        int count=0;
		        for(int i=0;i<=s.size()-m;i++)
		        {
		            int sum=0;
		            System.out.println(i);
		            for(int j=i;j<i+m;j++)
		            {
		            	
		            	System.out.println(j);
		                sum=sum+s.get(j);
		            }
		            if(sum==d)
		            {
		                count++;
		            }
		        }
		    return count;
		    }

		
}
