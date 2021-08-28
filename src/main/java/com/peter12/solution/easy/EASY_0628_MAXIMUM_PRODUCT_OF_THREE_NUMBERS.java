package com.peter12.solution.easy;

public class EASY_0628_MAXIMUM_PRODUCT_OF_THREE_NUMBERS {
	public int maximumProduct(int[] nums) {

		/*
          https://leetcode.com/problems/maximum-product-of-three-numbers/solution/
		 */

		int[] min = new int[] {Integer.MAX_VALUE, Integer.MAX_VALUE};
		int[] max = new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};

		for( int n : nums ) {
			if( n < min[0] ) {
				min[1] = min[0];
				min[0] = n;
			} else if ( n < min[1] ) {
				min[1] = n;
			}

			if( n > max[0] ) {
				max[2] = max[1];
				max[1] = max[0];
				max[0] = n;
			} else if ( n > max[1] ) {
				max[2] = max[1];
				max[1] = n;
			} else if( n > max[2] ) {
				max[2] = n;
			}
		}


		return Math.max( min[0] * min[1] * max[0], max[0] * max[1] * max[2] );
	}
}
