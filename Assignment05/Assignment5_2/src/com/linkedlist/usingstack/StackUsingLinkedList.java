package com.linkedlist.usingstack;

public class StackUsingLinkedList {
		List list;
		int Size;
		int count;

		public StackUsingLinkedList(int size) {
			Size=size;
			list=new List();
			
		}
		
		public void push(int value) {
			list.addFirst(value);
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
