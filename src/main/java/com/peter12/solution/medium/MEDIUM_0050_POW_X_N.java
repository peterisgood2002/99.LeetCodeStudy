package com.peter12.solution.medium;

public class MEDIUM_0050_POW_X_N {
	public static double myPow(double x, int n) {
		/*
		 * Solution: https://www.geeksforgeeks.org/write-a-c-program-to-calculate-powxn/
		 * */
		
		boolean reciprocal =  n < 0;
		
		if( reciprocal ) {
			n = -n;
		}
		
		
		double result = myPowImpl(x, n);
		//Rounding
		
		if( reciprocal ) {
			result =   1/ result;
			
		} 
			
		
		return Math.floor( result * 100000) / 100000;
		
	}
	
	public static double myPowImpl( double x, int n ) {
		if( n == 0 ) {
			return 1.0;
		}
		
		double half = myPowImpl(x, n / 2 );
		if( n % 2 == 0 ) {
			return  half * half; 
		} else {
			return  x * half * half;
		}
	}
}
