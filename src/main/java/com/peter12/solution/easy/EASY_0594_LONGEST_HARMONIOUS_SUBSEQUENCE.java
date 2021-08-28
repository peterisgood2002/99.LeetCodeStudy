package com.peter12.solution.easy;

import java.util.Arrays;

public class EASY_0594_LONGEST_HARMONIOUS_SUBSEQUENCE {
	public int findLHS(int[] nums) {

		/*
          Solution: https://www.cnblogs.com/grandyang/p/6896799.html
		 */
		Arrays.sort( nums );

		int result = 0;
		int i = 0;
		for( int j = 1; j < nums.length; j++ ) {
			if( nums[j] - nums[i] > 1 ) {
				i++;
			}

			if( nums[j] - nums[i] == 1 ) {
				result = Math.max( result, j - i + 1 );
			}
		}


		return result;

	}
}
