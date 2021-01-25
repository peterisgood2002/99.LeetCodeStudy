package com.peter12.solution.easy;

public class EASY_0485_MAX_CONSECUTIVE_ONES {
	public static int findMaxConsecutiveOnes(int[] nums) {

		int result = 0;
		
		int begin1 = 0;
	
		for( int i = 0; i < nums.length; i++ ) {
			if( nums[i] == 0 ) {
				//This is the end of consecutive 1s
				int size = i - begin1;
				if( result < size) {
					result = size;
				}
				
				begin1 = i + 1;
				
			}
			
			if( i == nums.length - 1 ) {
				//always 1s from nums[begin1] to nums[size - 1] 
				int size = nums.length - begin1;
				if( result < size) {
					result = size;
				}
			}
			
			
		}
		
		return result;
	}
}
