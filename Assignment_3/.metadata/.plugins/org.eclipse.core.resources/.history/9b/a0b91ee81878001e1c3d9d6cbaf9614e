package com.solution5;
/*5. Create an array of integers. Reverse the array using stack
*/
import java.util.Scanner;

public class StackMain {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Stack st1=new Stack(6);
	Stack st=new Stack(6);
int data;
for(int i=0;i<=st.arr.length-1;i++) {
	System.out.print("Enter element at "+i+": ");
	data=sc.nextInt();
	st.push(data);
}
for(int i=st.SIZE-1;i>=0;i--) {
	int arr=(int) st.pop();
	System.out.println(arr);
	st1.push(arr);
	
}
System.out.println("Reverse order: ");
for(int i=st.SIZE-1;i>=0;i--) {
	int m=(int) st1.pop();
	System.out.println(m);
}
//Stack st1=new Stack(6);

}
}
