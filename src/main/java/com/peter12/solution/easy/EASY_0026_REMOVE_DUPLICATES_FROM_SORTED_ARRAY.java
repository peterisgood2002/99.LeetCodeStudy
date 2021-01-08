package com.peter12.solution.easy;

public class EASY_0026_REMOVE_DUPLICATES_FROM_SORTED_ARRAY {

	public static int removeDuplicates(int[] nums) {
		if( nums == null || nums.length == 0 ) {
			return 0;
		}
		
		
		int pre = nums[0];
		int j = 1;
		for( int i = 1; i < nums.length; i++ ) {
			
			if(pre != nums[i] ) {
				pre = nums[i];
				nums[j] = nums[i];
				j++;
			} 
			
		}
		
		
		for(int i = j; i < nums.length; i++ ) {
			nums[i] = 0;
		}
		return j;
	}
}
