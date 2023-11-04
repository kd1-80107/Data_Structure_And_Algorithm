package com.test;

import com.stack.Stack;

public class TesterStack {
	public static void main(String[] args) {
	   Stack st=new Stack(5);
	   st.push(10);
	   st.push(20);
	   st.push(50);
	   st.push(30);
	   st.push(5);
	   System.out.println("Maximum element in stack is: "+st.peek());

//	   st.pop();
//	   st.pop();
//	   
//	   System.out.println("Maximum element in stack is: "+st.peek());

	}
}
