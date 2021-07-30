package com.peter12.solution.easy;

public class EASY_0844_BACKSPACE_STRING_COMPARE {
	public boolean backspaceCompare(String s, String t) {

		String as = backspaceCompare(s);

		String ts = backspaceCompare(t);



		return as.equals(ts);
	}

	public String backspaceCompare( String str ) {
		StringBuilder result = new StringBuilder();
		for( char s : str.toCharArray() ) {
			//System.out.println( result );
			if( s == '#' ) {
				if(  result.length() > 0 ) {
					result.deleteCharAt( result.length() - 1 );
				}


			} else {
				result.append(s);
			}
		}


		return result.toString();
	}
}
