package com.solution4;
/*4. Write recursive function to add node into bst.*/
public class BinaryTreeSearch {
public class Node{
	private int data;
	private Node left;
	private Node right;
	public Node(int value) {
		data=value;
		left=null;
		right=null;
	}
}
private Node root;
public BinaryTreeSearch() {
	root=null;
}
public boolean isEmpty() {
	return root ==null;
	
}
public Node addNode(Node i ,int key) {
	Node newnode=new Node(key);
	if(isEmpty()) {
		 i=newnode;
	}
	else if(key<i.data){
				i.left=addNode(i.left,key);
			}
	else if(key>i.data)
		i.right=addNode(i.right, key);
		return i;
		}
void preOrder(Node trav) {
	// stop if trav is null
	if(trav == null)
		return;
	// visit current node (print data)
	System.out.print(" " + trav.data);
	// go into left of current node
	preOrder(trav.left);
	// go into right of current node
	preOrder(trav.right);
}

	
	
}

