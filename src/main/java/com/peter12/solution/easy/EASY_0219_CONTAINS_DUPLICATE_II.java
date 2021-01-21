package com.peter12.solution.easy;

import java.util.HashMap;

public class EASY_0219_CONTAINS_DUPLICATE_II {
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		/*
		 * Solution:
		 * https://www.programcreek.com/2014/05/leetcode-contains-duplicate-ii-java/
		 * */
		
		if( nums.length == 0 ) {
			return false;
		}
		
		HashMap<Integer, Integer> index = new HashMap<Integer, Integer>();
		for( int i = 0; i < nums.length; i++ ) {
			Integer val = index.get( nums[i] );
			
			if( val != null ) {
				if( i - val <= k ) {
					return true;
				};
			}
			
			index.put( nums[i],  i);
		}
		
		return false;
	}
}
