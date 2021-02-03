package com.peter12.solution.medium;

public class MEDIUM_0029_DIVIDE_TWO_INTEGERS {
	public static int divide(int dividend, int divisor) {
		if( divisor == 0 ) {
			return Integer.MAX_VALUE;
		}
		
		
		boolean negative = ( dividend < 0 ^ divisor < 0);
		/*
		 * Solution: https://www.geeksforgeeks.org/divide-two-integers-without-using-multiplication-division-mod-operator/
		 * As every number can be represented in base 2(0 or 1), represent the quotient in binary form by using shift operator as given below 
		 * 
		 *  3 * 1 = 3  < 10
		 *  3 * 2 = 6  < 10 ==> 10 - 6 = 4
		 *  3 * 4 = 12 > 10
		 *  
		 *  3 * 1 = 3  < 4  ==> 4 - 3 = 1
		 *  3 * 2 = 6  > 4
		 * 
		 * */
		
		long numerator = dividend;
		if( numerator < 0 ) {
			numerator = - numerator;
		}
		long denominator =  divisor;
		if( denominator < 0 ) {
			denominator = - denominator;
		}
		
		
		long quotient = 0;
		
		for( int move = 31; move >= 0; move-- ) {
			
			if( move == 0 ) {
				int test =  0;
			}
			
			long tmp = numerator >> move;
			if( tmp >= denominator ) {
				quotient += 1L << move;
				
				numerator -= denominator << move;
				
			}
			
		}
		
		
		if( negative ) {
			quotient = - quotient;
		}
		
		if( quotient > Integer.MAX_VALUE) {
			quotient = Integer.MAX_VALUE;
		}
		
		if( quotient <Integer.MIN_VALUE ) {
			quotient = Integer.MIN_VALUE;
		}
		int result =  (int) quotient;
		
		return result;
		
	}

}
