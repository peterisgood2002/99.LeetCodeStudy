package com.peter12.solution.medium;

import java.util.Arrays;

public class MEDIUM_0016_3SUM_CLOSEST {
	public static int threeSumClosest(int[] nums, int target) {
		
		Arrays.sort(nums);
		
		int diff = Integer.MAX_VALUE;
		int result = 0;
		for( int i = 0; i < nums.length - 2; i++ ) {
			int j = i + 1;
			int k = nums.length - 1;
			
			while( j < k ) {
				int total = nums[i] + nums[j] + nums[k];
				
				int absTotal = Math.abs( total - target);
				int absDiff = Math.abs(diff);
				
				if( absTotal <  absDiff) {
					result = total;
					diff = total - target;
				}
				
				if( total - target >= 0 ) {
					k--;
				}
				
				if( total - target < 0 ) {
					j++;
				}
				
				
				
			}
			
			
		}
		
		return result;
	}
}
