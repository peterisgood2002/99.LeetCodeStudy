package com.peter12.solution.medium;

import com.peter12.solution.util.Util;

public class MEDIUM_0033_SEARCH_IN_ROTATED_SORTED_ARRAY {
	public static int search(int[] nums, int target) {
		
		//Find Pivot
		int pivot = 0;
		int min = Integer.MAX_VALUE;
		for( int i = 0; i < nums.length; i++) {
			if( min > nums[i] ) {
				min = nums[i];
				pivot = i;
			}
		}
		
		
		return Util.search(nums, target, pivot);
	} 
}
