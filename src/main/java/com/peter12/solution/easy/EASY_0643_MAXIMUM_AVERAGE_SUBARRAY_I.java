package com.peter12.solution.easy;

public class EASY_0643_MAXIMUM_AVERAGE_SUBARRAY_I {
	public double findMaxAverage(int[] nums, int k) {

		double result = Integer.MIN_VALUE;
		int i = 0, j = 0;
		double total = 0;
		while( j < k ) {
			total += nums[j];
			j++;
		}

		result = total / k;

		while( j < nums.length ) {

			total -= nums[i++];
			total += nums[j++];

			result = Math.max( result, total / k );

		}

		return result;
	}
}
