package countMatchingChar;

import java.util.Objects;

public class Product {
	
	private int id;
	private String name;
	
	public Product(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
/*	public int hashcode()
	{
		return id;
	}
	public boolean equal(Object obj)
	{
		Product p=(Product)obj;
		if(this.id==p.id)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
*/
	//@Override
	public int hashCode() {
		return id;
	}
	//@Override
	public boolean equals(Object obj) {
		
		Product other = (Product) obj;
		return id == other.id;
	}
}
