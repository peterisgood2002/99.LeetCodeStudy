package com.peter12.solution.medium;

import java.util.Arrays;

public class MEDUIM_1099_TWO_SUM_LESS_THAN_K {
	public int twoSumLessThanK(int[] A, int K) {
		Arrays.sort(A);
		
		int result = 0;
		int b = 0;
		int e = A.length;
		while( b <= e ) {
			int sum = A[b] + A[e];
			
			if( sum <= K ) {
				if( result < sum ) {
					result = sum;
				}
				
				b++;
			} else {
				e--;
			}
		}
		
		
		return result;
	}
}
