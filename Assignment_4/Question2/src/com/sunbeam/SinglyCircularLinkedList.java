package com.sunbeam;

public class SinglyCircularLinkedList {
	public class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node tail;
	private int count;

	public SinglyCircularLinkedList() {
		tail = null;
//		count=0;
	}

//	public int getCount() {
//		return count;
//	}

	public boolean isEmpty() {
		return tail == null;
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			tail = newnode;
			tail.next = tail;
		} else {
			newnode.next = tail.next;
			tail.next = newnode;
		}
	}

	public void addLast(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			tail = newnode;
			tail.next = tail;
		} else {
			newnode.next = tail.next;
			tail.next = newnode;
			tail = newnode;
		}
	}

	public void addPosition(int value, int position) {
		if (position < 1) {
			System.out.println("Invalid position.");
			return;
		}
		Node newnode = new Node(value);
		if (isEmpty() && position == 1) {
			tail = newnode;
			tail.next = tail;
		} else {
			Node trav = tail.next;
			int count = 1;
			while (count < position - 1 && trav.next != tail.next) {
				trav = trav.next;
				count++;
			}
			newnode.next = trav.next;
			trav.next = newnode;
			if (position == 1) {
				tail = newnode;
			}
		}
	}

	public void deleteFirst() {
		if (isEmpty()) {
			System.out.println("List is Empty");
			return;
		} else if (tail == tail.next) {
			tail = null;
		} else {
			tail.next = tail.next.next;
		}
	}

	public void deleteLast() {
		if (isEmpty()) {
			System.out.println("List is Empty");
			return;
		} else if (tail == tail.next) {
			tail = null;
		} else {
			Node trav = tail.next;
			while (trav.next != tail) {
				trav = trav.next;
			}
			trav.next = tail.next;
			tail = trav;
		}
	}

	public void deletePosition(int position) {
		if (!isEmpty() && position >= 1) {
			if (position == 1) {
				deleteFirst();
			} else {
				Node trav = tail.next;
				int count = 1;
				while (count < position - 1 && trav.next != tail.next) {
					trav = trav.next;
					count++;
				}
				if (trav.next != tail.next) {
					trav.next = trav.next.next;
				} else {
					System.out.println("Invalid position.");
				}
			}
		}
	}

	public void displayList() {

		Node trav = tail.next;
		do {
			System.out.println(" " + trav.data);
			trav = trav.next;
		} while (trav != tail.next);
		System.out.println();

	}
}
