package com.infixtopostfixconversion;

public class Stack<Type> {
	private Object arr[];
	private final int SIZE;
	private int top;
	int max;
	public Stack(int size) {
		SIZE = size;
		arr = new Object[SIZE];
		this.top = -1;
	}
	
	public void push(Type data) {
		top++;
		arr[top] = data; 
	}
	
	public Type pop() {
		Type data = (Type) arr[top];
		top--;
		return data;
	}
	
	public Type peek() {
		return (Type) arr[top];
	}
	
	public boolean isFull(){
		return top==SIZE-1;
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
}
