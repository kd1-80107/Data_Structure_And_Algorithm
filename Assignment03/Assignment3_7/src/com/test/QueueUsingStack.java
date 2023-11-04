package com.test;

import com.queue.Queue;

public class QueueUsingStack {
	public static void main(String[] args) {
		
		Queue queue=new Queue(3);
		queue.add(10);
		queue.add(20);
		queue.add(30);
		
		System.out.println("Elements in the queue are:");
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
	}
}
