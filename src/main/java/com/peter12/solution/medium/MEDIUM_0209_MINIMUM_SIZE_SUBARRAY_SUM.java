package com.peter12.solution.medium;

public class MEDIUM_0209_MINIMUM_SIZE_SUBARRAY_SUM {
	public int minSubArrayLen(int target, int[] nums) {

		/*
         NUMS[j] - NUMS[i] >= target
		 */

		int result = Integer.MAX_VALUE;

		int i = 0;
		int total = 0;
		for( int j = 0; j < nums.length; j++  ) {

			total += nums[j];

			while( i <= j && total >= target ) {
				//Move to another windows that the sum between i and j is less than target
				//System.out.println( " i = " + i + " j = " + j + " total = " + total);
				result = Math.min( result, j - i + 1);

				total -= nums[i];
				i++;
			} 
		}

		if( result == Integer.MAX_VALUE) {
			return 0;
		} else {
			return result;
		}

	}
}
