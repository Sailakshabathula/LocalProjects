package countMatchingChar;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FEDEX_GRD {
	public static void main(String args[])
	{
		String basepackage="EP100000133";
		String pakageOfferingId="EP100000037";
		
		try
		{
			
		if(!pakageOfferingId.isEmpty())
		{
			System.out.println(pakageOfferingId);
		}
		else
		{
			if(basepackage.equals("EP100000133"))
			{
				System.out.println("Correct Packaging Id");
			}
			else
			{
				throw new MyException("Invalid Packaging Id");
			}
		}
		
		}
		catch(MyException e)
		{
			System.out.println(e.getMessage());
		}
		
		m2();
	}
	
	public static void m2()
	{
		  Map<List<String>, String> map = new HashMap<>();
	        List<String> l = Arrays.asList("say", "user");
	        map.put(l, "is");

	        // Create a list to use as the key for comparison
	        List<String> keyToCheck = Arrays.asList("say");

	        // Check if the map contains the key
	        if (map.containsKey(keyToCheck)) {
	            System.out.println(map.get(keyToCheck));
	        }
		
	}

	public static void m1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		String s=sc.next();
		System.out.println(s);
		Rate_request rate=new Rate_request();
		rate.setShipmentType("P");
		rate.setOperatingCompany("FEDEX_GROUND");
		if(rate.getOperatingCompany().equals("FEDEX_GROUND")) {
		if(rate.getShipmentType().equals("E"))
		{
			rate.setShipmentType("ERL");
			System.out.println("Email Return Label");
		}
		else if(rate.getShipmentType().equals("P"))
		{
			rate.setShipmentType("PRL");
			System.out.println("Print Return Label");
		}
		}
		
	}

}
