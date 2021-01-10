package com.peter12.solution.easy;

public class EASY_0070_CLIMBING_STAIRS {
	public static int climbStairs(int n) {
		
		
		if( n == 1 ) {
			return 1;
		}
		
		if( n == 2 ) {
			return 2;
		}
		//1. Solution 1: Recursive
//		return climbStairs(n - 1 ) + climbStairs(n - 2);
		
		/*
		 * 2. Solution 2: This is Fibonacci Sequence
		 *    Result |    n    |   Reason    |    Ways 
		 *    --------------------------------------
		 *      1    |    1    |     1       |    1
		 *    --------------------------------------
		 *      2    |    2    |     1 + 1   |    2
		 *    -----------------------------------------
		 *      3    |    3    |     1 + 2   |    2
		 *           |         |     2 + 1   |    1
		      ----------------------------- ----------  
		        5    |     4   |     1 + 3   |    3
		             |         |     2 + 2   |    2
		    -----------------------------------------
		        8    |     5   |     1 + 4   |    5
		             |         |     2 + 3   |    3   
		 */
		int pre = 1;
		int result = 2;
		
		for( int i = 2; i < n ; i++ ) {
			int newValue = pre + result;
			
			pre = result;
			result = newValue;
		}
		
		return result;
		
	}
}
