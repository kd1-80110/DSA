package com.sunbeam;

public class CircularQueue {
	private int arr[];
	private int rear, front;
	private final int SIZE;
	private int count=0;
	
	public CircularQueue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = -1;
		rear = -1;
	}
	public void push(int data) {
		// a. reposition rear (inc)
		count++;
		rear = (rear + 1) % SIZE;
		// b. add data at rear index
		arr[rear] = data;
	}
	
	public void pop() {
		// a. reposition front
		front = (front + 1) % SIZE;
		if(front == rear)
			front = rear = -1;
	}
	
	public int peek() {
		//a. read/return data of front + 1 index
		return arr[(front + 1) % SIZE];
	}
	
	public boolean isFull() {
		return count==SIZE;
	}
	
	public boolean isEmpty() {
		return count==0;
	}

}
