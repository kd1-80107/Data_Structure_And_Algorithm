package com.test;

public class DequeUsingDoublyLinkedL {
	
	DoublyLinkedList list;

	public DequeUsingDoublyLinkedL() {
		this.list =new DoublyLinkedList();
	}
	 
	public void  addRear(int data) 
	{
		list.addLast(data);
	}
	
	public int  removeRear() 
	{
		return list.deleteLast();
	}
	public int  removeFront() 
	{
		return list.deleteFirst();
	}



}
