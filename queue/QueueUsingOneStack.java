package queue;

import java.util.Stack;

public class QueueUsingOneStack {
	Stack<Integer> stk = new Stack<>();
	
	public void enqueue(int data) {
		int s=stk.size();
		stk.push(data);
		for(int i=0;i<s;i++) {
			stk.push(stk.remove(0));
		}
	}
	public int dequeue() {
		if(!stk.isEmpty())
			return stk.pop();
		return -9999;
	}

}
