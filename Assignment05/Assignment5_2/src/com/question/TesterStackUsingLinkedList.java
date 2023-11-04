package com.question;

import com.linkedlist.usingstack.StackUsingLinkedList;

public class TesterStackUsingLinkedList {
	public static void main(String[] args) {
		StackUsingLinkedList stack=new StackUsingLinkedList(4);

		
		//if(stack.isFull())
		stack.push(10);
		stack.push(20);
		stack.push(40);


		stack.push(30);
		if(!stack.isFull())
			stack.push(50);

		System.out.print("Stack Using Linked List : Operations");
		System.out.println();
		System.out.print("Popped : "+stack.pop());
		System.out.println();
		System.out.print("Popped : "+stack.pop());
		System.out.println();
		System.out.print("Peeked : " +stack.peek());
		
	}
}
