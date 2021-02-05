package com.peter12.solution.medium;

import java.util.List;
import java.util.Vector;

public class MEDIUM_0054_SPIRAL_MATRIX {
	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new Vector<Integer>();
		int r = matrix.length - 1;
		int c = matrix[0].length - 1;
		
		spiralOrder(0, r, 0, c, matrix, result);
		return result;
		
	}
	
	public static void spiralOrder(int br, int er, int bc, int ec, int[][] matrix, List<Integer> result) {
		if( br > er || bc > ec  ) {
			return;
		}
		
		
		//First Row
		for( int i = bc; i <= ec; i++ ) {
			result.add( matrix[br][i] );
		}
		
		///Last Edge
		for( int i = br + 1; i <= er; i++ ) {
			result.add( matrix[i][ec] );
		}
		
		//Last Row
		if( br < er ) {
			for( int i = ec - 1; i >= bc; i-- ) {
				result.add( matrix[er][i]);
			}
		}
		
		
		//First Edge
		if( bc < ec ) {
			for( int i = er - 1; i >= br + 1; i-- ) {
				result.add( matrix[i][bc] );
			}
		}
		
		
		spiralOrder(br + 1, er - 1, bc + 1, ec - 1, matrix, result);
	}
}
