package com.peter12.solution.easy;

public class EASY_0053_MAXIMUM_SUBARRAY {
	/*
	 * We gave up this hurdle and find out the solution on the Internet.
	 * We implemented Kadane¡¦s Algorithm
	 * Link: https://tinyurl.com/yyrszsm8
	 * */
	public static int maxSubArray(int[] nums) {
		
		
		//local_max[i] = Max(nums[i], nums[i] + local_max[i-1])
		int[] localMax = new int[ nums.length ];
		localMax[0] = nums[0];
		for( int i = 1; i < nums.length; i++ ) {
			
			if( nums[i] > nums[i] + localMax[i-1] ) {
				localMax[i] = nums[i];
			} else {
				localMax[i] = nums[i] + localMax[i-1];
			}
		}
		
		int result = Integer.MIN_VALUE;
		for( int i = 0; i < localMax.length; i++ ) {
			if( result < localMax[i]) {
				result = localMax[i];
			}
		}
		
		return result;
		
	}
	
	
}
