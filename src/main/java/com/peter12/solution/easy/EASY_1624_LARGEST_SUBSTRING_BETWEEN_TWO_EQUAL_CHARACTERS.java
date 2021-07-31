package com.peter12.solution.easy;

public class EASY_1624_LARGEST_SUBSTRING_BETWEEN_TWO_EQUAL_CHARACTERS {
	public int maxLengthBetweenEqualCharacters(String s) {

		int result = -1;

		for( int i = 0; i < s.length(); i++ ) {

			int j = s.length() - 1;
			while( j > i && s.charAt(j) != s.charAt(i) ) {
				j--;
			}

			result = Math.max( result, j - 1 - i);

		}

		return result;
	}
}
