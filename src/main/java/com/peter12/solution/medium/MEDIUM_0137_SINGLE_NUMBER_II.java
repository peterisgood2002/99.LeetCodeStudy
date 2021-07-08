package com.peter12.solution.medium;

public class MEDIUM_0137_SINGLE_NUMBER_II {
	public static int singleNumber(int[] nums) {
		/*
        Solution: https://www.youtube.com/watch?v=cOFAmaMBVps
		 */

		int[] bit = new int[32];
		for( int i = 0; i < bit.length; i++ ) {

			int total = 0;
			for( int j = 0; j < nums.length; j++ ) {
				total += ( nums[j] >> i ) & 1;

			}

			bit[i] = total % 3;
		}


		int result = 0;
		for( int i = bit.length - 1; i >= 0; i-- ) {
			result <<= 1;
			result |= bit[i];

		}

		return result;
	}
}
