package com.test;

public class Tester {
	public static void main(String[] args) {
		StackUsingQueue s = new StackUsingQueue(3);

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.pop()); // Output: 30
        System.out.println(s.pop()); // Output: 20
        System.out.println(s.pop()); // Output: 10
	}
}
