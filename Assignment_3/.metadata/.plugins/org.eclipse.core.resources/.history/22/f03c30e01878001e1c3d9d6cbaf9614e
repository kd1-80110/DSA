package com.solution5;

public class Stack {
	int arr[];
	int top;
   int SIZE;
   public Stack(int size) {
	   SIZE=size;
	   top=-1;
	   arr=new int[SIZE];
   }
   public int push(int data) {
	   if(top==SIZE-1)
	   {
		   System.out.println("STACK IS FULL");
	   }
	   top++;
	   arr[top]=data;
	   return arr[top];
   }
   public int pop() {
	   if(top==-1) {
		  System.out.println("STACK IS EMPTY");
	   }
	   int data=arr[top];
	   top--;
	   return data;
   }
   public boolean isEmpty() {
	   return top==-1;
   }
   public boolean isFull() {
	   return top==SIZE-1;
   }
     
   
}
