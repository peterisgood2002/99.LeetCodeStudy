package com.peter12.solution.medium;

public class MEDIUM_0048_ROTATE_IMAGE {
	public static void rotate(int[][] matrix) {
		/*
		 * Analyze the index between image and rotate image
		       a00   a01  a02          |   a20 a10 a00
		       a10   a11  a12          |   a21 a11 a01
		       a20   a21  a22          |   a22 a12 a02

		       a00   a01  a02  a03     |   a30 a20 a10 a00
		 *     a10   a11  a12  a13     |   a31 a21 a11 a01
		 *     a20   a21  a22  a23     |   a32 a22 a12 a02
		 *     a30   a31  a32  a33     |   a33 a23 a13 a03
		 * 
		 * Solution: https://leetcode.com/problems/rotate-image/solution/
		 * Orignal ==> Transposed ==> Revert = Rotation
		 * */


		//Transposed
		for( int i = 0; i < matrix.length; i++ ) {
			for( int j = i; j < matrix.length; j++ ) {
				int tmp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = tmp;
			}
		}

		//Revert
		int i = 0;
		int j = matrix.length - 1;

		do {
			for( int k = 0; k < matrix.length; k++ ) {
				int tmp = matrix[k][i];
				matrix[k][i] = matrix[k][j];
				matrix[k][j] = tmp;
			}

			i++;
			j--;
		} while( i < j );

	}
}
