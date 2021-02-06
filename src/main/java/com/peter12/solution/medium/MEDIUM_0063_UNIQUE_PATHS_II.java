package com.peter12.solution.medium;

public class MEDIUM_0063_UNIQUE_PATHS_II {
	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		//Dynamic Programming
		int r = obstacleGrid.length;
		int c = obstacleGrid[0].length;
		
		int[][] result = initialize(r, c, obstacleGrid);
		for( int i = 0; i < r; i++ ) {
			for( int j = 0; j < c; j++ ) {
				if( result[i][j] == -1) {
					int up = ( i - 1 < 0 ) ? 0 : result[i-1][j];
					int left = ( j - 1 < 0) ? 0 : result[i][j-1];
					
					result[i][j] =  up + left;
				}
			}
		}
		
		return result[r-1][c-1];
		
	}
	
	public static int[][] initialize( int r, int c, int[][] obstacleGrid) {
		int[][] result = new int[r][];
		//All Result is -1
		for( int i = 0; i < result.length; i++ ) { 
			result[i] = new int[c];
			for( int j = 0; j < c; j++ ) {
				//Obstacles need to set zero
				if( obstacleGrid[i][j] == 1 ) {
					result[i][j] = 0;
				} else {
					result[i][j] = -1;
				}
				
			}
		}
		
		//First Row is 1 
		if( result[0][0] == -1 ) {
			result[0][0] = 1;
		}
	
		return result;
	}
}
