package com.peter12.solution.easy;

public class EASY_0326_POWER_OF_THREE {
	public static boolean isPowerOfThree(int n) {
		
		if( n == 0 ) {
			return false;
		}
		
		int result = n;
		while( result % 3 == 0 ) {
			result /= 3;
		}
		
		return result == 1;
	}
}
