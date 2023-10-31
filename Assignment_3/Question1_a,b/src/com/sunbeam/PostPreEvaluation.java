package com.sunbeam;


public class PostPreEvaluation {
	public static int calculate(int op1, int op2, char opr) {
		switch (opr) {
		case '+':
			return op1 + op2;
		case '-':
			return op1 - op2;
		case '*':
			return op1 * op2;
		case '/':
			return op1 / op2;
		case '%':
			return op1 % op2;
		}
		return 0;
	}


	public static int postfixSingleDigitEvaluate(String postfix) {
		Stack st = new Stack(10);
		for (int i = 0; i < postfix.length(); i++) {
			char ele = postfix.charAt(i);
			if (Character.isDigit(ele)) {
				st.push(ele - '0');
			} else {

				int op2 = st.pop();
				int op1 = st.pop();
				st.push(calculate(op1, op2, ele));
			}

		}
		if (!st.isEmpty())
			return st.pop();
		else
			return 0;
	}

	public static int postfixMultiDigitEvaluate(String postfix) {
		Stack st = new Stack(30);
		String[] str;
		str = postfix.split(",");
		for (int i = 0; i < str.length; i++) {
			String ele = str[i];
			try {
				int number = Integer.valueOf(ele);
				st.push(number);
			} catch (NumberFormatException ex) {
				int op2 = st.pop();
				int op1 = st.pop();
				char c = ele.charAt(0);
				st.push(calculate(op1, op2, c));
			}

		}
		if (!st.isEmpty())
			return st.pop();
		else
			return 0;
	}

	public static int prefixSingleDigitEvaluate(String prefix) {
		Stack st = new Stack(30);
		for (int i = prefix.length() - 1; i >= 0; i--) {
			char ele = prefix.charAt(i);
			if (Character.isDigit(ele)) {
				st.push(ele - '0');
			} else {

				int op1 = st.pop();
				int op2 = st.pop();
				st.push(calculate(op1, op2, ele));
			}

		}
		if (!st.isEmpty())
			return st.pop();
		else
			return 0;
	}

	public static int prefixMultiDigitEvaluate(String prefix) {
		Stack st = new Stack(30);
		String[] str;
		str = prefix.split(",");

		for (int i = str.length - 1; i >= 0; i--) {

			String ele = str[i];

			try {
				int number = Integer.valueOf(ele);
				st.push(number);
			} catch (NumberFormatException ex) {
				int op1 = st.pop();
				int op2 = st.pop();
				char c = ele.charAt(0);
				st.push(calculate(op1, op2, c));
			}

		}
		if (!st.isEmpty())
			return st.pop();
		else
			return 0;
	}

	

	public static void main(String[] args) {

		String postfix1 = "456*3/+9+7-";
		String postfix2 = "10,10,2,*,+";
		// String postfix3 = "22,23,+,24,+";
		System.out.println("Postfix Single-Digit Evaluation = " + postfixSingleDigitEvaluate(postfix1));
		System.out.println("Postfix Multi-Digit Evaluation = " + postfixMultiDigitEvaluate(postfix2));

		String prefix1 = "-++4/*56397";
		String prefix2 = "+,10,*,10,2";
		// String postfix3 = "22,23,+,24,+";
		System.out.println("Prefix Single-Digit Evaluation = " + prefixSingleDigitEvaluate(prefix1));
		System.out.println("Prefix Multi-Digit Evaluation = " + prefixMultiDigitEvaluate(prefix2));

	}

}