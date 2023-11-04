package com.linkedlist;

import com.linkedlist.List.Node;

public class List {
	
	public class Node {
	    public int data;
	    public Node next;

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

    private Node head;

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public Node getHead() {
        return head;
    }
    
    public static int findMaxValue(List linkedList) {
        Node trav = linkedList.getHead();
        int max = Integer.MIN_VALUE;

        while (trav != null) {
            if (trav.data > max) {
                max = trav.data;
            }
            trav = trav.next;
        }

        return max;
    }

    
    public static int findMinValue(List linkedList) {
        Node trav = linkedList.getHead();
        int min = Integer.MAX_VALUE;

        while (trav != null) {
            if (trav.data < min) {
                min = trav.data;
            }
            trav = trav.next;
        }

        return min;
    }
    
    public void display() {
    	Node trav= head;
    	System.out.print("List : ");
    	while(trav!=null) {
    		System.out.print(" "+trav.data);
    		trav = trav.next;
    	}
    }
}
