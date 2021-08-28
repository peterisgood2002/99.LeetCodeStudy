package com.peter12.solution.easy;

public class EASY_0566_RESHAPE_THE_MATRIX {
	public int[][] matrixReshape(int[][] mat, int r, int c) {

		int row = mat.length;
		int col = mat[0].length;

		if( row * col != r * c ) {
			return mat;
		}


		int[][] result = new int[r][];
		int mr = 0;
		int mc = 0;
		for( int i = 0; i < r; i++ ) {
			result[i] = new int[c];

			for( int j = 0; j < c; j++ ) {
				result[i][j] = mat[mr][mc];

				mc++;

				if( mc == col ) {
					mc = 0;
					mr++;
				}
			}
		}

		return result;

	}
}
