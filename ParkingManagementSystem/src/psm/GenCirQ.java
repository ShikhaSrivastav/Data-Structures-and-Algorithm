package psm;

public class GenCirQ<T> {
	private T arr[];
	private int front, rear, count;

	@SuppressWarnings("unchecked")
	public GenCirQ() {
		super();
		arr = (T[]) new Object[10];
		this.count = 0;
		this.front = -1;
		this.rear = -1;
	}
	
	@SuppressWarnings("unchecked")
	public GenCirQ(int size) {
		super();
		arr = (T[]) new Object[size];
		this.count = 0;
		this.front = -1;
		this.rear = -1;
	}
	
	
	//Circular enqueue
	public boolean enqueue(T data) {
		if(!isFull()) {
			rear=(rear+1)%arr.length;
			arr[rear] = data;
			if(front==-1)
				front=0;
			count++;
			return true;
		}else {
			return false;
		}
	}
	
	//Circular dequeue
	public T dequeue() {
		if(!isEmpty()) {
			T temp = arr[front];
			front = (front+1)%arr.length;
			count--;
			return temp;
		}else {
			return null;
		}
	}
	
	
	//IsFull
	public boolean isFull() {
		return count==arr.length;
	}
	
	//IsEmpty
	public boolean isEmpty() {
		return count==0;
	}
	public T peek()
	{
		T temp;
		if(isEmpty()==false)
		{
		temp=arr[front];
		
		return temp;
		
		}
		else
			return null;
		
	}
	@SuppressWarnings("unchecked")
	public T[] display()
	{
		T arr2[]= (T[]) new Object[10];
		for(int i=front;i<arr.length;i++)
		{
			arr2[i-front]=arr[i%arr.length];
			
			//i=(i+1)%arr.length;
		}
		return arr2;
		
	}
	
}
