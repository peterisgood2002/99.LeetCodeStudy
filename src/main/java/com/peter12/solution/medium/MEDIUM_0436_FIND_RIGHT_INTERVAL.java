package com.peter12.solution.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MEDIUM_0436_FIND_RIGHT_INTERVAL {
	public int[] findRightInterval(int[][] intervals) {

		/*
	          Solution: https://www.cnblogs.com/grandyang/p/6018581.html
		 */
		HashMap<Integer, Integer> index = new HashMap<Integer, Integer>();
		int[] start = new int[ intervals.length];
		for( int i = 0; i < intervals.length; i++ ) {
			start[i] =  intervals[i][0];

			index.put( intervals[i][0], i);
		}

		Arrays.sort( start );
		int[] result = new int[ intervals.length];
		for( int i = 0; i < intervals.length; i++ ) {
			int rv = findValue( intervals[i][1], start);

			Integer ri = index.get(rv);

			if( ri != null ) {
				result[i] = ri;
			} else {
				result[i] = -1;
			}


		}

		return result;

	}

	public int findValue( int target, int[] data ) {
		int begin = 0;
		int end = data.length - 1;

		while( begin <= end ) {
			int middle = ( begin + end ) / 2;

			if( data[middle] == target ) {
				return data[middle];
			}

			if( target < data[middle] ) {
				end = middle - 1;
			} else {
				begin = middle + 1;
			}
		} 

		if( begin < data.length ) {
			return data[begin];
		} else {
			return Integer.MIN_VALUE;
		}

	}
}
