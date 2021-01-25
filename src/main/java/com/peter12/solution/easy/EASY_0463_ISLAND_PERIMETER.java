package com.peter12.solution.easy;

public class EASY_0463_ISLAND_PERIMETER {
	public static int islandPerimeter(int[][] grid) {
		
		int row = grid.length;
		int col = grid[0].length;
		
		int result = 0;
		for( int i = 0; i < row; i++ ) {
			for( int j = 0; j < col; j++ ) {
				
				if( grid[i][j] == 1 ) {
					//This is land, we should count perimeter
					int nearLand = numberOfNearLand( i , j, row, col, grid );
					result += 4 - nearLand;
				}
			}
		}
		
		return result;
	}
	
	public static int numberOfNearLand(int i, int j, int row, int col, int[][] grid) {
		int result = 0;
		if( i - 1 >= 0 ) {
			result += grid[ i - 1][j];
		}
		if( i + 1 < row) {
			result += grid[ i + 1][j]; 
		}
		
		if( j - 1 >= 0 ) {
			result += grid[i][ j - 1 ];
			
		}
		
		if( j + 1 < col ) {
			result += grid[i][ j + 1 ];
		}
		
		return result;
		
	}
}
