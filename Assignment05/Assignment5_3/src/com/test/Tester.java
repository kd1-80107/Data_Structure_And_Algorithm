package com.test;

public class Tester {

	public static void main(String[] args) {
		DequeUsingDoublyLinkedL dq=new DequeUsingDoublyLinkedL();
		dq.addRear(10);
		dq.addRear(20);
		dq.addRear(30);
		dq.addRear(40);
		System.out.println("Removed Element : "+dq.removeFront());
		System.out.println("Removed Element : "+dq.removeRear());

	}

}
