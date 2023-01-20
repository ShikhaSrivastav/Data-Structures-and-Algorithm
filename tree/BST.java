package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BST {

	private Node root;

	@SuppressWarnings("unused")
	public boolean insert(int data) {
		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}
		if (root == null) {
			root = newNode;
			return true;
		} else {
			Node temp = root;
			while (true) {
				if (temp.getData() == data) {
					return false;
				}
				if (data < temp.getData()) {
					if (temp.getLeft() == null) {
						temp.setLeft(newNode);
						return true;
					}
					temp = temp.getLeft();
				}
				if (data > temp.getData()) {
					if (temp.getRight() == null) {
						temp.setRight(newNode);
						return true;
					}
					temp = temp.getRight();
				}

			}

		}

	}

	public Node getRoot() {
		return root;
	}

	public void inorderR(Node root) {
		if (root == null) {
			return;
		}
		inorderR(root.getLeft());
		System.out.print(root.getData() + " ");
		inorderR(root.getRight());
	}

	public void preorderR(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.getData() + " ");
		preorderR(root.getLeft());
		preorderR(root.getRight());
	}

	public void postorderR(Node root) {
		if (root == null) {
			return;
		}
		postorderR(root.getLeft());
		postorderR(root.getRight());
		System.out.print(root.getData() + " ");
	}

	public boolean delete(int data) {
		if (root == null)
			return false;
		Node del = root;
		Node parent = root;
		// locating deletable node
		while (del.getData() != data) {
			parent = del;
			if (data < del.getData()) {
				del = del.getLeft();
			}
			if (data > del.getData()) {
				del = del.getRight();
			}
		}
		// checking for terminal node
		if (del.getLeft() == null && del.getRight() == null) {
			// parent = root;
			if (del == parent.getLeft()) {
				parent.setLeft(null);
				return true;
			} else {
				parent.setRight(null);
				return true;
			}
		} else {
			if (del.getLeft() != null) {
				Node temp = del;
				Node max = del;
				while (max.getRight() != null) {
					parent = max;
					max = max.getRight();
				}
				del.setData(max.getData());
				max.setData(temp.getData());
				del = max;
				parent.setRight(null);
				// return true;
			}
			if (del.getRight() != null) {
				Node temp = del;
				Node min = del;
				while (min.getLeft() != null) {
					parent = min;
					min = min.getLeft();
				}
				del.setData(min.getData());
				min.setData(temp.getData());
				del = min;
				parent.setLeft(null);
				// return true;
			}
		}
		return true;

	}

	public Integer getMax() {
		if (root == null) {
			return null;
		}
		Node temp = root;
		while (temp.getRight() != null) {
			temp = temp.getRight();
		}
		return temp.getData();
	}

	public Integer getMin() {
		if (root == null) {
			return null;
		}
		Node temp = root;
		while (temp.getLeft() != null) {
			temp = temp.getLeft();
		}
		return temp.getData();
	}

	public void inorder() {
		Stack<Node> stk = new Stack<>();
		Node temp = root;

		while (temp != null || !stk.isEmpty()) {
			while (temp != null) {
				stk.push(temp);
				temp = temp.getLeft();
			}
			temp = stk.pop();
			System.out.print(temp.getData() + " ");
			temp = temp.getRight();
		}
		System.out.println();
	}

	public void preorder() {
		Stack<Node> stk = new Stack<>();
		Node temp = root;

		while (temp != null || !stk.isEmpty()) {
			while (temp != null) {
				System.out.print(temp.getData() + " ");
				stk.push(temp);
				temp = temp.getLeft();
			}
			temp = stk.pop();

			temp = temp.getRight();
		}
		System.out.println();
	}

	// height of tree
	public int height(Node root) {
		if (root == null) {
			return 0;
		} else {
			int lheight = height(root.getLeft());
			int rheight = height(root.getRight());

			if (lheight > rheight) {
				return (lheight + 1);
			} else {
				return (rheight + 1);
			}
		}
	}

	// bfs traversal
	public void printLevelOrder() {
		int h = height(root);

		for (int i = 1; i <= h; i++) {
			printCurrentLevel(root, i);
		}
	}

	// print nodes on particular level
	public void printCurrentLevel(Node root, int level) {
		if (root == null) {
			return;
		}
		if (level == 1) {
			System.out.print(root.getData() + " ");
		}
		if (level > 1) {
			printCurrentLevel(root.getLeft(), level - 1);
			printCurrentLevel(root.getRight(), level - 1);
		}
	}

	// bfs
	public void bfs() {
		Queue<Node> q = new LinkedList<>();
		if (root == null) {
			return;
		}
		Node temp = root;
		q.add(temp);
		while (!q.isEmpty()) {
			 temp=q.remove();
			System.out.print(temp.getData() + " ");
			if (temp.getLeft() != null) {
				q.add(temp.getLeft());
			}
			if(temp.getRight()!=null) {
				q.add(temp.getRight());
			}
			
		}
	}
}
