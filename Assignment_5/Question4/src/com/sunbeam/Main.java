package com.sunbeam;

public class Main {
	public static void main(String[] args) {
		BinaryTreeSearch bst=new BinaryTreeSearch();
		
		bst.addNode(20);
		bst.addNode(3);
		bst.addNode(10);
		bst.addNode(1);
		bst.addNode(6);
		bst.addNode(14);
		bst.addNode(4);
		bst.addNode(7);
		bst.addNode(13);
		
		bst.preOrder();
	}
	
	
}
