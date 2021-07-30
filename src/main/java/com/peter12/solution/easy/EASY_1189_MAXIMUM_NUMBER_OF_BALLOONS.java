package com.peter12.solution.easy;

public class EASY_1189_MAXIMUM_NUMBER_OF_BALLOONS {
	public int maxNumberOfBalloons(String text) {

		int[] count = new int[26];
		for( char t : text.toCharArray() ) {
			count[ t - 'a' ]++;
		}

		//l = 2
		int result = Integer.MAX_VALUE;
		char[] ch2 = new char[] {'l', 'o'};
		for( char c : ch2 ) {
			result = Math.min( result, count[ c - 'a'] / 2);
		}

		char[] ch1 = new char[] {'b', 'a', 'n'};
		for( char c : ch1 ) {
			result = Math.min( result, count[ c - 'a'] );
		}

		return result;

	}
}
