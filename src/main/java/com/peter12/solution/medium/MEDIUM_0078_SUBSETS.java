package com.peter12.solution.medium;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.util.Util;

public class MEDIUM_0078_SUBSETS {
	public static List<List<Integer>> subsets(int[] nums) {

		List<List<Integer>> result = new Vector<List<Integer>>();
		
		result.add( new Vector<Integer>() );
		
		subsets(0, nums, null, result);
		return result;
	}
	
	public static void subsets( int begin, int[] nums, List<Integer> r, List<List<Integer>> result ) {
		if( begin >= nums.length ) {
			
			Util.outputResult(false, r, result);
			return;
		}
		
		if( r == null ) {
			 r = new Vector<Integer>();
		}
		
		//include himself
		r.add( nums[begin]);
		subsets( begin + 1, nums, r, result);
		
		r.remove( r.size() - 1);
		
		//Withour himself
		subsets( begin + 1, nums, r, result);
		
		
	}
}
