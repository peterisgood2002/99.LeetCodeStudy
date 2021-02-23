package com.peter12.solution.medium;

public class MEDIUM_0130_SURROUNDED_REGIONS {
	public static void solve(char[][] board) {
		/*
		 * Note that the only way not to flip comes from the boundary which has 'O'
		 * */
		int row = board.length;
		int col = board[0].length;

		solveFirstAndLastRow(0, board);

		for( int i = 1; i < row - 1; i++ ) {

			if( board[i][0] == 'O' ) {
				solve(i, 0, board);
			}

			if( board[i][ col - 1 ] == 'O' ) {
				solve(i, col - 1, board);
			}
		}

		solveFirstAndLastRow( row - 1, board);
		
		for( int i = 0; i < board.length; i++ ) {
			for( int j = 0; j < board[i].length; j++ ) {
				if( board[i][j] == 'O') {
					board[i][j] = 'X';
				}
				
				if( board[i][j] == '#' ) {
					board[i][j] = 'O';
				}
				
			}
		}
	}

	public static void solveFirstAndLastRow( int rowIndex, char[][] board ) {
		for( int i = 0; i < board[rowIndex].length; i++ ) {
			if( board[rowIndex][i] == 'O') {
				solve(rowIndex, i, board);
			}
		}
	}

	public static void solve( int i, int j, char[][] board ) {

		if( i < 0 || i > board.length ) {
			return;
		}
		
		if( j < 0 || j >  board[i].length ) {
			return;
		}
		
		board[i][j] = '#';
		if( i - 1 >= 0 && board[i-1][j] == 'O' ) {
			solve( i - 1, j, board);
		}
		
		if( i + 1 < board.length - 1 && board[i+1][j] == 'O') {
			solve( i + 1, j, board);
		}
		
		if( j - 1 >= 0 && board[i][j-1] == 'O' ) {
			solve( i, j - 1, board);
		}
		
		if( j + 1 < board[i].length - 1 && board[i][j+1] == 'O') {
			solve( i, j + 1, board);
		}
		
	}

}
