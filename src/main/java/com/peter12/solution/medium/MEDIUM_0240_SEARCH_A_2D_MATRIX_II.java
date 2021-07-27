package com.peter12.solution.medium;

public class MEDIUM_0240_SEARCH_A_2D_MATRIX_II {
	public boolean searchMatrix(int[][] matrix, int target) {

		/*
        Solution: https://medium.com/@ChYuan/leetcode-240-search-a-2d-matrix-ii-%E5%BF%83%E5%BE%97-medium-f2cc789cbcad
		 */
		//Start from top right
		int r = 0;
		int c = matrix[0].length - 1;


		while( r < matrix.length && c >= 0 ) {

			if( matrix[r][c] == target ) {
				return true;
			}

			if( matrix[r][c] > target) {
				c--; //move to right    
			} else {
				r++;// move to bottom
			}
		}

		return false;

	}
}
