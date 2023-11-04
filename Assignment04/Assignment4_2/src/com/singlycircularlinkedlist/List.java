package com.singlycircularlinkedlist;


public class List {
	public class Node{
		private int data;
		private Node next;
		public Node(int value) {
			this.data = value;
			this.next = null;
		}
	}
	 private Node tail;
	 public List() {
		 this.tail = null;
	 }
	 
	 public boolean isEmpty() {
		 return tail==null;
	 }
	 
	 public void addFirst(int value) {
		 Node newnode = new Node(value);
		 if(isEmpty()) {
			 tail=newnode;
			 newnode.next = newnode;
		 }
		 else {
			 newnode.next = tail.next;
			 tail.next = newnode;
		 }
	 }
	 
	 public void display() {
		 Node trav = tail.next;
		 System.out.print("List : ");
		 do {
			 System.out.print(" "+trav.data);
			 trav=trav.next;
		 }while(trav!=tail.next);
		 System.out.println("");
	 }
	 
	 public void addLast(int value) {
		 Node newnode = new Node(value);
		 if(isEmpty()) {
			 tail = newnode;
			 newnode.next = newnode;
		 }
		 else {
			 newnode.next = tail.next;
			 tail.next = newnode;
			 tail = newnode;
		 }
	 }
	 
	 public void addPosition(int value, int pos) {
		 Node newnode = new Node(value);			
		 if(isEmpty()) {
			 newnode.next=newnode;
			 tail=newnode;
		 }
		 else if(pos<=1){
			 newnode.next=tail.next;
			 tail.next=newnode;
			 return;
		 }
		 else {
			 Node trav=tail.next;//trav at first node  
			 for(int i=1; i< pos-1 && trav != tail; i++) 
				 trav=trav.next;
		
			 newnode.next=trav.next;//establish link first 			   
			 trav.next=newnode;
				   
			 if(trav==tail)//if trav at last node
				 tail=newnode; 	  
			}
	}
		
	public void deleteFirst() {
		if(isEmpty()) {
			System.out.println("List is Empty To delete first");
			return;
		}
		else {
			tail.next=tail.next.next;
		}
	}
		
	public void deleteLast() {
		if(isEmpty()) {
			System.out.println("List is Empty To delete last");
			return;
		}
		else {
			Node trav=tail.next;
			while(trav.next !=tail)
				trav=trav.next;
				
			trav.next=tail.next;
			tail=trav;
		}
	}
		
	public void deletePosition(int pos) {
		if(isEmpty()) {
			System.out.println("List is Empty To delete pos");
			return;
		}
		else if(pos<=1){
			tail.next=tail.next.next;	
		}
		// special 3: if list is having single node
		else if (tail.next == tail)
			tail=null;		
		else{
			Node trav=tail.next;
			for(int i=1; i< pos-1 && trav.next != tail; i++) 
				trav=trav.next;
				
			if(trav.next == tail)
				tail=trav;
			
			trav.next=trav.next.next;	
		}
	}
			 	 
}





/*
public class List {
	public class Node{
		private int data;
		private Node next;
		public Node(int value) {
			this.data = value;
			this.next = null;
		}
	}
	 private Node head;
	 public List() {
		 this.head = null;
	 }
	 
	 public boolean isEmpty() {
		 return head==null;
	 }
	 
	 public void addFirst(int value) {
		 Node newnode = new Node(value);
		 if(isEmpty()) {
			 head=newnode;
		 }
		 else {
			 newnode.next = head;
			 head= newnode;
		 }
	 }
	 
	 public void display() {
		 Node trav = head;
		 System.out.print("List : ");
		 while(trav!=null) {
			 System.out.print(" "+trav.data);
			 trav=trav.next;
		 }
		 System.out.println("");
	 }
	 
	 public void addLast(int value) {
		 Node newnode = new Node(value);
		 if(isEmpty()) {
			 newnode=head;
		 }
		 else {
			 Node trav = head;
			 while(trav.next!=null) {
				 trav= trav.next;
			 }
			 trav.next=newnode;
		 }
	 }
	 
	 
	 public void deleteFirst() {
		 if(isEmpty())
			 System.out.println("List is Empty.");
		 else {
			 head = head.next;
		 }
	 }
	 
	 public void deleteLast() {
		 if(isEmpty())
			 System.out.println("List is Empty.");
		 else if(head.next ==null) {
			 head = null;
		 }
		 else {
			 Node trav = head;
			 while(trav.next.next!=null) {
				 trav = trav.next;
			 }
			 trav.next= null;
		 }
	 }
	 
	 
	 public void addAtPosiotion(int value,int position)	 {
		 Node newnode = new Node(value);
		 if(isEmpty()) {
			 head = newnode;
		 }
		 else if(position<=1)
			 addFirst(value);
		 else {
			 Node trav = head;
			 for(int i=1;i<position-1 && trav.next!=null;i++)
				 trav = trav.next;
			 newnode.next = trav.next;
			 trav.next = newnode;
		 }
		 
	 }
	 
	 public void deleteAtPosiotion(int position)	 {
		 if(isEmpty()) {
			 System.out.println("List is empty.");
		 }
		 else if(head.next==null)
			 head = null;
		 else if(position<=1)
			 deleteFirst();
		 else {
			 Node trav = head;
			 for(int i=1;i<position-1 && trav.next.next!=null;i++)
				 trav = trav.next;
			 trav.next = trav.next.next;
		 }
		 
	 }
	 
	 
	 
	 
	 
	 
}
*/