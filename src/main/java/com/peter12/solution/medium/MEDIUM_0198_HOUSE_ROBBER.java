package com.peter12.solution.medium;

public class MEDIUM_0198_HOUSE_ROBBER {
	public int rob(int[] nums) {

		/*
          R[i] = Max( R[i-1], Max(R[j-2] + nums[i]) )
		 */

		if( nums.length == 1 ) {
			return nums[0];
		}

		if( nums.length == 2 ) {
			return Math.max( nums[0], nums[1] );
		}

		int[] result = new int[nums.length];
		result[0] = nums[0];
		result[1] = nums[1];
		for( int i = 2; i < nums.length; i++ ) {

			int max = 0;
			for( int j = i - 2; j >= 0; j-- ) {
				max = Math.max( max, result[j] + nums[i] );
			}

			result[i] = Math.max( result[i-1], max);
		}

		return result[ nums.length - 1];
	}
}
