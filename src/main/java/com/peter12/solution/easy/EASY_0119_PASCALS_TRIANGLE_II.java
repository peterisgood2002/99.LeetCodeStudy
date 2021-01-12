package com.peter12.solution.easy;

import java.util.List;
import java.util.Vector;

public class EASY_0119_PASCALS_TRIANGLE_II {
	public static List<Integer> getRow(int rowIndex) {

		List<Integer> result = new Vector<Integer>();
	
		for( int i = 0; i < rowIndex + 1; i++ ) {
			int c = (int)Math.round( C(rowIndex, i) );
			
			result.add(c);
		}
		return result;
	}

	public static double C(int m, int n ) {
		if( n == 0 ) {
			return 1;
		}
		
		double numerator = 1;
		for( int i = m; i > m - n; i-- ) {
			numerator *= i;
		}

		double denominator = 1;
		for( int i = 1; i <= n; i++ ) {
			denominator *= i;
		}

		return numerator / denominator;
	}
}
