package com.peter12.solution.easy;

public class EASY_0191_NUMBER_OF_1_BITS {
	public static int hammingWeight(int n) {
		int result = 0;
		int move = 31;
		
		do {
			result += n & 1;
			 n = n >> 1;
			move --;
		} while( move >= 0);
		
		return result;
	}
}
