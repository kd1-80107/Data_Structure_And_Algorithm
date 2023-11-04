package com.list;

public class Tester {
	public static void main(String[] args) {
		List list=new List();
		list.addLast(90);
		list.addLast(100);
		list.addLast(400);

		list.displayList(); 

		list.insertAfterNode(2, 95);
		list.displayList(); 

		list.insertBeforeNode(4, 105);

		list.displayList(); 
	}
}
