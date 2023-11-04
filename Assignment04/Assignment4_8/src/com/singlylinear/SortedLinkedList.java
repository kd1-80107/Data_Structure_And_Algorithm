package com.singlylinear;

public class SortedLinkedList {
	public class Node {
	    int data;
	    Node next;

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}
	private Node head;
	public SortedLinkedList() {
		head = null;
	}
	
	public void insertSorted(int value) {
		Node newNode = new Node(value);
		
		if (head == null || value < head.data) {
			newNode.next = head;
			head = newNode;
		} 
		else {
			Node current = head;
			while (current.next != null && current.next.data < value) {
				current = current.next;
	        }
			newNode.next = current.next;
			current.next = newNode;
	    }
	}

	public void display() {
		Node current = head;
		System.out.print("List :");
		while (current != null) {
			System.out.print(" "+current.data);
			current = current.next;
		}
	}
	
	public static void main(String[] args) {
		SortedLinkedList linkedList = new SortedLinkedList();
		
		linkedList.insertSorted(3);
		linkedList.insertSorted(1);
		linkedList.insertSorted(2);
		linkedList.insertSorted(5);
		linkedList.insertSorted(4);

		linkedList.display();
    }
}
