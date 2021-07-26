package com.peter12.solution.medium;

public class MEDIUM_1004_MAX_CONSECUTIVE_ONES_III {
	public int longestOnes(int[] nums, int k) {

		/*
         Solution: https://www.youtube.com/watch?v=7MK0GCSBoLg
		 */

		int l = 0, r = 0;

		while( r < nums.length ) {

			if( nums[r] == 0 ) {
				k--;//We flip 0 to 1
			}

			if( k < 0 ) {
				/*
                We need to move left because k < 0 and this windows is not the answer 
                But if nums[left] == 0, we need to restore k
				 */

				if( nums[l] == 0 ) {
					k++;
				}

				l++;
			}

			r++;
		} 

		return r - l;
	}
}
