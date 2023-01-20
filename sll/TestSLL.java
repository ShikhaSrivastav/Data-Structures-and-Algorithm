package sll;

public class TestSLL {

	public static void main(String[] args) throws Exception {
		
		SLL sll = new SLL();
		
		sll.insertAtBeginning(10);
		sll.insertAtBeginning(20);
		sll.insertAtBeginning(30);
		sll.insertAtBeginning(20);
		sll.insertAtBeginning(10);
		
		sll.display();
//		System.out.println(sll.displayRev());
//		sll.display();
		//sll.insertAtPosition(2, 100);
//		sll.display();
		//System.out.println(sll.displayRev());
		
//		sll.removeByData(50);
//		sll.display();
//		sll.removeByData(30);
//		sll.display();
		sll.isPalindrome();
		

	}

}
