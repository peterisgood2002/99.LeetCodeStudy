package com.peter12.solution.medium;

import com.peter12.solution.util.Util;

public class MEDIUM_0074_SEARCH_A_2D_MATRIX {
	public static boolean searchMatrix(int[][] matrix, int target) {
		int r = matrix.length;
		int c = matrix[0].length;
		
		//Search Column first
		int[] col0 = new int[r];
		for( int i = 0; i < r; i++ ) {
			col0[i] = matrix[i][0];
		}
		
		int row = Util.search(col0, target);
		
		if( 0 <= row && row < r ) {
			int col = Util.search(matrix[row], target);
			
			if( 0 <= col && col < c ) {
				return matrix[row][col] == target;
			} else {
				return false;
			}
		}
		
		return false;
		
	}
	
	
	
	
}
