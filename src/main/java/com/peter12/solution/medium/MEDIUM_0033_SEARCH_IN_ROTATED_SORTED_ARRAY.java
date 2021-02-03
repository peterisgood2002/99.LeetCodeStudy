package com.peter12.solution.medium;

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
		
		
		//Binary Search
		int begin = 0;
		int end = nums.length - 1;
		
		while( begin <= end ) {
			double m = ( begin + end ) / 2 ;
			int middle = (int) m ;
			
			int pm = (middle + pivot) % nums.length;
			
			if( nums[pm] == target ) {
				return pm;
			}
			
			if( nums[pm] > target  ) {
				end = middle - 1;
				
			}
			
			if( nums[pm] < target ) {
				begin = middle + 1 ;
			
			}
		}
		
		return -1; //No found
	} 
}
