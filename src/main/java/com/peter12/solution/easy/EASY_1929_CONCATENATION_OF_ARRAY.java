package com.peter12.solution.easy;

public class EASY_1929_CONCATENATION_OF_ARRAY {
	public int[] getConcatenation(int[] nums) {

		int[] result = new int[ nums.length * 2];
		for( int i = 0; i < nums.length; i++ ) {
			result[i] = nums[i];
			result[i+ nums.length ] = nums[i];
		}

		return result;
	}
}
