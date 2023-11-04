package com.singlylinear;

public class Tester {
	public static void main(String[] args) {
		List list=new List();
		 list.addLast(50);
	        list.addLast(20);
	        list.addLast(40);
	        System.out.println("Before :");
	        list.displayList(); 

	        List.bubbleSort(list);
	        System.out.println("After sorting :");
	        list.displayList(); 
	}
}
