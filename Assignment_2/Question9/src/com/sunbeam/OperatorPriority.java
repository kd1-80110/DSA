package com.sunbeam;

public class OperatorPriority {
	public static int getPriority(char operator) {
		switch (operator) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		default:
			return 0;
		}
	}

	public static void main(String[] args) {
		char operator = '*';
		int priority = getPriority(operator);
		System.out.println("Priority of " + operator + " is " + priority);

		char operator1 = '+';
		int priority1 = getPriority(operator1);
		System.out.println("Priority of " + operator1 + " is " + priority1);

	}
}