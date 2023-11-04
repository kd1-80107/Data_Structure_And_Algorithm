package com.infixtoprefixconversion;

public class MultiNumberInfixToPrefix {
	
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
	
	
	public static String infixToPrefixConversion(String infix) {
		
		Stack <String>st = new Stack<>(11);
		
		StringBuilder prefix = new StringBuilder();
		String[] tokens = infix.split("\\s+");

	    for (int i = tokens.length - 1; i >= 0; i--) {
	        String token = tokens[i];

	        if (Character.isDigit(token.charAt(0) ) || Character.isLetter(token.charAt(0)) ) {
	            prefix.insert(0, token + " "); 
	        } 
	        else if (token.equals(")")) {
	            st.push(token);
	        } 
	        else if (token.equals("(")) {
	            while (!st.isEmpty() && !st.peek().equals(")")) {
	                prefix.insert(0, st.pop() + " "); 
	            }
	            if (!st.isEmpty() && st.peek().equals(")")) {
	                st.pop(); 
	            } 
	            else {
	                return "Invalid expression";
	            }
	        } 
	        else {
	            char tok = token.charAt(0);
//	            String character = (String);
	            while (!st.isEmpty() && priority(st.peek().charAt(0)) >= priority(tok)) {
	                prefix.insert(0, st.pop() + " "); 
	            }
	            st.push(token);
	        }
	    }

	    while (!st.isEmpty()) {
	        if (st.peek().equals("(") || st.peek().equals(")")) {
	            return "Invalid expression";
	        }
	        prefix.insert(0, st.pop() + " ");
	    }

	    return prefix.toString().trim();
	}
	
	public static void main(String[] args) {
		String infix = "20 - ( 40 * 30 )";
		System.out.println("Infix Expression = "+infix);
		String prefix  = infixToPrefixConversion(infix);
		System.out.println("Prefix Expression = "+prefix);
	
	}
}

