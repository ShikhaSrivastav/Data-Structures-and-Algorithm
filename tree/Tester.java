package tree;

public class Tester {

	public static void main(String[] args) {
		
		BST bst= new BST();
		bst.insert(50);
		bst.insert(20);
		bst.insert(60);
		bst.insert(10);
		bst.insert(30);
		bst.insert(25);
		bst.insert(15);
		bst.insert(5);
		bst.insert(35);
		bst.insert(55);
		bst.insert(70);
		bst.insert(65);
		bst.insert(90);
		System.out.println(" inorder : ");
		bst.inorderR(bst.getRoot());
		System.out.println();
		System.out.println(" preorder : ");
		bst.preorderR(bst.getRoot());
		System.out.println();
		System.out.println(" postorder : ");
		bst.postorderR(bst.getRoot());
		System.out.println();
		bst.delete(20);
		System.out.println(" inorder : ");
		bst.inorderR(bst.getRoot());
		System.out.println();
		System.out.println(" maximum element is " + bst.getMax());
		System.out.println(" minimum element is " + bst.getMin());
		System.out.println(" inorder : ");
		bst.inorder();
		System.out.println(" preorder : ");
		bst.preorder();
		
		System.out.println(" height of tree is : " + bst.height(bst.getRoot()));
		bst.printLevelOrder();
		
		System.out.println();
		System.out.println(" BFS :");
		bst.bfs();
		
		

	}

}
