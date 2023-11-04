package com.infixtopostfixconversion;


public class MultiNumberInfixToPostfix {
	
	public static int priority(char operator) {
		switch(operator) {
		case '$':
			return 10;
		case '%':
			return 9;
		case '/':
			return 9;
		case '*':
			return 9;
		case '+':
			return 8;
		case '-':
			return 8;
		}
		return 0;
	}
	
	
	public static String infixToPostfixConversion(String infix) {
		Stack <String>st = new Stack<>(10);
		StringBuilder postfix = new StringBuilder();
		
		String[] tokens = infix.split("\\s+");

		    for (int i = 0; i < tokens.length; i++)
		    {
		        String token = tokens[i];

		        if (Character.isDigit(token.charAt(0)) )
		            postfix.append(token).append(" ");
		        else if (token.equals("(")){
		        		st.push(token);
		        } 
		        else if (token.equals(")")){
		        	while (!st.isEmpty() && !st.peek().equals("(")) 
		                postfix.append(st.pop()).append(" ");
		        	
		            if (!st.isEmpty() && st.peek().equals("(")) {
		                st.pop(); 
		            } else {
		                return "Invalid expression";
		            }
		        } else {
		            char tok = token.charAt(0);

		            while (!st.isEmpty() && priority(st.peek().charAt(0)) >= priority(tok)) {
		                postfix.append(st.pop()).append(" ");
		            }

		            st.push(token);
		        }
		    }

		    while (!st.isEmpty()) {
		        if (st.peek().equals("(") || st.peek().equals(")")) {
		            return "Invalid expression";
		        }
		        postfix.append(st.pop()).append(" ");
		    }

		    return postfix.toString().trim();
	}

	public static void main(String[] args) {
		String infix = "20 - ( 40 * 30 )";
		System.out.println("Infix Expression = "+infix);
		String postfix  = infixToPostfixConversion(infix);
		System.out.println("Postfix Expression = "+postfix);
	}
}
