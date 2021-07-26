package com.peter12.solution.medium;

public class MEDIUM_0153_FIND_MINIMUM_IN_ROTATED_SORTED_ARRAY {
	public int findMin(int[] nums) {

		/*
          Solution: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/solution/
		 */
		if( nums.length == 1 ) {
			return nums[0];
		}

		int begin = 0;
		int end = nums.length - 1;

		if( nums[begin] < nums[end] ) {
			// No rotate
			return nums[begin];
		}

		while( begin <= end ) {

			//Has Rotate
			int middle = ( begin + end ) / 2;

			
			if( nums[middle] > nums[middle + 1] ) {
				//7 2 
				// Find the minimum, we choose nums[middle] < nums[middle+1] 
				return nums[middle+1];
			}

			if( nums[middle - 1 ] > nums[middle] ) {
				return nums[middle];
			}

			if( nums[0] < nums[middle ] ) {
				/*3 4 5 1 2 ==> the minimum is between middle + 1 and end*/
				begin = middle + 1;
			} else  {
				/*5 1 2 3 4 ==> the minimum is between begin and middle - 1*/
				end = middle - 1;
			}

		}

		return -1;

	}
}
