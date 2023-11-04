/*
 	1. Implement add and delete at position in doubly circular linked list.
 */


package com.assignment;

public class DoublyLinearList 
{
	public class Node
	{
		private int data;
		private Node next;
		private Node prev;
		
		public Node(int value)
		{
			data = value;
			next = prev = null;
		}
	}
	
	private Node head;
	
	public DoublyLinearList()
	{
		head = null;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	//add first
	
	public void addPos(int value,int pos)
	{
		Node newnode = new Node(value);
		if(isEmpty())
		{
			head = newnode;
			head.next = newnode;
			head.prev = newnode;
		}
		else {
				Node trav = head;
				for(int i=1; i< pos-1; i++)
				{
					trav = trav.next;
				}
				
				newnode.next = trav.next;
				newnode.prev = trav;
				trav.next = newnode;
				newnode.next.prev = newnode;
		}
	}
	
	public void deletePos(int pos)
	{
		if(isEmpty())
		{
			return;
		}
		else if(head.next == head)
				head = null;
		else {
				Node trav = head;
				for(int i = 1; i<pos; i++)
				{
					trav = trav.next;
				}
				
				trav.prev.next = trav.next;
				trav.next.prev = trav.prev;
		}
	}
	
	public void fDisplay() {
		if(isEmpty())
			return;
		
		Node trav = head;
		System.out.print("Forward List : ");s
		do {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}while(trav != head);	
		System.out.println("");
	}
	
	
}
