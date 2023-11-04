package com.test;

import com.stack.Stack;

public class TesterReverseStack {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		
		Stack st =new Stack(5);
		System.out.println("\nBefore Array : ");
		for (int ele:arr) {
			st.push(ele);
			System.out.println(ele+"	");
		}
		
		for(int i=0;i<5;i++) {
			arr[i]=st.pop();
		}
		
		System.out.println("\nReverse Array : ");
		for (int ele:arr) {
			System.out.println(ele+"	");
		}	}
}
