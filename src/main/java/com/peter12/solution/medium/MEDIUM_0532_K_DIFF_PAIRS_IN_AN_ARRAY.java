package com.peter12.solution.medium;

import java.util.HashMap;

public class MEDIUM_0532_K_DIFF_PAIRS_IN_AN_ARRAY {
	public int findPairs(int[] nums, int k) {

		/*
        Solution: https://www.youtube.com/watch?v=r3oiTXIINOU
		 */
		HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
		for( int n : nums ) {
			Integer c = count.get(n);

			if( c == null ) {
				c = 0;
			}

			c++;
			count.put(n, c);
		}

		int result = 0;
		if( k == 0 ) {
			for( HashMap.Entry<Integer, Integer> e : count.entrySet() ) {
				int c = e.getValue();

				if( c >= 2 ) {
					result++;
				}
			}

		} else {
			/* a - b = k
             a = b + k
			 */
			for( int b : count.keySet() ) {
				Integer a = count.get( b + k );
				if( a != null ) {

					result++;
				}
			}
		}

		return result;
	}
}
