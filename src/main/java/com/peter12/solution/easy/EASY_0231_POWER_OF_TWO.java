package com.peter12.solution.easy;

public class EASY_0231_POWER_OF_TWO {
	public static boolean isPowerOfTwo(int n) {
       
		if( n < 0 ) {
			return false;
		}
		
		int count = 0;
		int i = 0;
		while( n > 0  || i++ < 31) {
			count += n & 1;
			n = n >> 1;
		}
		
		return count == 1;
		
    }
}
