package com.peter12.solution.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MEDIUM_1329_SORT_THE_MATRIX_DIAGONALLY {
	public int[][] diagonalSort(int[][] mat) {

		/*
         Solution: https://www.youtube.com/watch?v=JBqUl7avtG8
		 */
		int row = mat.length;
		int col = mat[0].length;

		//Bottom Triangle
		for( int i = 0; i < row; i++ ) {

			sort(i, 0, row, col, mat);
		}


		//Top Triangle
		for( int i = 1; i < col; i++ ) {
			sort(0, i, row, col, mat);
		}

		return mat;


	}

	public void sort( int r, int c, int row, int col, int[][] mat ) {
		List<Integer> d = new ArrayList<Integer>();
		for( int i = r, j = c; i < row && j < col; i++, j++ ) {
			d.add( mat[i][j] );
		}

		Collections.sort( d );

		int k = 0;
		for( int i = r, j = c; i < row && j < col; i++, j++ ) {
			mat[i][j] = d.get(k++);
		}

	}
}
