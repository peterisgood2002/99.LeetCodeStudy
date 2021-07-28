package com.peter12.solution.medium;

public class MEDIUM_1143_LONGEST_COMMON_SUBSEQUENCE {
	public int longestCommonSubsequence(String text1, String text2) {
		/*
        A[i,j] : LCS for text1[0..i] and text2[0..1] 

        A[i,j] = A[i-1, j-1] + 1          if( text1[i] == text2[j] )
                 MAX( A[i-1,j], A[i, j-1] ) if( text1[i] != text2[j])
		 */
		int m = text1.length();
		int n = text2.length();
		int[][] dp = new int[ m + 1][];
		for( int i = 0; i < dp.length; i++ ) {
			dp[i] = new int[ n + 1]; 
		}

		for( int i = 1; i <= m; i++ ) {
			char c1 = text1.charAt(i - 1);
			for( int j = 1; j <= n; j++ ) {
				char c2 = text2.charAt(j - 1);

				if( c1 == c2 ) {
					dp[i][j] = dp[i-1][j-1] + 1;
				} else {
					dp[i][j] = Math.max( dp[i-1][j], dp[i][j-1]);
				}
			}
		}

		return dp[m][n];
	}
}
