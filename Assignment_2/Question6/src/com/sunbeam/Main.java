package com.sunbeam;

public class Main {
	public static void main(String[] args) {
		DescendingStack stack = new DescendingStack(10);

		for (int i = 1; i < 10; i++) {
			stack.push(i);
		}

		System.out.println("descending stack :");
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}