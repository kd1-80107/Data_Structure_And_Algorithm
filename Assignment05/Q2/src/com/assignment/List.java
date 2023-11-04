/*
 * 2. Implement stack and queue using linked list.
 */

package com.assignment;

public class List {
	public class Node
	{
		private int data;
		private Node next;
		private Node prev;
		
		public Node(int value)
		{
			data = value;
			next = null;
			prev = null;
		}
	}
	
	private Node head;
	private Node tail;
	
	public List()
	{
		head = null;
		tail = null;
	}
	
	public boolean isEmpty()
	{
		return head == null && tail == null;
	}
	
	public void addFirst(int value)
	{
		Node newnode = new Node(value);
		
		if(isEmpty())
		{
			head = tail = newnode;
		}
		else {
				newnode.next = head;
				head.prev = newnode;
				head = newnode;
		}
	}
	
	public void deleteFirst()
	{
		if(isEmpty())
		{
			System.out.println("List is Empty");
		}
		else if(head.next == null) {
			head = tail = null;
		}
		else {
			head = head.next;
			head.prev = null;
		}
		
	}
	
	public int getData()
	{
		return head.data;
	}
	
	
	

}
