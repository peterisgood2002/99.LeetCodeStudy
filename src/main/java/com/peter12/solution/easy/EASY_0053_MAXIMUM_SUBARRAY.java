package com.peter12.solution.easy;

public class EASY_0053_MAXIMUM_SUBARRAY {
	public static int maxSubArray(int[] nums) {
		int size = nums.length;

		if( size == 1 ) {
			return nums[0];
		}
		int result = Integer.MIN_VALUE;
		for( int i = 1; i <= size; i++ ) {
			
			int total = findMax(nums, i);
			
			if( result < total ) {
				result = total;
			}
		}

		return result;
	}

	public static int findMax(int[] nums, int size) {

		int result = Integer.MIN_VALUE;
		for ( int i = 0; i <= nums.length - size; i++ ) {

			int total = 0;
			for( int j = 0; j < size; j++ ) {
				total += nums[i + j];
			}

			if( result < total ) {
				result = total;
			}
		}

		return result;

	}
}
