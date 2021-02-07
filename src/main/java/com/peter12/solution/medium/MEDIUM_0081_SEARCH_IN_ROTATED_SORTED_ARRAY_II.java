package com.peter12.solution.medium;

import com.peter12.solution.util.Util;

public class MEDIUM_0081_SEARCH_IN_ROTATED_SORTED_ARRAY_II {
	public static boolean search(int[] nums, int target) {

		//Find Pivot
		int pivot = 0;
		int min = Integer.MAX_VALUE;
		for( int i = 0; i < nums.length; i++) {
			if( min > nums[i] ) {
				min = nums[i];
				pivot = i;
			}
		}

		int minCount = 0;
		for( int i = 0; i < nums.length; i++ ) {
			if( min == nums[i] ) {
				minCount++;
			}
		}
		
		while( minCount >= 1 ) {
			minCount--;
			int i = Util.search(nums, target, pivot + minCount);
			if( i > 0 ) {
				return true;
			}
			
			
		} 

		return false;
	}
}
