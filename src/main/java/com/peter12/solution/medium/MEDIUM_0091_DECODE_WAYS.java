package com.peter12.solution.medium;

public class MEDIUM_0091_DECODE_WAYS {
	public static int numDecodings(String s) {
		if( s.length() == 0 ) {
			return 0;
		}
		
		char first = s.charAt(0);
		//First + XXXXXXX
	
		if( s.length() == 1 ) {
			return ( first == '0' )? 0 : 1;
		}
		
		if( s.length() == 2 ) {
			int val = Integer.parseInt(s);
			if( first == '0' ) {
				return 0;
			}
			
			if( 11 <= val && val <= 26 ) {
				return 2;
			}
			
			return 1;
		}
		
		int result = 0;
		if( first != '0' ) {
			result += numDecodings(s.substring(1));
			
			//10 - 26
			String twoC = s.substring(0, 2);
			int val = Integer.parseInt(twoC);
			if( 10 <= val && val <= 26 ) {
				result += numDecodings(s.substring(2));
			}
		}
		
		return result;
		
	}
}
