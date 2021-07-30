package com.peter12.solution.easy;

public class EASY_1221_SPLIT_A_STRING_IN_BALANCED_STRINGS {
	public int balancedStringSplit(String s) {

		int result = 0;

		int count = 0;
		for( char ch : s.toCharArray() ) {
			if( ch == 'L' ) {
				count++;
			} else if ( ch == 'R' ) {
				count--;
			}

			if( count == 0 ) {
				result++;
			}

		}

		return result;
	}
}
