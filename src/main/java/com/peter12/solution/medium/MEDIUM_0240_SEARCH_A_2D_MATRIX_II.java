package com.peter12.solution.medium;

public class MEDIUM_0240_SEARCH_A_2D_MATRIX_II {
	public boolean searchMatrix(int[][] matrix, int target) {
		boolean result = false;

		for( int r = 0; r < matrix.length; r++ ) {
			int index = binarySearch( target, matrix[r]);

			if( index != -1) {
				result = true;
			}
		}

		return result;


	}

	public int binarySearch( int target, int[] data ) {
		int begin = 0;
		int end = data.length - 1;

		while( begin <= end ) {
			int middle = ( begin + end ) / 2;

			if( data[middle] == target ) {
				return middle;
			}

			if( data[middle] < target ) {
				begin = middle + 1;
			} else {
				end = middle - 1;
			}
		}

		//can not find
		return -1;

	}
}
