package com.peter12.solution.easy;

import java.util.ArrayList;
import java.util.List;

public class EASY_0830_POSITIONS_OF_LARGE_GROUPS {
	public List<List<Integer>> largeGroupPositions(String s) {

		int begin = 0;
		int end = 0;

		char nowC = s.charAt(0);
		List<List<Integer>> result = new ArrayList< List<Integer> >();
		for(int i = 1; i < s.length(); i++ ) {
			if( s.charAt(i) == nowC ) {
				end++;
			} else {
				System.out.println( " begin = " + begin + " end = " + end );
				if( end - begin + 1 >= 3 ) {
					List<Integer> r = new ArrayList<Integer>();
					r.add(begin);
					r.add(end);

					result.add(r);
				}

				nowC = s.charAt(i);
				begin = i;
				end = i;
			}

			if( i == s.length() - 1 ) {
				if( end - begin + 1 >= 3 ) {
					List<Integer> r = new ArrayList<Integer>();
					r.add(begin);
					r.add(end);

					result.add(r);
				}
			}

		}

		return result;
	}
}
