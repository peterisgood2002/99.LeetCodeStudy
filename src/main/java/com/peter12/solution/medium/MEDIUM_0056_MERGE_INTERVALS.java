package com.peter12.solution.medium;

import java.util.List;
import java.util.Vector;

public class MEDIUM_0056_MERGE_INTERVALS {
	public static int[][] merge(int[][] intervals) {

		/*
		 * Solution: https://leetcode.com/problems/merge-intervals/solution/
		 * */
		
		sortedByTheFirstElement(intervals);
		
		List< int[] > result = new Vector< int[] >();

		
		int[] r = new int[] {Integer.MAX_VALUE, Integer.MIN_VALUE};
		
		for( int i = 0; i < intervals.length; i++ ) {
			int[] data = intervals[i];
			
			if( r[1] < data[0] && r[1] != Integer.MIN_VALUE) {
				//We should output r and reset r for another run
				result.add( new int[] {r[0], r[1]});
				r[0] = data[0];
				r[1] = data[1];
			}
			
			if( i == intervals.length - 1 && r[1] > data[0]) {
				
			}
			
			//Find the smallest and biggest element
			for( int v : data ) {
				if( v < r[0] ) {
					r[0] = v;;
					
				}
				
				if( v > r[1] ) {
					r[1] = v;
				}
			}
			
			
			
		}
		
		//Add the last data
		result.add(r);
		
		
		int [][] rtn = new int[ result.size()][];
		for( int i = 0; i < result.size(); i++ ) {
			rtn[i] = result.get(i);
		}
		return rtn;
	}
	
	public static void sortedByTheFirstElement(int[][] intervals ) {
		for( int i = 0; i < intervals.length; i++ ) {
			for( int j = i; j < intervals.length; j++ ) {
				if(intervals[i][0] > intervals[j][0] ) {
					int[] tmp = intervals[i];
					intervals[i] = intervals[j];
					intervals[j] = tmp;
				}
			}
		}
	}

}
