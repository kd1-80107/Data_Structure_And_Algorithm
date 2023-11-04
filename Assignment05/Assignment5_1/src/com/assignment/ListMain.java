package com.assignment;

public class ListMain {

	public static void main(String[] args) {
		
		DoublyLinearList l1 = new DoublyLinearList();
		l1.addPos(10, 1);
		l1.addPos(20, 2);
		l1.addPos(30, 3);
		//l1.fDisplay();
		
		l1.deletePos(1);
		l1.fDisplay();
		
		
	}

}
