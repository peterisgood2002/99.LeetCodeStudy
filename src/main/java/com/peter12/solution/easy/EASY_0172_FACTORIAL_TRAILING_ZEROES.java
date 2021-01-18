package com.peter12.solution.easy;

public class EASY_0172_FACTORIAL_TRAILING_ZEROES {
	public static int trailingZeroes(int n) {
		
		/*
		 *  5 * 1 = 5        ==> 1's 5
		 *  5 * 2 = 10       ==> 1's 5
		 *  5 * 3 = 15       ==> 1's 5
		 *  5 * 4 = 20       ==> 1's 5
		 *  5 * 5 * 1 = 25       ==> 1's 5 + 1's 5
		 *  5 * 6 = 30       ==> 1's 5
		 *  5 * 7 = 35       ==> 1's 5
		 *  5 * 8 = 40       ==> 1's 5
		 *  5 * 9 = 45       ==> 1's 5
		 *  5 * 5 * 2 = 50   ==> 1's 5 + 1's 5
		 *  5 * 11= 55       ==> 1's 5
		 */
		int result = 0;
		while( n  > 1) {
			result += n / 5;
			n /= 5;
			
		}
		
		
		
		return result;
	}
}
