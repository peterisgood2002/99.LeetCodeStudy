package com.peter12.solution.easy;

public class EASY_0504_BASE_7 {
	public static String convertToBase7(int num) {
		
		boolean negative = ( num < 0 )? true: false;
		if(negative) {
			num = -num;
		}
		
		String result = "";
		
		do {
			int digit = num % 7;
			result = digit + result;
			
			num /= 7;
		} while (num > 0);
		
		if( negative ) {
			return "-" + result;
		} else {
			return result;
		}
		
	}
}
