package com.stack;

import java.util.Scanner;

public class StackDesc {
	
	public static void main(String[] args) {
		
		Stack stack = new Stack(4);
		Scanner sc = new Scanner(System.in);
		int choice;
		do{
			System.out.println("0. EXIT\n1.Push\n2.Pop\n3.Peek");
			System.out.println("Enter your choice = ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				if(stack.isFull()) 
					System.out.println("Stack is full");
				else{
					System.out.println("Enter data : ");
					int data = sc.nextInt();
					stack.push(data);
				}
				break;
			case 2:
				if(stack.isEmpty()) 
					System.out.println("Stack is empty");
				else{
					int poppedData = stack.pop();
					System.out.println("Popped Data : "+poppedData);
				}
				break;
			case 3:
				if(stack.isEmpty()) 
					System.out.println("Stack is empty");
				else{
					int peekedData = stack.peek();
					System.out.println("Peeked Data : "+peekedData);
				}
				break;
			}
		}while(choice!=0);
		sc.close();
	}
}
