package com.peter12.solution.easy;

public class EASY_0338_COUNTING_BITS {
	public int[] countBits(int n) {
		int[] result = new int[ n + 1 ];

		for( int i = 0; i < result.length; i++ ) {
			result[i] = bits(i);
		}

		return result;

	}

	public int bits( int n ) {
		int result = 0;

		while( n > 0 ) {
			result += n & 1;
			n >>= 1;
		}

		return result;
	}
}
