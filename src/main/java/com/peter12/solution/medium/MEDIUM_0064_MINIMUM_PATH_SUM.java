package com.peter12.solution.medium;

public class MEDIUM_0064_MINIMUM_PATH_SUM {
	public static int minPathSum(int[][] grid) {
		
		int r = grid.length;
		int c = grid[0].length;
		
		int[][] result = new int[r][];
		for( int i = 0; i < r; i++ ) {
			result[i] = new int[c];
			for( int j = 0; j < c; j++ ) {
				result[i][j] = Integer.MAX_VALUE;
			}
		}
		
		result[0][0] = grid[0][0];
		for( int i = 0; i < r; i++ ) {
			for( int j = 0; j < c; j++ ) {
				if( result[i][j] == Integer.MAX_VALUE) {
					if( i == 1 && j == 0) {
						int test = 0;
					}
					int up = ( i - 1 < 0 )? Integer.MAX_VALUE : result[i-1][j];
					int left = ( j - 1 < 0)? Integer.MAX_VALUE: result[i][j-1];
					
					result[i][j] = ( up > left) ? left : up;
					result[i][j] += grid[i][j];
					
				}
			}
		}
		
		return result[r - 1][c - 1];
	}
}
