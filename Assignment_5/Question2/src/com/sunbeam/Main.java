package com.sunbeam;

public class Main {

	public static void main(String[] args) {
		Stack st=new Stack();
		st.push(60);
		st.push(50);
		st.push(40);
		st.push(30);
		st.push(20);
		st.push(10);
//		st.pop();
		st.peek();
		
		Queue qu=new Queue();
		qu.push(10);
		qu.push(20);
		qu.push(30);
		qu.push(40);
		qu.push(50);
		
//		qu.pop();
		
		qu.peek();
	}

}
