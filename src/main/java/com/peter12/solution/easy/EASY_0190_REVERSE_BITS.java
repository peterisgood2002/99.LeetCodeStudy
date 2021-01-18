package com.peter12.solution.easy;

public class EASY_0190_REVERSE_BITS {
	public static int reverseBits(int n) {
		
		int result = 0;
		int pow = 31;
		while( n > 0 ) {
			result +=( n & 1) << pow;
			 n = n >> 1;
			pow -= 1;
		}
		
		return result;
	}
}
