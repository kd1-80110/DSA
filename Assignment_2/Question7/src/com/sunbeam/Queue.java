package com.sunbeam;

public class Queue {
	private int arr[];
	private int rear;
	private int front;
	private final int SIZE;
	
	public Queue(int size) {
		SIZE=size;
		arr=new int[SIZE];
		front=0;
		rear=0;
		size=0;
	}
	
	public void push(int data) {
		arr[rear]=data;
		rear++;
	}
	public void pop() {
		front++;
	}
	public int peek() {
		return arr[front];
	}
	public boolean isFull() {
		return rear==SIZE;
	}
	public boolean isEmpty() {
		return front==rear;
	}
	
	

}
