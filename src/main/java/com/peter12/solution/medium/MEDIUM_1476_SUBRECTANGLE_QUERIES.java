package com.peter12.solution.medium;

public class MEDIUM_1476_SUBRECTANGLE_QUERIES {
	private int[][] data;
    public MEDIUM_1476_SUBRECTANGLE_QUERIES(int[][] rectangle) {
        data = rectangle;
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        
        for( int r = row1; r <= row2; r++) {
            for( int c = col1; c <= col2; c++) {
                data[r][c] = newValue;
            }
        }
        
    }
    
    public int getValue(int row, int col) {
        return data[row][col];
    }
}
