package com.list;

public class Tester {
	public static void main(String[] args) {
		List list=new List();
		list.addFirst(11);
		list.addFirst(12);
		list.addFirst(13);
		list.addFirst(14);
		list.addFirst(15);
		list.reverseLinkedList();
		
		
		list.displayList();
	}
}
