package Files;

import java.io.Serializable;

public class Singleton implements Serializable {
	
	//public static Singleton s=new Singleton();//Eaga Loading
	public static Singleton s=null;
	private Singleton()
    {
	    	
	}
	
	
	public static Singleton m1()
	{
      if(s==null)
		    s=new Singleton();
		return s;
	}
	
	
}
