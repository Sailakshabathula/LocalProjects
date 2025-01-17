package countMatchingChar;

public class CustomStackUsingLinkedList {
	
	CustomNode head=null;
	class CustomNode
	{
		Object data;
		CustomNode next;
		CustomNode(Object data)
		{
			this.data=data;
		}
	}
	
	public Object push(Object obj)
	{
		
		CustomNode cl=new CustomNode(obj);
		if(head==null)
		{
			head=cl;
		}
		else
		{
			CustomNode temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
				
			}
			temp.next=cl;
			
		}
		
		return obj;
	}
	
	public String toString()
	{
		StringBuffer sb=new StringBuffer();
		sb.append("[");
		CustomNode temp=head;
		while(temp.next!=null)
		{
			sb.append(temp.data+",");
			temp=temp.next;
		}
		sb.append(temp.data);
		sb.append("]");
		
		return sb.toString();
	}
	
	public Object pop() throws Exception
	{
		if(head==null)
		{
			throw new Exception("Stack is Empty");
		}
		CustomNode temp=head;
		CustomNode prev=head;
		while(temp.next!=null)
		{
			prev=temp;
			temp=temp.next;
			
		}
		Object obj=temp.data;
		prev.next=null;
		temp=null;
		
		return obj;
		
	}
	public Object peek()
	{
		CustomNode temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		
		
		return temp.data;
	}
	
}
