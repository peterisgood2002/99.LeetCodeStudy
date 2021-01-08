package com.peter12.solution.easy;

public class EASY_0035_SEARCH_INSERT_POSITION {
	public static int searchInsert(int[] nums, int target) {
		
		int pre = 0;
		for( int i = 0; i < nums.length; i++ ) {
			
			if( nums[i] == target) {
				return  i;
			} else if( nums[i] > target){
				pre =  i;
				break;
				
			} else  {
				if( i == nums.length - 1 ) {
					pre = i + 1;
				}
			}
		}
		
		return pre;
	}
}
