package com.peter12.solution.medium;

public class MEDIUM_0152_MAXIMUM_PRODUCT_SUBARRAY {
	public int maxProduct(int[] nums) {
		/*
        Solution: https://www.youtube.com/watch?v=lXVy6YWFcRM
		 */

		int max = nums[0];
		int min = nums[0];
		int result = nums[0];

		for(int i = 1; i < nums.length; i++) {

			int tM = max, tm = min;
			max = Math.max(  Math.max( tM *nums[i], tm * nums[i] ), nums[i] );
			min = Math.min(  Math.min( tM *nums[i], tm * nums[i] ), nums[i] );

			result = Math.max( result, max);

		}        

		return result;

	}

	public int bruteForce( int[] nums ) {
		int result = Integer.MIN_VALUE;
		for( int i = 0; i < nums.length; i++ ) {
			int product = 1;
			for( int j = i ; j < nums.length; j++ ) {
				product *= nums[j];

				if( result < product ) {
					result = product;
				}
			}
		}

		return result;
	}

}
