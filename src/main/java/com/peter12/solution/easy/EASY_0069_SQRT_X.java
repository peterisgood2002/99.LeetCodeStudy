package com.peter12.solution.easy;

public class EASY_0069_SQRT_X {
	public static int mySqrt(int x) {
		
		double start = 0;
		double end = x;
		int result = 0;
		while ( start <= end ) {
			double middle = (int) (start + end ) / 2;

			if( middle * middle <= x ) {
				start = middle + 1;
				result = (int)middle;
			} else {
				end = middle - 1;
			}
		}
		
		return result;
	}
	
	
}
