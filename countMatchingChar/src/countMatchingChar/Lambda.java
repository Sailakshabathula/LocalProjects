package countMatchingChar;

public class Lambda implements LambdaTest {

	
	@Override
	public void show()
	{
		System.out.println("welcome show method iniside the lambda");
	}
	public static void main(String args[])
	{
		LambdaTest t=()->System.out.println("welcome");
		t.display();
		
		Lambda l=new Lambda();
		l.show();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
}
