package com.peter12.solution.easy;

import java.util.ArrayList;
import java.util.List;

public class EASY_0696_COUNT_BINARY_SUBSTRINGS {
	public int countBinarySubstrings(String s) {

		/*
        Solution: https://leetcode.com/problems/count-binary-substrings/solution/
        001110011
         2  3 2 2
        Note that 0011 has two answer 0011 and 01
		 */

		List<Integer> group = new ArrayList<Integer>();
		int count = 1;
		for( int i = 1; i < s.length(); i++ ) {
			if( s.charAt(i) == s.charAt( i - 1) ) {
				count++;
			} else {

				group.add(count);

				count = 1;
			}
		}

		group.add( count);//Add the last part

		int result = 0;
		for( int i = 1; i < group.size(); i++) {

			result += Math.min( group.get(i), group.get(i-1));
		}

		return result;

	}
}
