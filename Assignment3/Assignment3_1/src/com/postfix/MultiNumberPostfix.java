package com.postfix;

import com.stack.Stack;

public class MultiNumberPostfix {
	
	public static int calculate(int oprand1,char operator,int operand2) {
		switch(operator) {
		case '+':
			return oprand1+operand2;
		case '-':
			return oprand1-operand2;
		case '/':
			return oprand1/operand2;
		case '*':
			return oprand1*operand2;
		case '%':
			return oprand1%operand2;
		}
		return 0;
	}
	
	
	public static int postfixEvaluation(String postfix) {
		
		Stack st = new Stack(10);
	
		String[] tokens = postfix.split("\\s+");

		for (int i = 0; i < tokens.length; i++) {
		    String token = tokens[i];

			if (Character.isDigit(token.charAt(0))) {
				int num = Integer.parseInt(token);
			    st.push(num);
			} 
			else {
				if (st.isEmpty()) {
			    	 throw new IllegalArgumentException("Invalid postfix expression: Not enough operands for the operator.");
			}
				int opr2 = st.pop();
				int opr1 = st.pop();
				int result  = calculate(opr1, token.charAt(0), opr2);
				st.push(result);
			}		
		}
	 	if (!st.isEmpty() ) {
	        return st.pop();
	    } else {
	        throw new IllegalArgumentException("Invalid postfix expression");
	    }
	}
	
	
	public static void main(String[] args) {
		String postfix = "20 40 30 * -";
		System.out.println("Postfix Expression = "+postfix);
		int evaluation  =  postfixEvaluation(postfix);
		System.out.println("Postfix Evaluation = "+evaluation);
	}
}
