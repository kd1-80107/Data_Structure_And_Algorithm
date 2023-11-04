package com.infixtoprefixconversion;

public class Stack<Type> {
	private Object arr[];
	private final int SIZE;
	private int top;
	public Stack(int size) {
		SIZE = size;
		arr = new Object[SIZE];
		this.top = -1;
	}
	
	public void push(Object data) {
		top++;
		arr[top] = data; 
	}
	
	public Object pop() {
		Object data = (Type)arr[top];
		top--;
		return data;
	}
	
	public String peek() {
		return (String)arr[top];
	}
	
	public boolean isFull(){
		return top==SIZE-1;
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
}
