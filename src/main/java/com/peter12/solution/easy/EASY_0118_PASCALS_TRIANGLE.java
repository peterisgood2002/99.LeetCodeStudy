package com.peter12.solution.easy;

import java.util.List;
import java.util.Vector;

public class EASY_0118_PASCALS_TRIANGLE {
	public static List<List<Integer>> generate(int numRows) {

		List<List<Integer>> result = new Vector<List<Integer>>();
		
		//Default
		if(numRows == 0 ) {
			return result;
		}
		if(numRows >= 1 ) {
			List<Integer> d = new Vector<Integer>();
			d.add(1);
			result.add(d);
		}
		
		if( numRows >=2 ) {
			List<Integer> d = new Vector<Integer>();
			d.add(1);
			d.add(1);
			result.add(d);
		}
		
		
		
		for( int i = 2; i < numRows; i++ ) {
			List<Integer> r =  new Vector<Integer>();
			
			r.add(1);
			
			List<Integer> lastLevel = result.get( i - 1);
			for(int j = 0; j < lastLevel.size() - 1; j++ ) {
				r.add( lastLevel.get(j) + lastLevel.get(j+1) );
			}
			
			
			
			r.add(1);
			
			result.add(r);
			
			
		}
		
		
		return result;
	}
}
