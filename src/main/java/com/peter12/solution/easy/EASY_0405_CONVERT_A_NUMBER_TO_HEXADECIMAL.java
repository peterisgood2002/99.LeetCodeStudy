package com.peter12.solution.easy;

public class EASY_0405_CONVERT_A_NUMBER_TO_HEXADECIMAL {
	public static String toHex(int num) {
		if( num == 0 ) {
			return "0";
		}
		
		String result = "";
		int move = 0;
		do {
			int digit = num & 15;
			
			result =  digitToHex(digit) + result;
			num >>= 4;
			
			move += 4;
		} while(  move < 32  );
		
		//Remove leading-0
		int leading = 0;
		while( "0".equals( result.substring(leading, leading + 1 ) ) ) {
			leading++;
		}
		
		return result.substring(leading);
	}
	
	public static String digitToHex( int n) {
		if( n <= 9 ) {
			return String.valueOf(n);
		} else {
			char ch = (char) (n + 87);
			return String.valueOf(ch);
		}
	}
}
