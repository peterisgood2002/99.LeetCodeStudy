package com.peter12.solution.easy;

public class EASY_1417_REFORMAT_THE_STRING {
	public String reformat(String s) {

		/*
	          Solution: https://blog.csdn.net/wang7075202/article/details/115871488
		 */
		String digits = "";
		String letter = "";

		for( char c : s.toCharArray() ) {
			if( '0' <= c && c <= '9' ) {
				digits += c;
			}

			if( 'a' <= c && c <= 'z' ) {
				letter += c;
			}
		}

		if( Math.abs( digits.length() - letter.length() ) > 1 ) {
			return "";
		}

		String result = "";
		String large = ( digits.length() - letter.length() > 0) ? digits : letter;
		String small = ( digits.length() - letter.length() > 0) ? letter : digits;

		//System.out.println(" digits = " + small + " letter = " + large);
		for( int i = 0; i < small.length(); i++ ) {
			//System.out.println(" s = " + ss + " l = " + l);
			result += large.charAt(i);
			result += small.charAt(i);
		}

		if( result.length() < s.length() ) {
			result += large.charAt( large.length()- 1);
		}


		return result;

	}
}
