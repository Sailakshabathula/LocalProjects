package Files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Files {
	
	public static void main(String args[])throws IOException
	{
		FileOutputStream fos=new FileOutputStream("abc.txt");
		
		FileInputStream fis=new FileInputStream("abc.txt");
		String s="Abc";
		String s1="Abc";
		
		System.out.println(s==s1);
		String s2=new String("Abc");
		String s3=new String("pqt");
		System.out.println(s2==s3);
		
		System.out.println(s==s2);
		
		s=s.concat("abc");
		
		StringBuffer sb=new StringBuffer();
		sb.append("Abc");
		sb.append("abc");
		System.out.println(sb);
		
		System.out.println(s);
		fos.write("abc".getBytes());
		
		
		/*int data;
		while((data=fis.read())!=-1)
		{
			System.out.print((char)data);
		}*/
		
		
	/*	BufferedReader bf=new BufferedReader(new FileReader("abc.txt"));
		
		String readLine = bf.readLine();
		System.out.println(readLine);
		//System.out.println(read+" "+read2+" "+read3+" "+read4);
		fos.close();*/
		
		
		
		
		
		
	}

}
