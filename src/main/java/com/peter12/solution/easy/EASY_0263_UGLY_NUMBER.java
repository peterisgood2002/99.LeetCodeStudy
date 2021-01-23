package com.peter12.solution.easy;

public class EASY_0263_UGLY_NUMBER {
	public static boolean isUgly(int num) {
		
		if( num == 0 ) {
			 return false;
		}
		
		
		int result = removePrimeFactors(num, 2);
		result = removePrimeFactors(result, 3);
		result = removePrimeFactors(result, 5);
		
		return result == 1;
				
	}
	
	public static int removePrimeFactors( int num, int prime) {
		int result = num;
		
		while( result % prime == 0 ) {
			result /= prime;
		}
		
		return result;
	}
}
