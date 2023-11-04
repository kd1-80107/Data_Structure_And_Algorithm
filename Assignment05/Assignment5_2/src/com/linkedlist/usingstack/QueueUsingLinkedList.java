package com.linkedlist.usingstack;

public class QueueUsingLinkedList{
	
	List list;
	int Size;
	int count;

	public QueueUsingLinkedList(int size) {
		Size=size;
		count=0;
		list=new List();
		
	}
	
	
	public void push(int value) {
		list.addLast(value);
		count++;
		}
	
	public int pop() {
		count--;
		return list.deleteFirst();
	}
	
	public int peek() {			
		return list.getData();	
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
		}
	
	public boolean isFull() 
	{
		return count==Size;
	}


}