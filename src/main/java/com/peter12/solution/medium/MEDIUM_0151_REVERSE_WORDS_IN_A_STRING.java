package com.peter12.solution.medium;

public class MEDIUM_0151_REVERSE_WORDS_IN_A_STRING {
	public static String reverseWords(String s) {
		String[] split = s.split(" ");

		String result = "";
		for( int i = split.length - 1; i >= 0 ; i-- ) {
			String str = split[i];
			if( !"".equals(str) ) {
				result += str + " ";
			}
		}

		return result.substring(0, result.length() - 1);
	}
}
