package com.sunbeam;

public class Main {

	public static void main(String[] args) {
		SinglyCircularLinkedList l1=new SinglyCircularLinkedList();
		l1.addFirst(40);
		l1.addFirst(30);
		l1.addFirst(20);
		l1.addFirst(10);
		l1.addLast(50);
		l1.addPosition(60,3);
		
//		l1.deleteFirst();
//		l1.deleteLast();
		l1.deletePosition(3);
		l1.displayList();

	}

}
