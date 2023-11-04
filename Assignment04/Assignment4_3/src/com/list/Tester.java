package com.list;

public class Tester {
	public static void main(String[] args) {
		List list=new List();
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);
		list.addFirst(50);

		System.out.println("Middle element : "+list.findMiddleElement());
	}
}
