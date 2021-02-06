package com.peter12.solution.medium;

public class MEDIUM_0073_SET_MATRIX_ZEROES {
	public static void setZeroes(int[][] matrix) {
		
		int r = matrix.length;
		int c = matrix[0].length;
		
		//0. Do we fill out row0 and col0 
		boolean fillOutRow0 = false;
		boolean fillOutCol0 = false;
		for( int i = 0; i < c; i++ ) {
			if( matrix[0][i] == 0 ) {
				fillOutRow0 = true;
			}
		}
		
		for( int j = 0; j < r; j++ ) {
			if( matrix[j][0] == 0 ) {
				fillOutCol0 = true;
			}
		}
		
		//1. we set matrix[0][] and matrix[][0] if other cell has zero
		for( int i = 1; i < r; i++ ) {
			for( int j = 1; j < c; j++ ) {
				if(matrix[i][j] == 0 ) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		
		//2. Based on matrix[0][] and matrix[][0], we set other cells to zero
		
		for( int i = 1; i < r; i++ ) {
			for( int j = 1; j < c; j++ ) {

				if( matrix[i][0] == 0 || matrix[0][j] == 0 ) {
					matrix[i][j] = 0;
				}
			}
		}
		
		//3. fill out matrix[0][] and matrix[][0] to zero if one of the element equals to zero
		if( fillOutRow0 ) {
			for( int i = 0; i < c; i++ ) {
				matrix[0][i] = 0;
			}
		}
		
		if( fillOutCol0 ) {
			for( int i = 0; i < r; i++ ) {
				matrix[i][0] = 0;
			}
		}
		
	}
}
