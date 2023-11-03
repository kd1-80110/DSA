package com.sunbeam;

public class DescendingStack {
	private final int SIZE;
	private int top;
	private int[] stack;

	public DescendingStack(int size) {
		SIZE = size;
		top = size - 1;
		stack = new int[SIZE];
	}

	public boolean isEmpty() {
		return top == SIZE - 1;
	}

	public boolean isFull() {
		return top == -1;
	}

	public void push(int item) {
		if (!isFull()) {
			stack[top--] = item;
		} else {
			System.out.println("Stack is full. Cannot push item.");
		}
	}

	public int pop() {
		if (!isEmpty()) {
			return stack[++top];
		} else {
			System.out.println("Stack is empty. Cannot pop item.");
			return -1;
		}
	}

	public int peek() {
		if (!isEmpty()) {
			return stack[top + 1];
		} else {
			System.out.println("Stack is empty. Cannot peek.");
			return -1;
		}
	}

}