package com.peter12.solution.easy;

import java.util.HashMap;

public class EASY_0202_HAPPY_NUMBER {
	public static boolean isHappy(int n) {
	
		/**
		 * Solution in the Link: https://en.wikipedia.org/wiki/Happy_number 
		 */
		HashMap<Integer, Integer> seen = new HashMap<Integer, Integer>();
		int result = n;
		do {
			seen.put(result, result);
			result = squareDigit(result);
			
			
		} while( result != 1 && seen.get(result ) == null);
		
		return result == 1;
		
	}
	
	public static int squareDigit(int n ) {
		int result = 0;
		do {
			int remainder = n % 10;
			
			result += remainder * remainder;
		
			n /= 10;
		} while( n > 0 );
		
		
		return result;
	}
}
