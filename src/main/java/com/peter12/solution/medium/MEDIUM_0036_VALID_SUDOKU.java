package com.peter12.solution.medium;

import java.util.Arrays;

public class MEDIUM_0036_VALID_SUDOKU {
	public static boolean isValidSudoku(char[][] board) {
		
		return isRowValid(board) && isColumnValid(board) && is3X3Valid(board);
	}
	
	public static boolean isRowValid(char[][] board) {
		for( int i = 0; i < board.length; i++ ) {
			if( !isValid( board[i]) ) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isColumnValid( char[][] board ) {
		char[] data = new char[board.length];
		for( int c = 0; c < board.length; c++ ) {
			for(int r = 0; r < board[c].length; r++ ) {
				data[r] = board[r][c];
			}
			
			if( !isValid( data ) ) {
				return false;
			}
			
		}
		
		
		return true;
	}
	
	public static boolean is3X3Valid( char[][] board ) {
		
		for( int i = 0; i < board.length; i+= 3 ) {
			for( int j = 0; j < board[i].length; j+=3 ) {
				if( !is3X3Valid(i, j, board) ) {
					return false;
				}
			}
		}
		
		return true;
		
	}
	
	public static boolean is3X3Valid(int row, int col, char[][] board ) {
		
		char[] data = new char[board.length];
		int index = 0;
		for( int i = row; i < row + 3; i++ ) {
			for( int j = col; j < col + 3; j++) {
				data[ index++ ] = board[i][j];
			}
		
		}
		
		
		return isValid(data);
		
	}
	
	public static boolean isValid( char[] array ) {
		
		boolean[] hasItem = new boolean[array.length]; 
		
		for( int i = 0; i < array.length ; i++ ) {
			if(array[i] == '.' ) {
				continue;
			}
			
			int a = array[i] - 49;
			
			if( hasItem[a] == true) {
				return false;
			}
			
			hasItem[a] = true;
		}
		
		return true;
	}
}
