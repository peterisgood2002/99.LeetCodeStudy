package com.peter12.solution.easy;

public class EASY_0219_CONTAINS_DUPLICATE_II {
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		int turtle = 0;
		int rabbit = 0;
		
		
		do {
			turtle = ( turtle + 1 ) % nums.length;
			rabbit = ( rabbit + 2 ) % nums.length;
		} while( nums[turtle] != nums[rabbit]);
		
		
		for( int i = turtle + 1; i < nums.length; i++ ) {
			if( nums[turtle] == nums[i] ) {
				int length = i - turtle;
				return length == k;
			}
		}
		
		return false;
	}
}
