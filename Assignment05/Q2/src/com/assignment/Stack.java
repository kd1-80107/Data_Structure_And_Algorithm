package com.assignment;

public class Stack {
	
	
	List l1;
	public Stack()
	{
		l1 = new List();
	}
	
	public boolean isEmpty()
	{
		return l1.isEmpty();
	}
	
	public void push(int value)
	{
		 l1.addFirst(value);
	}
	
	public void pop(int value)
	{
		l1.deleteFirst();
	}
	
	public int peek(int value)
	{
		return l1.getData();
	}
	
}
