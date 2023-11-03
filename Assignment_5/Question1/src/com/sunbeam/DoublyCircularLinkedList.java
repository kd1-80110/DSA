package com.sunbeam;

public class DoublyCircularLinkedList {
	public class Node{
		private int data;
		private Node next;
		private Node prev;
		public Node(int value) {
			data=value;
			next=null;
			prev=null;
		}
	}
	
	private Node head;
	
	public DoublyCircularLinkedList() {
		head=null;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void addFirst(int value) {
		Node nn=new Node(value);
		if(isEmpty()) {
			head=nn;
			head.next=nn;
			head.prev=nn;
		}
		else {
			nn.next=head;
			nn.prev=head.prev;
			head.prev.next=nn;
			head.prev=nn;
			head=nn;
		}
	}
	
	public void addLast(int value) {
		Node nn=new Node(value);
		if(isEmpty()) {
			head=nn;
			head.next=nn;
			head.prev=nn;
		}
		else {
			nn.next=head;
			nn.prev=head.prev;
			head.prev.next=nn;
			head.prev=nn;
		}
	}
	
	public void addPosition(int value,int pos) {
		Node nn=new Node(value);
		if(isEmpty()) {
			head=nn;
			head.next=nn;
			head.prev=nn;
		}
		else if(pos==1){
			addFirst(value);
		}else {
			Node trav=head;
			for(int i=1;i<pos-1 &&trav.next!=head;i++)
				trav=trav.next;
			if(trav!=null) {
				nn.prev=trav;
				nn.next=trav.next;
				trav.next=nn;
				nn.next.prev=nn;
			}else {
				addLast(value);
			}
		}
	}
	
	public void deleteFirst() {
		if(isEmpty())
			return;
		else if(head.next == head)
			head = null;
		else {
			head.prev.next = head.next;
			head.next.prev = head.prev;
			head = head.next;
		}
	}
	
	public void deleteLast() {
		if(isEmpty())
			return;
		else if(head.next == head)
			head = null;
		else {
			head.prev.prev.next = head;
			head.prev = head.prev.prev;
		}
	}
	
	public void deletePosition(int pos) {
		if(isEmpty())
			return;
		else if(pos==1) {
			deleteFirst();
		}
		else {
			Node trav=head;
			for(int i=1;i<pos&&trav.next!=head;i++)
				trav=trav.next;
			if(trav!=null) {
				trav.prev.next=trav.next;
				trav.next.prev=trav.prev;
			}else {
				deleteLast();
			}
			
		}
		
	}
	
	public void forwardDisplay() {
		if(isEmpty()) {
			System.out.println("Forward Display");
		}
		else {
			Node trav=head;
			do {
				System.out.println(""+trav.data);
				trav=trav.next;
			}while(trav!=head);
			System.out.println("");
		}
	}
	
	
	
	public void reverseDisplay() {
		if(isEmpty()) {
			System.out.println("Reverse Display");
		}
		else {
			Node trav=head.prev;
			do {
				System.out.println(""+trav.data);
				trav=trav.prev;
			}while(trav!=head.prev);
			System.out.println("");
		}
	}

}


























