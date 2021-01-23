package com.peter12.solution.easy;

public class EASY_0374_GUESS_NUMBER_HIGHER_OR_LOWER {
	
	public static int pick = 0;
	
	public static int guessNumber(int n) {
		
		double i = 0; 
		double j = n;
		int middle = 0;
		do {
			double m = (i + j ) / 2;
			middle = ( int ) m;
			
			int g = guess(middle);
			
			if( g == 0 ) {
				return middle;
			}
			
			if( g == 1) {
				
				if( i == middle) {
					return (int)j;
				}
				i = middle;
			}
			
			if( g == -1 ) {
				if( j == middle) {
					return (int)i;
				}
				j = middle;
			}
			
		} while( i < j ) ;
		
		return middle;
	}
	
	public static int guess( int num ) {
		if( pick == num ) {
			return 0;
		}
		
		if( pick < num) {
			return -1;
		}
		
		return 1;
	}
}
