package com.peter12.solution.medium;

public class MEDIUM_0540_SINGLE_ELEMENT_IN_A_SORTED_ARRAY {
	public int singleNonDuplicate(int[] nums) {

		//A ^ A = A
		int result = 0;

		for( int n : nums ) {
			result ^= n;
		}

		return result;
	}
}
