package com.peter12.solution.easy;

public class EASY_0867_TRANSPOSE_MATRIX {
	public int[][] transpose(int[][] matrix) {

		int row = matrix.length;
		int col = matrix[0].length;

		int[][] result = new int[col][];//Col x Row
		for(int c = 0; c < col; c++ ) {
			result[c] = new int[row];
			for( int r = 0; r < row; r++ ) {
				result[c][r] = matrix[r][c];
			}
		}

		return result;
	}
}
