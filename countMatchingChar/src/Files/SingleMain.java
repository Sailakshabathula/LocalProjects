package Files;

//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
import java.io.*;
public class SingleMain {
	
	
	
	
	
	public static void main(String args[]) throws IOException
	{
		//Singleton s=new Singleton();
		//Singleton s1=new Singleton();
		//Singleton s2=new Singleton();
		Singleton s = Singleton.m1();
		//Singleton s1 = Singleton.m1();
		//Singleton s2 = Singleton.m1();
		
		
		//System.out.println(s.hashCode());
		//System.out.println(s1.hashCode());
		//System.out.println(s2.hashCode());
		//SingleMain sm=new SingleMain();
		//SingleMain sm1=new SingleMain();
		//sm.start();
		//sm1.start();
		
		
		FileOutputStream fos=new FileOutputStream("object.ser");
		ObjectOutputStream obj=new ObjectOutputStream(fos);
		obj.writeObject(s);
		
		//FileInputStream fis=new FileInputStream("b.txt");
		//ObjectInputStream obji=new ObjectInputStream(fis);
		//Singleton t=(Singleton)obji.readObject();
		//System.out.println(t.hashCode());
		
	}

}
