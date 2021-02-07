package com.peter12.solution.medium;

public class MEDIUM_0079_WORD_SEARCH {
	public static boolean exist(char[][] board, String word) {
		int row = board.length;
		int col = board[0].length;
		
		boolean[][] done = initialize(row, col);
		boolean result = false;
		
		char firstC = word.charAt(0);
		for( int i = 0; i < row; i++ ) {
			for( int j = 0; j < col; j++ ) {
				if( board[i][j] == firstC ) {
					
					reset(done);
					boolean r = exist( i, j, board, done, word);
					
					if( r == true ) {
						return r;
					}
				}
			
			}
		}
		
		return result;
	}
	
	public static boolean[][] initialize( int r, int c ) {
		boolean[][] result = new boolean[r][];
		for( int i = 0; i < r; i++ ) {
			result[i] = new boolean[c];
			
		}
		
		return result;
	}
	
	public static void reset( boolean[][] data ) {
		for( int i = 0; i < data.length; i++ ) {
			for( int j = 0; j < data[i].length ;j++ ) {
				data[i][j] = false;
			}
		}
	}
	
	public static boolean exist( int i, int j, char[][] board, boolean[][] done, String word) {
		
		if( word.length() == 0 ) {
			return true;
		}
	
		
		char firstC = word.charAt(0);
		
		if( word.length() == 1 ) {
			return board[i][j] == firstC;
		}
		
		if( board[i][j] != firstC ) {
			return false;
		}
		
		done[i][j] = true;
		
		String sub = word.substring(1);
		boolean result = false;
		if ( j+1 < board[i].length && done[i][j+1] == false ) {
			result = exist( i,     j+ 1, board, done, sub);	
		}
		
		if( result == true) {
			return result;
		}
		
		
		if ( j - 1 >= 0            && done[i][j-1] == false) {
			result  = exist( i,     j- 1, board, done, sub);
		}
		
		if( result == true) {
			return result;
		}
		
		if ( i - 1 >= 0            && done[i-1][j] == false ) {
			result    = exist( i - 1, j,    board, done, sub);
		}
		
		if( result == true) {
			return result;
		}
		if ( i+1 < board.length    && done[i+1][j] == false) {
			result  = exist( i + 1, j,    board, done, sub);
		}
	
		done[i][j] = false; // Reset back
		return result;
		
	}
}
