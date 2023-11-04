package com.singlycircularlinkedlist;

public class SinglyCircularLinkedList {
	public static void main(String[] args) {
		List list = new List();
		
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);

		list.addLast(50);

		list.addPosition(1, 1);
		list.addPosition(40, 5);

		list.deleteFirst();
		list.deleteLast();
		list.deletePosition(1);

		list.display();
	}
}
