package com.peter12.solution.easy;

public class EASY_1967_NUMBER_OF_STRINGS_THAT_APPEAR_AS_SUBSTRINGS_IN_WORD {
	public int numOfStrings(String[] patterns, String word) {

		int result = 0;
		for( String p : patterns ) {
			int index = word.indexOf(p);
			if( index != -1 ) {
				result++;
			}  

		}

		return result;
	}
}
