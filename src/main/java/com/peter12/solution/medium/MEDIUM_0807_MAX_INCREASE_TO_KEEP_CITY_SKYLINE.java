package com.peter12.solution.medium;

public class MEDIUM_0807_MAX_INCREASE_TO_KEEP_CITY_SKYLINE {
	public int maxIncreaseKeepingSkyline(int[][] grid) {
int size = grid.length;
        
        int[] west = new  int[ size ];
        for( int c = 0; c < size; c++ ) {
            for( int r = 0; r < west.length; r++ ) {
                if( west[r] < grid[r][c] ) {
                    west[r] = grid[r][c];
                }
            }
        }          
        
        int[] north = new int[ size ];
        for( int r = 0; r < size; r++ ) {
            for( int c = 0; c < north.length; c++) {
                if( north[c] < grid[r][c] ) {
                    north[c] = grid[r][c];
                }
            }
        }
        
      
        int result = 0;
        for( int r = 0; r < size; r++ ) {
            
            for( int c = 0; c < size; c++ ) {
                int minHeight = Math.min( west[r], north[c]);
                
                if( grid[r][c] < minHeight) {
                    result += minHeight - grid[r][c];
                }
            }
        }
        
        return result;
       
    }
}
