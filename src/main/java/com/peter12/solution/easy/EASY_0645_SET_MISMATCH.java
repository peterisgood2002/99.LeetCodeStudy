package com.peter12.solution.easy;

public class EASY_0645_SET_MISMATCH {
	public int[] findErrorNums(int[] nums) {

		int[] count = new int[ nums.length + 1];
		for( int n : nums ) {
			count[n]++;
		}

		int[] result = new int[2];
		for( int i = 0; i < count.length; i++ ) {
			if( count[i] == 0 ) {
				result[1] = i;
			}

			if( count[i] == 2 ) {
				result[0] = i;
			}
		}

		return result;

	}
}
