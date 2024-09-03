package countMatchingChar;

public class Non_Repeating_Characters {
	public static void main(String args[])
	{
		String str="abcd";
		int right=0;
		int left=0;
	    int sum=0;
		while(right<str.length())
		{
			
			right=right-left+1;
			sum=sum+right;
			
		}
		System.out.println(sum);
	}

}
