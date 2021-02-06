package com.peter12.solution.medium;

public class MEDIUM_0059_SPIRAL_MATRIX_II {
	public static int[][] generateMatrix(int n) {
		int[][] result = new int[n][];
		for( int i = 0; i < n; i++ ) {
			result[i] = new int[n];
		}
		
		
		generateMatrix(1, 0, 0, result);
		return result;
		
		
	}
	
	public static void generateMatrix(int val, int rb, int cb, int[][] result ) {
		
		if( val > result.length * result.length ) {
			
			return;
		}
		
		int re = result.length - 1 - rb;
		int ce = result.length - 1 - cb;
		
		//First Row
		for( int i = cb; i <= ce; i++ ) {
			result[rb][i] = val++;
		}
		
		//Last Edge
		for( int i = rb + 1; i <= re; i++ ) {
			result[i][ce] = val++;
		}
		
		//Last Row
		for( int i = ce - 1; i >= cb; i-- ) {
			result[re][i] = val++;
		}
		
		//First Edge
		for( int i = re - 1; i > rb; i-- ) {
			result[i][cb] = val++;
		}
		
		
		generateMatrix( val, rb+1, cb + 1, result);
	
		
	}
	
}
