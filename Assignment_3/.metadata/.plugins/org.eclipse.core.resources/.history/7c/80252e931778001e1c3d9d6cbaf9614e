package com.sunbeam;

import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueues<T> {

	private Queue<T> primaryQueue = new LinkedList<>();
	private Queue<T> secondaryQueue = new LinkedList<>();

	public void push(T element) {
		// Add the new element to the primary queue
		primaryQueue.offer(element);
	}

	public T pop() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}

		// Move all elements from primary to secondary queue except the last one
		while (primaryQueue.size() > 1) {
			secondaryQueue.offer(primaryQueue.poll());
		}

		// The last element in primary queue is the top of the stack
		T topElement = primaryQueue.poll();

		// Swap the names of primary and secondary queues
		Queue<T> temp = primaryQueue;
		primaryQueue = secondaryQueue;
		secondaryQueue = temp;

		return topElement;
	}

	public T top() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}

		T topElement = null;

		// Move all elements from primary to secondary queue except the last one
		while (!primaryQueue.isEmpty()) {
			topElement = primaryQueue.poll();
			secondaryQueue.offer(topElement);
		}

		// Swap the names of primary and secondary queues
		Queue<T> temp = primaryQueue;
		primaryQueue = secondaryQueue;
		secondaryQueue = temp;

		return topElement;
	}
	 public boolean isEmpty() {
	        return primaryQueue.isEmpty();
	    }

}

public class TesterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingQueues<Integer> stack = new StackUsingQueues<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.println("Top element: " + stack.top()); // Output: 3
		System.out.println("Popped element: " + stack.pop()); // Output: 3
		System.out.println("Top element after pop: " + stack.top()); // Output: 2
		System.out.println("Is stack empty: " + stack.isEmpty()); // Output: false
	}

}
