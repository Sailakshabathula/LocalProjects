package countMatchingChar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestProduct {

	@Test
	public void show()
	{
		String basepackage="EP100000133";
		String pakageOfferingId="";
		
		try
		{
			
		if(pakageOfferingId.isEmpty())
		{
			if(basepackage.equals("EP100000133"))
			{
				System.out.println("Correct Packaging Id");
				 assertEquals("Correct Packaging Id", "Correct Packaging Id");
			}
			else
			{
				throw new MyException("Invalid Packaging Id");
			}
		}
		
		}
		catch(MyException e)
		{
			assertEquals("Invalid Packaging Id", e.getMessage());
		}

	}
}
