package com.peter12.solution.medium;

public class MEDIUM_0162_FIND_PEAK_ELEMENT {
	public int findPeakElement(int[] nums) {

		/* Solution: https://leetcode.com/problems/find-peak-element/*/
		if( nums.length == 1 ) {
			return 0;
		}

		int begin = 0;
		int end = nums.length - 1;

		while( begin < end ) {

			int middle = ( begin + end ) / 2;


			if( nums[middle] < nums[middle + 1] ) {
				begin = middle + 1;
			} else {
				end = middle;
			}
		}

		return begin;
	}
}
