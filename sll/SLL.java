package sll;

public class SLL {
	private Node head;

	public SLL() {
		head = null;
	}

	public Node getHead() {
		return head;
	}

	public boolean insertAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			// SLL is empty
			head = newNode;
		} else {
			Node lastNode = head;
			while (lastNode.getNext() != null) {
				lastNode = lastNode.getNext();
			}
			// lastNode contains last node of the SLL
			lastNode.setNext(newNode);
		}
		return true;
	}

	public boolean insertAtBeginning(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
		return true;
	}

	// Insert at particular position
	public boolean insertAtPosition(int pos, int data) {
		if (pos <= 0 || pos > listLength()+1) {
//			System.err.println("Invalid position");
			return false;
		} else if (pos == 1) {
			return insertAtBeginning(data);
		} else {
			Node newNode = new Node(data);
			Node curNode = head;
			Node prevNode = head;
			int counter = 1;

//			while (counter < pos - 1) {
//				curNode = curNode.getNext();
//				counter++;
//			}
//
//			if (curNode.getNext() == null) {
//				insertAtEnd(data);
//			} else {
//				newNode.setNext(curNode.getNext());
//				curNode.setNext(newNode);
//			}
			while(curNode.getNext()!=null) {
				prevNode=curNode;
				curNode=curNode.getNext();
				counter++;
				
				if(pos == counter-1) {
					newNode.setNext(prevNode.getNext());
					prevNode.setNext(newNode);
				}
			}
//			prevNode=curNode;
//			curNode=curNode.getNext();
			
			return true;
		}
	}

//----------------------------------------------------------------------
	public void display() {
		if (head == null) {
			System.out.println("SLL is empty");

		} else {
			Node currNode = head;
			while (currNode.getNext() != null) {
				System.out.print(currNode.getData() + " ");
				currNode = currNode.getNext();
			}
			// currNode will be at last node of SLL
			// print the last node details
			System.out.print(currNode.getData());
			System.out.println();
		}
	}

	// ----------------------------------------------------------------------

	// Display Reverse
	public boolean displayRev() {
		if (this.head == null) {
			return false;
		}

		if (head.getNext() == null) {
			System.out.println(head.getData());
			return true;
		}

		Node n1 = head;

		Node n2 = n1.getNext();

		Node n3 = n2.getNext();

		while (n2 != null) {
			n3 = n2.getNext();

			n2.setNext(n1);

			n1 = n2;
			n2 = n3;
			
		}
		head.setNext(null);
		head = n1;
		return true;
	}

	// display reverse using recursion
	public void displayRevRec(Node head) {
		if (head != null) {
			displayRevRec(head.getNext());

			System.out.print(head.getData() + " ");
		}
	}

//---------------------------------------------------------------------------	

	public Node removeFromEnd() {

		if (head == null) {
			// SLL is empty
			System.out.println("SLL is empty");
			return null;
			// OR throw exception
		}
		if (head.getNext() == null) {
			// SLL has only one node
			Node lastNode = head;
			head = null;
			return lastNode;
		} else {
			// SLL is existing with more than one node
//------------------------------------------------------------------
			// Using two temp nodes
			// Node lastNode = head;
//			Node prevNode = head;
//			while (lastNode.getNext() != null) {
//				prevNode = lastNode;
//				lastNode = lastNode.getNext();
//			}
//			// lastNode --> is at last node of SLL
//			// prevNode is at previous of last node
//			prevNode.setNext(null);
//			return lastNode;
//------------------------------------------------------------------
			// Advanced using one temp node
			Node prevNode = head;
			while (prevNode.getNext().getNext() != null) {
				prevNode = prevNode.getNext();
			}
			Node temp = prevNode.getNext();
			prevNode.setNext(null);
			return temp;
		}
	}

	public Node removeFromBeginning() {
		if (head == null) {
			// SLL is empty
			System.out.println("SLL is empty");
			return null;
			// OR throw exception
		} else { // case 3 will handle case 2 automatically
			Node firstNode = head;
			head = head.getNext();
			return firstNode;
		}
	}

	public boolean removeFromPos(int pos) {
		if (pos <= 0 || pos > listLength()) {
			System.out.println("invalid position " + pos);

		} else if (pos == 1) {

			head = null;

		} else {
			int counter = 1;
			Node curNode = head;
			Node prevNode = head;
			while (counter < pos) {
				prevNode = curNode;
				curNode = curNode.getNext();

				counter++;
			}

			prevNode.setNext(curNode.getNext());
			curNode.setNext(null);
		}
		return true;
	}
	
	public boolean removeByData(int data) {
		if(head==null) {
			return false;
		}
		else if(head.getData()==data) {
			head=head.getNext();
			return true;
		}
		else {
			Node currNode = head;
			Node prevNode=head;
			while(currNode.getData()!=data) {
				prevNode=currNode;
				currNode=currNode.getNext();	
			}
			prevNode.setNext(currNode.getNext());
			return true;
		}
	}
	
	// Find middle element
	public int middleElement() {
		if (head == null) {
			return -999;
		}

		int mid = (listLength() + 1) / 2;
		int counter = 1;
		Node midNode = head;

		while (counter < mid) {
			midNode = midNode.getNext();
			counter++;
		}
		return midNode.getData();
	}

	// LinkedList length
	public int listLength() {
		int counter = 1;
		Node newNode = head;
		while (newNode.getNext() != null) {
			counter++;
			newNode = newNode.getNext();
		}
		return counter;
	}
	public boolean reverseSll()
	{
		if(head==null)
		{
			return false;
		}
		Node prev=null;
		Node cur=head;
		Node next=head;
		while(cur.getNext()!=null)
		{
			next=cur.getNext();
			cur.setNext(prev);
			prev=cur;
			cur=next;
			
		}
		head=prev;
		return true;
	}

//----------------------------------------------------Palindrome---------------------------------------------
public boolean isPalindrome() throws Exception {
	if(head==null) {
		return false;
	}
//	else if (head.getNext()==null) {
//		System.out.println(head.getData() + " list has only one element");
//		return true;
//	}
	else {
		Stack stk = new Stack();
		Node temp = head;
		while(temp!=null) {
			stk.push(temp.getData());
			temp=temp.getNext();
		}
		temp=head;
		while(!stk.isEmpty()) {
			if(stk.pop() != temp.getData()) {
				
				
				System.out.println("is not palindrome");
				return false;
				
			}
			temp=temp.getNext();
		}
		System.out.println("is palindrome");
		return true;
	}
	
}
}