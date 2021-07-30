package com.peter12.solution.easy;

public class EASY_1614_MAXIMUM_NESTING_DEPTH_OF_THE_PARENTHESES {

	public int maxDepth(String s) {

		if( s.length() == 0 ) { //""
			return 0;
		}

		int result = 0;
		int depth = 0;
		for( int i = 0; i < s.length(); i++ ) {
			if( s.charAt(i) == '(' ) {
				depth++;

				result = Math.max( result, depth);

				System.out.println( " result = " + result + " depth = " + depth );
			} else if( s.charAt(i) == ')' ) {
				depth--;
			}
		}

		return result;
	}

}
