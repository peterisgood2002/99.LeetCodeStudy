package com.peter12.solution.easy;

public class EASY_0461_HAMMING_DISTANCE {
	public static int hammingDistance(int x, int y) {
		
		int xXORy = x ^ y;
		
		int result = 0;
		int move = 0;
		do {
			result +=  xXORy & 1;
			xXORy >>= 1;
			
		} while( ++move < 31);
		
		return result;
	}
}
