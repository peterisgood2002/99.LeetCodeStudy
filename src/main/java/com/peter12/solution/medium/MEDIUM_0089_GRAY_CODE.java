package com.peter12.solution.medium;

import java.util.List;
import java.util.Vector;

public class MEDIUM_0089_GRAY_CODE {
	public static List<Integer> grayCode(int n) {
		/*
		 *  n = 1
		 *  0
		 *  1
		 *  n = 2
		 *  0 0-----| 0+(n = 1)[0]
		 *  0 1-----| 0+(n = 1)[1]
		 *  1 1-----| 1+(n = 1)[1]
		 *  1 0-----| 1+(n = 1)[0]
		 *  n = 3
		 *  0 0 0---| 0+(n = 2)[0]
		 *  0 0 1---|
		 *  0 1 1---|
		 *  0 1 0---|
		 *  1 1 0---| 1+(n = 2)[3]
		 *  1 1 1---|
		 *  1 0 1---|
		 *  1 0 0---|
		 * */
		List<Integer> result = new Vector<Integer>();
		if( n == 1 ) {
			result.add(0);
			result.add(1);
			
			return result;
		}
		
		result.addAll( grayCode(n - 1) );
		
		int pow = (int)Math.pow(2, n - 1);
		for( int i = result.size() - 1; i >= 0; i-- ) {
			int val = result.get(i);
			result.add( pow + val );
		}
		
		return result;
	}
}
