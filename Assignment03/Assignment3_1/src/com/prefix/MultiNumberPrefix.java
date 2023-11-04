package com.prefix;

import com.stack.Stack;

public class MultiNumberPrefix {
	
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
	
	
	public static int prefixEvaluation(String prefix) {
		
		Stack st = new Stack(11);
		String[] tokens = prefix.split("\\s+");

	    for (int i = tokens.length - 1; i >= 0; i--)
	    {
	        String token = tokens[i];

	        if (Character.isDigit(token.charAt(0)))
	        {
	            int num = Integer.parseInt(token);
	            st.push(num);
	        } 
	        else 
	        {
	            if (st.isEmpty())
	            {
	                throw new IllegalArgumentException("Invalid prefix expression: Not enough operands for the operator.");
	            }
	            int opr1 = st.pop();
				int opr2 = st.pop();
				int result = calculate(opr1, token.charAt(0), opr2);
				st.push(result);
			}		
		}
	    if (!st.isEmpty()) {
	        return st.pop();
	    } else {
	        throw new IllegalArgumentException("Invalid prefix expression: Too many operands.");
	    }
	}
	public static void main(String[] args) {
//		String prefix = "- + + 4 / * 5 6 3 9 7";
		String prefix = "- 20 * 40 30";
		System.out.println("Prefix Expression = "+prefix);
		int evaluation  = prefixEvaluation(prefix);
		System.out.println("Prefix Evaluation = "+evaluation);
	}
}
