package com.peter12.solution.medium;

public class MEDIUM_0062_UNIQUE_PATHS {
	public static int uniquePaths(int m, int n) {
		/*
		 * This is permutation problem  which arrange (m-1) D and (n-1) R
		 * 3 * 7 has 2 D 6 R
		 * 
		 * The result is C(8,2)
		 */
		
		double total = (m - 1) + (n - 1);
		
		//C(total, nD))
		double nD = ( m > n) ? n - 1: m - 1;
		
		double result = 1;
		for( int i = 0; i < nD; i++ ) {
			result *= ( total--);
		}
		
		int denominator = 1; 
		for( int i = 1; i <= nD; i++ ) {
			denominator *= i;
		}
		
		result /= denominator;
		
		return (int)result;
	}
}
