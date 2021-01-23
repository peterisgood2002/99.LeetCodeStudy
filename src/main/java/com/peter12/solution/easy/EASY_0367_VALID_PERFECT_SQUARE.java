package com.peter12.solution.easy;

public class EASY_0367_VALID_PERFECT_SQUARE {
	public static boolean isPerfectSquare(int num) {
		if( num == 1 ) {
			return true;
		}
		
		int size = num / 2;
		for( int i = 1; i <= size; i++ ) {
			if( num == i * i ) {
				return true;
			}
		}
		
		return false;
	}
}
