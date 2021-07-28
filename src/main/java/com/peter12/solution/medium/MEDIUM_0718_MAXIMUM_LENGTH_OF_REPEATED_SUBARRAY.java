package com.peter12.solution.medium;

public class MEDIUM_0718_MAXIMUM_LENGTH_OF_REPEATED_SUBARRAY {
	public int findLength(int[] nums1, int[] nums2) {
		/*
        Solution:https://www.cnblogs.com/grandyang/p/7801533.html
        A[i, j] :the maximum length of subaraay between nums1[0, i] and nums2[0, j]
        A[i ,j] =   A[i-1][j-1]  +  1 if nums[i - 1] = nums[j - 1]
                          0           if nums[i - 1] != nums[j - 1]
      */
      int[][] dp = new int[nums1.length + 1][];
      for( int i = 0; i < dp.length; i++ ) {
          dp[i] = new int[ nums2.length + 1];
      }
      
      int result = 0;
      for( int i = 1; i <= nums1.length; i++ ) {
          for( int j = 1; j <= nums2.length; j++ ) {
              if( nums1[i-1] != nums2[j-1] ) {
                  dp[i][j] = 0;
              } else {
                  dp[i][j] = dp[i-1][j-1] + 1;
              }
              
              result = Math.max( result, dp[i][j]);
          }
          
          
      }
      
      
      return result;


	}
}
