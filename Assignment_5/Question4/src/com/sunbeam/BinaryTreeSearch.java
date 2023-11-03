package com.sunbeam;

public class BinaryTreeSearch {
	public class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int value) {
			data = value;
			left = null;
			right = null;
		}
	}

	private Node root;

	public BinaryTreeSearch() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	private void addNode(Node trav1, int value) {
		Node trav = trav1;
		if (isEmpty())
			root = new Node(value);
		else {
			if (value < trav.data) {
				if (trav.left == null)
					trav.left = new Node(value);
				else
					addNode(trav.left, value);
			} 
			else {
				if (trav.right == null)
					trav.right = new Node(value);
				else
					addNode(trav.right, value);
			}
		}

	}

	public void addNode(int value) {
		addNode(root, value);
	}

	void preOrder(Node trav) {
		// stop if trav is null
		if (trav == null)
			return;
		// visit current node (print data)
		System.out.print(" " + trav.data);
		// go into left of current node
		preOrder(trav.left);
		// go into right of current node
		preOrder(trav.right);
	}

	void preOrder() {
		System.out.print("PreOrder : ");
		preOrder(root);
		System.out.println("");
	}
}