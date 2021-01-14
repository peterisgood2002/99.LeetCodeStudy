package com.peter12.solution.easy;

import java.util.HashMap;

public class EASY_0136_SINGLE_NUMBER {
	public static int singleNumber(int[] nums) {
		
		
		HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
		
	
		for( int i = 0; i < nums.length; i++ ) {
			Integer c = count.remove( nums[i] );
			if( c == null ) {
				count.put( nums[i], nums[i]);
			}
		}
		int result = 0;
		
		if( count.size() > 0 ) {
			for( Integer r: count.keySet()) {
				return r;
			}
		}
		return result;
	}
}
