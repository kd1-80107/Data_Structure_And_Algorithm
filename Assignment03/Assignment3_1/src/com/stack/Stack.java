package com.stack;

public class Stack {
	private int arr[];
	private final int SIZE;
	private int top;
	public Stack(int size) {
		SIZE = size;
		arr = new int[SIZE];
		this.top = -1;
	}
	
	public void push(int data) {
		top++;
		arr[top] = data; 
	}
	
	public int pop() {
		int data = arr[top];
		top--;
		return data;
	}
	
	public int peek() {
		return arr[top];
	}
	
	public boolean isFull(){
		return top==SIZE-1;
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
}
