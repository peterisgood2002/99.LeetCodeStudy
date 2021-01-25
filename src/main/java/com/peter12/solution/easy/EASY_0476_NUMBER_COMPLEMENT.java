package com.peter12.solution.easy;

public class EASY_0476_NUMBER_COMPLEMENT {
	public static int findComplement(int num) {
		int move = 0;
		int result = 0;
		do {
			
			int bit = num & 1;
			int pow = (int)Math.pow(2, move);
			result += (bit^1) * pow ;
			
			num >>= 1;
		} while( ++move < 31 && num != 0);
		
		return result;
	}
}
