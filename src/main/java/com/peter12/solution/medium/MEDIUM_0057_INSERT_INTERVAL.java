package com.peter12.solution.medium;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.util.Util;

public class MEDIUM_0057_INSERT_INTERVAL {
	public static int[][] insert(int[][] intervals, int[] newInterval) {

		List< int[] > result = new Vector< int[]> ();
	
		//intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
		boolean findPos = false;
		for( int i = 0 ; i < intervals.length; i++ ) {
			int[] data = intervals[i];

			if( data[1] < newInterval[0] ) {
				//Can not be merged for example data = [1, 2] newInterval = [4, 8]
				result.add(data);
				continue;
			}

			if(newInterval[1] < data[0] ) {// data = [12 ,16] newInterval = [3, 10]

				findPos = true;
				
				result.add(data);
			}


			if( findPos == false ) {
				//Need to merge data = [3, 5] newInterval = [4, 8] ==>newInterval = [3, 8]
				for( int v : data ) {
					if( newInterval[0] > v) {
						newInterval[0] = v;
					}

					if( newInterval[1] < v ) {
						newInterval[1] = v;
					}
				}
			}

		}

		result.add(newInterval);

		
		int[][] r =  Util.outputResult(result);
		
		Util.sortedByTheFirstElement(r);
		
		return r;
	}
}
