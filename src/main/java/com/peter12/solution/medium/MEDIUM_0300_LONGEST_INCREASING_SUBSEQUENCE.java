package com.peter12.solution.medium;

public class MEDIUM_0300_LONGEST_INCREASING_SUBSEQUENCE {
	public int lengthOfLIS(int[] nums) {
		/*
          A[i] = Max( 0, A[j] ) + 1 
          if j = 0.. i - 1 && nums[j] < nums[i]
		 */

		if( nums.length == 1 ) {
			return 1;
		}

		int[] dp = new int[ nums.length];
		dp[0] = 1;

		int result = 0;

		for( int i = 1; i < nums.length; i++ ) {

			int max = 0;
			for( int j = i - 1; j >= 0 ; j-- ) {
				if( nums[j] < nums[i] ) {
					max = Math.max( max, dp[j]);
				}
			}

			dp[i] = max + 1;

			result = Math.max( result, dp[i]);
			System.out.println( " i = " + i + " dp[i] = " + dp[i]);

		}

		return result;
	}
}
