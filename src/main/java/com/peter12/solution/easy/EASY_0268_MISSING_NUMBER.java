package com.peter12.solution.easy;

public class EASY_0268_MISSING_NUMBER {
	public static int missingNumber(int[] nums) {
		int size = nums.length;
		int total = 0;
		for( int i = 0; i <= size; i++ ) {
			total += i;
		}
		
		for(int n: nums) {
			total -= n;
		}
		
		return total;
	}
}
