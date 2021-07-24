package com.peter12.solution.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MEDIUM_1329_SORT_THE_MATRIX_DIAGONALLY {
	public int[][] diagonalSort(int[][] mat) {

		int row = mat.length;
		int col = mat[0].length;

		//Bottom Triangle
		for( int i = row - 1; i >= 0; i--) {
			List<Integer> d = new ArrayList<Integer>();
			for( int r = i, c = 0; r < row && c < col; r++, c++ ) {
				d.add( mat[r][c]);
			}

			Collections.sort(d);

			int k = 0;
			for( int r = i, c = 0; r < row && c < col; r++, c++ ) {
				mat[r][c] = d.get(k++);
			}

		}



		//Top Triangle
		for( int i = col - 1; i >= 1; i--) {
			List<Integer> d = new ArrayList<Integer>();
			for( int c = i, r = 0; c < col && r < row; c++, r++ ) {
				d.add( mat[r][c]);
			}

			Collections.sort(d);

			int k = 0;
			for( int c = i, r = 0; c < col && r < row; c++, r++ ) {
				mat[r][c] = d.get(k++);
			}
		}

		return mat;


	}
}
