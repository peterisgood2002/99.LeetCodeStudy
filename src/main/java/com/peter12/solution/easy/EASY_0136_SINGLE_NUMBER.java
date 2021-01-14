package com.peter12.solution.easy;

import java.util.HashMap;

public class EASY_0136_SINGLE_NUMBER {
	public static int singleNumber(int[] nums) {
		
		/*
		 * Solution: Bit Manipulation A XOR 0 = A
		 * A XOR B XOR A = A XOR A XOR B = 0 XOR B = b
		 * */
		
		int result = 0;
		for(int i : nums ) {
			result ^= i ;
		}
		
		return result;
	}
}
