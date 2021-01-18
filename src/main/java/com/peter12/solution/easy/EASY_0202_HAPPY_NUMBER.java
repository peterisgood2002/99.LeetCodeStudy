package com.peter12.solution.easy;

public class EASY_0202_HAPPY_NUMBER {
	public static boolean isHappy(int n) {
		if( n == 0 ) {
			return false;
		}
		
		if( n == 1 ) {
			return true;
		} 
		
		if( 1 < n && n <= 9 ) {
			return false;
		}
		
		int result = 0; 
		do {
			int remainder = n % 10;
			result += remainder * remainder;
			
			n /= 10;
		} while( n > 0);
		
		
		return isHappy(result);
		
		
	}
}
