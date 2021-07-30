package com.peter12.solution.easy;

public class EASY_1544_MAKE_THE_STRING_GREAT {
	public String makeGood(String s) {

		//System.out.println(s);
		if( s.length() == 0 ) {
			return "";
		}

		int distance = Math.abs('A' - 'a');


		for( int i = 0; i < s.length() - 1; i++) {

			int d = Math.abs( s.charAt(i) - s.charAt( i+1) );
			//System.out.println( " d = " + d + " distance = " + distance);
			if( d == distance ) {
				String newS = s.substring(0, i);
				newS += s.substring( i + 2);

				return makeGood( newS);
			}

		}

		return s;
	}
}
