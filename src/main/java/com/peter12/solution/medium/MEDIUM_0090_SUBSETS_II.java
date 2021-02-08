package com.peter12.solution.medium;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import com.peter12.solution.util.Util;

public class MEDIUM_0090_SUBSETS_II {
	public static List<List<Integer>> subsetsWithDup(int[] nums) {

		/*
		 * Solution: https://zxi.mytechroad.com/blog/searching/leetcode-90-subsets-ii/
		 * INDEX 0 1 2 3 4
		 * VALUE 1 2 2 4 4
		 * 
		 * We have 5 seat
		 * We take one value into the seat. 
		 * */

		int size = nums.length;
		Arrays.sort(nums);// The purpose is to bring the count of number into life
		List<List<Integer>> result = new Vector<List<Integer>>();
		
		result.add( new Vector<Integer>() );
		subsetsWithDup(0, nums, null, result);

		return result;
	}

	public static void subsetsWithDup(int depth, int[] nums,List<Integer> r, List<List<Integer>> result) {

		if( r == null ) {
			r = new Vector<Integer>() ;
		}

		Util.outputResult(false, r, result);
		
		if( r.size() == nums.length ) {

			return;
		}
		
		

		/*
		 * INDEX 0 1 2 3 4
		 * VALUE 1 2 2 4 4
		 * Depth | INDEX | VALUE |
		 *   0   |   0   |   1   | Depth = 1
		 *   0   |   1   |   2   | Depth = 2
		 *   0   |   3   |   4   | Depth = 4
		 *   1   |   1   |   2   | Depth = 2
		 *   1   |   3   |   4   | Depth = 4
		 *   2   |   2   |   2   | Depth = 3
		 *   2   |   3   |   4   | Depth = 4
		 *   3   |   3   |   4   | Depth = 4
		 *   4   |   4   |   4   | Depth = 5
		 
		
		 * */
		for( int i = depth ; i < nums.length; i++ ) {

			if( i > depth && nums[i] == nums[i-1] ) {
				//Prevent from the duplicate
				continue;
			}

			r.add(nums[i]);
			subsetsWithDup( i + 1, nums, r, result);

			r.remove( r.size() - 1);

		}
	}


}
