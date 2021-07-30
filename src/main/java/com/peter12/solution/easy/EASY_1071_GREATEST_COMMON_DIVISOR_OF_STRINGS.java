package com.peter12.solution.easy;

public class EASY_1071_GREATEST_COMMON_DIVISOR_OF_STRINGS {
	public String gcdOfStrings(String str1, String str2) {
		/*
        Solution: https://www.cnblogs.com/grandyang/p/14537276.html

		 */

		if( str1.length() < str2.length() ) {
			//keep str1 > str2
			return gcdOfStrings(str2, str1);
		}

		if( str2.length() == 0 ) {
			return str1;
		}

		String first = str1.substring( 0, str2.length() );

		if( !first.equals( str2) ) {
			return "";
		} 

		String rest = str1.substring( str2.length() );    
		return gcdOfStrings( rest, str2);

	}
}
