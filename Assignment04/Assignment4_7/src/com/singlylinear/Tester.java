package com.singlylinear;

public class Tester {
	public static void main(String[] args) {
		List list=new List();
		list.addLast(100);
	    list.addLast(50);
	    list.addLast(25);

	    list.displayList(); 

	    List.reverseList(list);
	    System.out.println("Reverse List : ");
	    list.displayList();
	}
}
