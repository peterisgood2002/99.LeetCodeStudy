package com.peter12.solution.easy;

import java.util.HashMap;
import java.util.List;
import java.util.Vector;

public class EASY_0217_CONTAINS_DUPLICATE {
	public static boolean containsDuplicate(int[] nums) {
		
		HashMap<Integer, Integer>  count = new HashMap<Integer, Integer>();
		
		for( int i = 0; i < nums.length; i++ ) {
			
			Integer c = count.get( nums[i] );
			if( c != null ) {
				return true;
			}

			count.put( nums[i], 1);
		}
		
		return false;
	}
}
