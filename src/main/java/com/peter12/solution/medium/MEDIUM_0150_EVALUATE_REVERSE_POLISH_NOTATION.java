package com.peter12.solution.medium;

import java.util.Stack;

public class MEDIUM_0150_EVALUATE_REVERSE_POLISH_NOTATION {
	public int evalRPN(String[] tokens) {
		Stack<String> stack = new Stack<String>();

		for( String t : tokens) {

			if( isOperator(t) ) {
				String a = stack.pop();
				String b = stack.pop();

				String result = execute(b, a, t);

				stack.push(result);
			} else {
				stack.push(t);
			}


		}

		return Integer.parseInt( stack.peek() );

	}

	public boolean isOperator(String s ) {
		return "+".equals(s) || "-".equals(s) || "*".equals(s) || "/".equals(s);
	}

	public String execute( String a, String b, String operator ) {

		int ia = Integer.parseInt(a);
		int ib = Integer.parseInt(b);

		int result = 0;
		switch( operator ) {
		case "+":
			result = ia + ib;
			break;
		case "-":
			result = ia - ib;
			break;
		case "*":
			result = ia * ib;
			break;
		case "/":
			result = (int)Math.floor( ia / ib );
			break;
		}

		System.out.println( a + " " + operator + " " + b + " = " +result);
		return String.valueOf( result );
	}
}
