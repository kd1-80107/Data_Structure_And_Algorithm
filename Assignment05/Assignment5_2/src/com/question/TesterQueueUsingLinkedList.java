package com.question;

import com.linkedlist.usingstack.QueueUsingLinkedList;

public class TesterQueueUsingLinkedList{
	public static void main(String[] args) {
		QueueUsingLinkedList q1=new QueueUsingLinkedList(3);
		q1.push(10);
		q1.push(20);

		System.out.print("Queue Using Linked List : Operations");
		System.out.println();
		System.out.print("Popped : "+q1.pop());
		System.out.println();
		System.out.print("Popped : "+q1.pop());
		
	}
}