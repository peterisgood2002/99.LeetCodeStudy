package com.peter12.solution.medium;

public class MEDIUM_0754_REACH_A_NUMBER {
	public int reachNumber(int target) {
		/*
            Solution: https://leetcode.com/problems/reach-a-number/discuss/112968/Short-JAVA-Solution-with-Explanation
            1. S = 1+2+3+.....k >= T
            2. if S > T, we can find delta = S - T
            3. delta is even and we can switch  one of sign into negatvie
            4. delta is odd and we take more steps based on k so that delta becomes odd
		 */

		target = Math.abs(target);
		//1. S = 1+2+3+.....k >= T
		int k = 0;
		int total = 0;
		while( total < target ) {
			k++;
			total += k;
		}


		//2. find delta = S - T
		int delta = total - target;
		System.out.println( " k = " + k + " total = " + total + " delta = " + delta);
		if( delta % 2 == 0 ) {
			return k; // delta is even and we can switch  one of sign into negatvie
		} else {
			if( k % 2 == 0 ) {
				return k + 1;// k + 1 is odd  odd + delta = even
			} else {
				return k + 2;
			}
		}



	}
}
