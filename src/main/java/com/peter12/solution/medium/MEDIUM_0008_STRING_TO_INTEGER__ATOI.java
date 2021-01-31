package com.peter12.solution.medium;

public class MEDIUM_0008_STRING_TO_INTEGER__ATOI {
	public static int myAtoi(String s) {
		
		//1. Find Digits
		char[] ch = s.toCharArray();
		int begin = 0;
		int end = 0;
		boolean hasDigit = false;
		while( end < ch.length ) {
			if( '0' <= ch[end] && ch[end] <= '9') {
				hasDigit = true;
				
			} else if( ch[end] == ' ' ) {
				if( hasDigit) {
					break;// reading stops because the next character is a non-digit
				}
				
				begin = end;
			} else if ( ch[end] == '+' || ch[end] == '-' ) {
				if(hasDigit ) {
					break;
				}
				
				hasDigit = true;
			} else {
				break;
			}
			
			end++;
			
		}
	
		//Calculate Result
		double result = 0;
		int pow = 0;
	
		
		for(int i = end - 1; i >= begin; i-- ) {
			
			
			if( '0' <= ch[i] && ch[i] <= '9') {
				int val = ch[i] - 48;
				result += val * Math.pow(10, pow++ );
			
			} else if(ch[i] == '-' ) {
				result = -result;
			} 
			
		
		}
		
		if( result < Integer.MIN_VALUE) {
			result = Integer.MIN_VALUE;
		}
		
		if( result > Integer.MAX_VALUE ) {
			result = Integer.MAX_VALUE;
		}
				
		return (int)result;
	}
}
