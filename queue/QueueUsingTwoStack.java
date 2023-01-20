package queue;

import java.util.Stack;

public class QueueUsingTwoStack {

	Stack <Integer> stk1 = new Stack<>();
	Stack <Integer> stk2 = new Stack<>();
	
	public void enqueue(int data) {
		
		while(!stk1.isEmpty()) {
			stk2.push(stk1.pop());
		}
		stk1.push(data);
		while(!stk2.isEmpty()) {
			stk1.push(stk2.pop());
		}
	}
	public int dequeue() {
		if(!stk1.isEmpty())
			return stk1.pop();
		return -9999;
	}
}
