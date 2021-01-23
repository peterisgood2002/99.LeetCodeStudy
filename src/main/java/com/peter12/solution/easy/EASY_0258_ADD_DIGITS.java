package com.peter12.solution.easy;

public class EASY_0258_ADD_DIGITS {
	public static int addDigits(int num) {
		
		/*
		 * 10 = 1 + 0 = 1
		 * 11 = 1 + 1 = 2
		 * .....
		 * 18 = 1 + 8 = 9
		 * 19 = 1 + 9 = 10 = 1
		 * */
		if( num == 0 ) {
			return 0;
		}
		
		int mod = num % 9;
		if ( mod == 0 ) {
			return 9;
		} else {
			return mod;
		}
	}
}
