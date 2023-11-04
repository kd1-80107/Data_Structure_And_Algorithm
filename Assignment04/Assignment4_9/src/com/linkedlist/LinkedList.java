package com.linkedlist;


public class LinkedList {
	public static void main(String[] args) {
		List linkedList = new List();
		linkedList.append(5);
		linkedList.append(2);
		linkedList.append(9);
		linkedList.append(1);

		linkedList.display();
		System.out.println("");
		int max = List.findMaxValue(linkedList);
		int min = List.findMinValue(linkedList);

		System.out.println("Maximum value is " + max);
		System.out.println("Minimum value is " + min);
	}
}

