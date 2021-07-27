package com.peter12.solution.medium;

public class MEDIUM_0275_H_INDEX_II {
	public int hIndex(int[] citations) {
		/*
          Solution: https://www.cnblogs.com/grandyang/p/4782695.html
		 */

		int begin = 0;
		int end = citations.length - 1;



		while( begin <= end ) {

			int middle = ( begin + end )  / 2;

			int h = citations.length - middle;

			if( h == citations[middle] ) {
				return h;
			}
			if( h < citations[middle] ) {
				end = middle - 1;// Find maximum one
			} else {
				begin = middle + 1;
			}

		}

		//Can not find the exact one( h = nums[i]) but we can obtain ( h > nums[i])
		return citations.length - begin;
	}
}
