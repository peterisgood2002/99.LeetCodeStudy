package com.peter12.solution.medium;

import com.peter12.solution.util.Util;

public class MEDIUM_0081_SEARCH_IN_ROTATED_SORTED_ARRAY_II {
	public static boolean search(int[] nums, int target) {

		if( nums[0] == target) {
			return true;
		}
		/*
		 * Solution: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/solution/
		 * 
		 *   F  |  S
		 * 4 5 6 1 2 3
		 * */
		
		int begin = 0;
		int end = nums.length - 1;
		
		
		while( begin <= end ) {
			double m = ( begin + end ) / 2;
			int middle = ( int ) m;
			
			if( nums[middle] == target ) {
				return true;
			}
			
			if( nums[begin] == nums[middle] ) {
				/*
				 * there is a catch, if arr[mid] equals arr[start], 
				 * then we know that arr[mid] might belong to both F and S 
				 * and hence we cannot find the relative position of target from it.
				 * */
				begin++;
				continue;
			}
			
			boolean targetInFirstArray = ( nums[begin] <= target);
			boolean middleInFirstArray = ( nums[begin] <= nums[middle] );
			
			if( middleInFirstArray == true && targetInFirstArray == false ) {
				/**
				 * Case 1: arr[mid] lies in F, target lies in S: 
				 * Since S starts after F ends, we know that element lies here:(mid, end].
				 */
				begin = middle + 1;
			} else if( middleInFirstArray == false && targetInFirstArray == true){
				/*
				 * Case 2: arr[mid] lies in the S, target lies in F: 
				 * Similarly, we know that element lies here: [start, mid).
				 */
				end = middle - 1;
			} else  {
				//Case 3 middle and target are in the same array
				if( nums[middle] > target ) {
					end = middle - 1;
				} else {
					begin = middle + 1;
				}
			}
			
		} 
		
		return false;
		
	}
}
