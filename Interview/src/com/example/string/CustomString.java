package com.example.string;

public class CustomString {
	
	private int i;
	public CustomString(int i)
	{
		this.i=i;
	}
	
	public CustomString modify(int i)
	{
		if(this.i==i)
		{
			return this;
		}
	return 	new CustomString(i);
	}

}
