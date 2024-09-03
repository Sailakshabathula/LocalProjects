package Test;

public class Main extends Thread{
	
	public void run()
	{
		
		System.out.println("thread");
	}
	
	public void m1()
	{
		System.out.println("welcome");
	}
	public static void main(String args[])
	{
		
		
		Main m=new Main();
		Main m1=new Main();
		
		
		m.start();
		m1.start();
	}

}
