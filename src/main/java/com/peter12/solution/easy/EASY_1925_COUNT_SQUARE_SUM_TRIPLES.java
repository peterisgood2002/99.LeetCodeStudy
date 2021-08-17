package com.peter12.solution.easy;

import java.util.HashSet;

public class EASY_1925_COUNT_SQUARE_SUM_TRIPLES {
	public int countTriples(int n) {

		int result = 0;
		for( int c = 1; c <= n; c++ ) {
			HashSet<Integer> a = new HashSet<Integer>();

			for( int b = 1; b <= n ; b++ ) {
				if( a.contains( b * b ) ) {
					result += 2;
				} 

				a.add( c * c - b * b);
			}
		}
		
		return result;
	}
}
