package com.peter12.solution.easy;

public class EASY_0342_POWER_OF_FOUR {
	public static boolean isPowerOfFour(int n) {
		if( n == 0 ) {
			return false;
		}
		
		int result = n;
		while( result % 4 == 0 ) {
			result /= 4;
		}
		
		return result == 1;
	}
}
