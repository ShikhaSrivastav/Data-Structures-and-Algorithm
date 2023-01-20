package queue;

public class Tester {

	public static void main(String[] args) {
		QueueUsingOneStack q1 = new QueueUsingOneStack();
		
		q1.enqueue(10);
		q1.enqueue(20);
		q1.enqueue(30);
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());

		 System.out.println("------------------------------------");
		
	   QueueUsingTwoStack q2 = new QueueUsingTwoStack();
	   
	   q2.enqueue(40);
	   q2.enqueue(50);
	   q2.enqueue(60);
	  
	   System.out.println(q2.dequeue());
	   System.out.println(q2.dequeue());
	   System.out.println(q2.dequeue());
	   System.out.println(q2.dequeue());
	}

}
