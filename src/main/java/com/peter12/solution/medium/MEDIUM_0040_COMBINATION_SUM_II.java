package com.peter12.solution.medium;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import com.peter12.solution.util.Util;

public class MEDIUM_0040_COMBINATION_SUM_II {
	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		
		Arrays.sort(candidates);
		
		List<List<Integer>> result = new Vector<List<Integer>>();
		
		combinationSum2(target, 0, candidates, null, result);
		
		return result;
	}
	
	public static void combinationSum2(int target, int begin, int[] candidates, 
			List<Integer> r, List<List<Integer>> result )  {
		
		if( target == 0 ) {
			Util.outputResult(false, r, result );
			
			return;
		}
		
		if( target < 0 ) {
			return;
		}
		
		if( r == null ) {
			r = new Vector<Integer>();
		}
		
		for( int i = begin; i < candidates.length; i++ ) {
			int val = candidates[i];
			
			if( val <= target ) {
				if( val == 5 ) {
					int test = 0;
				}
				
				r.add(val);
				combinationSum2(target - val, i + 1, candidates, r, result);
				
				r.remove( r.size() - 1);
			}
		}
		
	}
	
}
