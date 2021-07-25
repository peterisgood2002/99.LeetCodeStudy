package com.peter12.solution.medium;

public class MEDIUM_0713_SUBARRAY_PRODUCT_LESS_THAN_K {
	public int numSubarrayProductLessThanK(int[] nums, int k) {
		/*
          Solution: https://www.youtube.com/watch?v=o8OCmqYFEok

          Sliding Windows
		 */

		if( k <= 1) {
			return 0;
		}

		int result = 0;

		int i = 0;
		int prod = 1;

		for( int j = 0; j < nums.length; j++ ) {
			prod *= nums[j];

			while( prod >= k) {
				prod /= nums[i++];
			}

			/*
                [a, b, c]
                SubArray:  [c] [b, c] [a, b, c]

			 */

			result += j - i + 1;

		}

		return result;

	}
}
