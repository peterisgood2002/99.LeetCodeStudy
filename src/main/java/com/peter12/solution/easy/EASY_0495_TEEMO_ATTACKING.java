package com.peter12.solution.easy;

public class EASY_0495_TEEMO_ATTACKING {
	public int findPoisonedDuration(int[] timeSeries, int duration) {

		/*
         Solution: https://leetcode.com/problems/teemo-attacking/solution/
		 */

		int result = 0;
		for( int i = 0; i < timeSeries.length - 1; i++ ) {
			int interval = timeSeries[i+1] - timeSeries[i];

			result += Math.min( interval, duration);
		}

		return result + duration;
	}
}
