package com.peter12.solution.easy;

public class EASY_0506_RELATIVE_RANKS {
	public static String[] findRelativeRanks(int[] nums) {
		int[] rank = new int[nums.length];
	
		for( int i = 0; i < nums.length; i++ ) {
			for( int j = 0; j < nums.length; j++ ) {
				if( nums[i] >= nums[j] ) {
					rank[j]++;
				}
			}
		}
		
		String[] result = new String[rank.length];
		for( int i = 0; i < rank.length; i++ ) {
			if( rank[i] == 1 ) {
				result[i] = "Gold Medal";
			} else if ( rank[i] == 2 ) {
				result[i] = "Silver Medal";
			} else if ( rank[i] == 3 ) {
				result[i] = "Bronze Medal";
			} else {
				result[i] = String.valueOf( rank[i]);
			}
		}
		return result;
	}
}
