package com.peter12.solution.medium;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import com.peter12.solution.util.Util;

public class MEDIUM_0039_COMBINATION_SUM {
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {

		/*
		 * Solution: https://www.geeksforgeeks.org/combinational-sum/
		 * candidate = [ 2, 4, 6 ,8] x = 8
		 * 
		 * 
		 *      Index |  Self    | Others
		     8 =  0   |         2 + 6
		       =  0   |         2 + 2 + 4
		       =  0   |         2 + 2 + 2 + 2
		       =  1   |         4 + 4
		       =  3   |           + 8
		 * */

		Arrays.sort(candidates);

		List<List<Integer>> result = new Vector<List<Integer>>();

		combinationSum(target, 0, candidates, null, result);


		return result;
	}

	public static void combinationSum(int target, int index, int[] candidates, 
			List<Integer> r,
			List<List<Integer>> result) {
		
		if( target == 0 ) {
			Util.outputResult(true, r, result );
			return;
		}

		if( target < 0 ) {
			result.remove( result.size() - 1);//Remove the last elements
			return;
		}

		if( r == null ) {
			r = new Vector<Integer>();
		}
		
		for( int i = index; i < candidates.length; i++ ) {
			int val = candidates[i];
			
			if( target >= val) {
				r.add(val); // try to add val which is less than target
				combinationSum(target - val, i, candidates, r, result);
				r.remove( r.size() - 1 );// remove it for another candidates
			}
			
			

		}
	}
	
}
