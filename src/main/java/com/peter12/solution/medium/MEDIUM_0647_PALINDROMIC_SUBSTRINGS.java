package com.peter12.solution.medium;

public class MEDIUM_0647_PALINDROMIC_SUBSTRINGS {
	public static int countSubstrings(String s) {

		/*
        Solution: https://blog.csdn.net/wonz5130/article/details/108150276

        R[i][j] = r[i+1][j-1]
        
             a a a
           a T
           a   T T
           a     T
		 */
		//Initialize
		boolean[][] result = new boolean[s.length()][];
		int r = 0;
		for( int i = 0; i < s.length(); i++ ) {
			result[i] = new boolean[s.length()];

			for( int j = 0; j < s.length(); j++ ) {
				if( i == j ) {
					result[i][j] = true;
					r++;
				} else {
					result[i][j] = false;
				}
			}
		}

		//

		for( int i = s.length() - 1; i >= 0; i-- ) {
			for( int j = i + 1; j < s.length(); j++ ) {
				if( s.charAt(i) == s.charAt(j) ) {
					if( j == i + 1 ) {
						result[i][j] = true;
					} else {
						result[i][j] = result[i+1][j-1];
					}
				} else {
					result[i][j] = false;
				}

				if( result[i][j] ) {
					r++;
				}

			}
		}

		return r;

	}
}
