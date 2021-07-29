package com.peter12.solution.easy;

public class EASY_0796_ROTATE_STRING {
	public boolean rotateString(String s, String goal) {

		if( s.length() != goal.length() ) {
			return false;
		}


		for( int i = 0; i < s.length(); i++ ) {
			int k = i, j = 0;

			while( j < goal.length() && s.charAt(k) == goal.charAt(j) ) {
				//System.out.println( " k = " + k + " j = " + j + " " +s.charAt(k) + " " +s.charAt(j) );
				j++;

				k = (k + 1) % s.length();
			}

			if( j == goal.length() ) {
				System.out.println( " i = " + i + " j = " + j);
				return true;
			} 
		}

		return false;

	}
}
