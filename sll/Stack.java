package sll;

public class Stack {
 
	private int top;
	private int size;
	private int[] arr;
	
	
	public Stack()
	{
		size=10;
		arr=new int[size];
		top=-1;
	}
	
	public Stack(int s)
	{
		this.size=s;
		arr= new int[s];
		top=-1;
	}
	
	public boolean isFull()
	{
		if( top== arr.length)
			return true;
		else
			return false;
	}
	
	public boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
	}
	
	public boolean push(int element) throws Exception
	{
		if(isFull() == false)
		{
			
			arr[++top]=element;
		
		    return true ;
		}

		   else {
				throw new Exception("Stack is empty") ;
		}
	}
	
	public int pop() throws Exception
	{
		if( isEmpty()== false)
		{
			int temp=arr[top];
			top=top-1;
			
			return temp;
		}
		
		else {
				throw new Exception("Stack is empty") ;
		}
	}
	
	public int peek()
	{
		int temp = 0;
		if(isEmpty()==false)
		temp = arr[top];
		return temp;
	}
	
	
	
}
