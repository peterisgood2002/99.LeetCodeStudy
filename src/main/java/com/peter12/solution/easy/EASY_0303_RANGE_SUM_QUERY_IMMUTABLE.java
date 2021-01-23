package com.peter12.solution.easy;

public class EASY_0303_RANGE_SUM_QUERY_IMMUTABLE {
	
	int[] data = null;
	public EASY_0303_RANGE_SUM_QUERY_IMMUTABLE(int[] nums) {
		data = nums;
	}

	public int sumRange(int i, int j) {

		int total = 0;
		for( int k = i; k<= j; k++ ) {
			total += data[k];
		}
		
		return total;
	}
}
