package com.peter12.solution.easy;

public class EASY_0283_MOVE_ZEROES {
	public static void moveZeroes(int[] nums) {
		
		int zeroIndex = 0;
		int totalZero = 0;
		boolean meetZero = false;
		for( int i = 0; i < nums.length; i++) {
			if( nums[i] != 0 ) {
				//1. Swap nums[i] and nums[zeroIndex]
				nums[zeroIndex] = nums[i];
				nums[i] = 0;
				
				//2. Incremental zeroIndex
				zeroIndex++;
			}
			
			if( nums[i] == 0 && meetZero == false) {
				zeroIndex = i;
				meetZero = true;
			}
		}
	}
}
