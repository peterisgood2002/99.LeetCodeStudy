package com.peter12.solution.medium;

import java.util.ArrayList;
import java.util.List;

public class MEDIUM_0300_LONGEST_INCREASING_SUBSEQUENCE {

	public int lengthOfLIS(int[] nums) {

		return binarySearch(nums);
	}
	
	public int binarySearch( int[] nums ) {
		/*

			Solution: https://www.cnblogs.com/grandyang/p/4938187.html
		 */
		List<Integer> result = new ArrayList<Integer>();// This store the final result and this array is in asc order
		for( int i = 0; i < nums.length; i++ ) {

			//Find a good place to insert nums[i]
			int begin = 0;
			int end = result.size();

			while( begin < end ) {
				int middle = ( begin + end ) / 2;
				if( result.get( middle ) < nums[i] ) {
					begin = middle + 1;
				} else {
					end = middle; // This is the location we need to set
				}
			}

			System.out.println( "end = " + end + " size = " + result.size() );
			if( end >= result.size() ) {
				//We add this items to the result
				result.add( nums[i]);
			} else {
				//This element should add to this location
				result.set( end, nums[i] );
			}
		}


		return result.size();
	}
	public int dynamicProgramming(int[] nums) {
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
