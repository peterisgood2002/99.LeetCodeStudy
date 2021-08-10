package com.peter12.solution.medium;

public class MEDIUM_0152_MAXIMUM_PRODUCT_SUBARRAY {
	public int maxProduct(int[] nums) {

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
