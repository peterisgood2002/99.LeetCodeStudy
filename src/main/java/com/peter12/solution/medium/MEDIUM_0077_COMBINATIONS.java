package com.peter12.solution.medium;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.util.Util;

public class MEDIUM_0077_COMBINATIONS {
	public static List<List<Integer>> combine(int n, int k) {
		
		List<List<Integer>> result = new Vector<List<Integer>>();
		
		combine(n, k, null, result);
		
		return result;
	}
	
	public static void combine( int n , int k, List<Integer> r, List<List<Integer>> result ) {
		
		if( k == 0 ) {
			Util.outputResult(true, r, result);
			
			return;
		}
		
		if( r == null ) {
			r = new Vector<Integer>();	
		}
		
		for( int i = n; i >= 1; i-- ) {
			r.add(i);
			
			combine( i - 1, k - 1, r, result);
			
			r.remove( r.size() - 1);
		}
		
	}
}
