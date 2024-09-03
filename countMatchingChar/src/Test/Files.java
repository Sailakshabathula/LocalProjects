package Test;

import java.io.*;
import java.util.Arrays;

public class Files {
	
	public static void main(String args[]) throws IOException
	{
		
		
		//FileOutputStream fos=new FileOutputStream("abc.txt");
		//FileInputStream   fis=new FileInputStream("abc.txt");
		
 // fos.write(97);
 // fos.write(500);
		
		//int read = fis.read();
	//	int read2 = fis.read();
		//System.out.println(read+" "+read2);
		
		//byte[] b=new byte[fis.available()];
		//fis.read(b);
		//System.out.println(Arrays.toString(b));
		
	/*	int data;
       while((data=fis.read())!=-1)
       {
    	   System.out.print((char)data);
       }
      */
     // fos.close();
       
       
       BufferedReader br=new BufferedReader(new FileReader("abc.txt"));
       String readLine = br.readLine();
       System.out.println(readLine);
       while()
	}

}
