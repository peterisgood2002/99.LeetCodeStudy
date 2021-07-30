package com.peter12.solution.easy;

public class EASY_1374_GENERATE_A_STRING_WITH_CHARACTERS_THAT_HAVE_ODD_COUNTS {
	public String generateTheString(int n) {
		String result = "";
		if( n % 2 == 1 ) {

			for( int i = 0; i < n; i++ ) {
				result += 'a';
			}


		} else {
			for( int i = 0; i < n - 1; i++ ) {
				result += 'a';
			}

			result+= 'b';
		}

		return result;
	}
}
