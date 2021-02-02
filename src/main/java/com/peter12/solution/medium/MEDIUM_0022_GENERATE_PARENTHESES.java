package com.peter12.solution.medium;

import java.util.List;
import java.util.Vector;

public class MEDIUM_0022_GENERATE_PARENTHESES {
	public static List<String> generateParenthesis(int n) {
		
		List<String> result = new Vector<String>();
		if( n <= 0 ) {
			return result;
		}
		
		if( n == 1 ) {
			result.add("()");
			return result;
		}
		
		for( int i = 1; i < n; i++ ) {
			List<String> first = generateParenthesis(i);
			List<String> second = generateParenthesis( n - i );
			
			for( String f : first) {
				for( String s : second) {
					String r = f + s;
					
					if( !result.contains(r) ) {
						result.add(r );
					}
				}
			}
		}
		
		List<String> subP = generateParenthesis( n - 1 ); 
		for( String p : subP ) {
			//( p )
			String r = "(" + p + ")";
			if( !result.contains(r) ) {
				result.add(r );
			}
			
		}
		
		return result;
	}
}
