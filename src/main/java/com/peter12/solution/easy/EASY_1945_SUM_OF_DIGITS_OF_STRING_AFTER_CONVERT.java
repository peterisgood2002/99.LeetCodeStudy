package com.peter12.solution.easy;

public class EASY_1945_SUM_OF_DIGITS_OF_STRING_AFTER_CONVERT {
	public int getLucky(String s, int k) {

		int result = 0;
		for(char c : s.toCharArray() ) {
			result += getDigitSum( c - 'a' + 1);
		}

		System.out.println( "C = " + result);

		for( int i = 1; i < k; i++ ) {
			System.out.println( "T = " + result);
			result = getDigitSum( result);
		}

		return result;
	}

	public int getDigitSum( int data ) {

		int result = 0;
		while( data > 0 ) {
			result += data % 10;

			data /= 10;
		}

		return result;
	}
}
