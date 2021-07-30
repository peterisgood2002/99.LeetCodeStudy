package com.peter12.solution.easy;

public class EASY_1309_DECRYPT_STRING_FROM_ALPHABET_TO_INTEGER_MAPPING {
	public String freqAlphabets(String s) {

		String result = "";

		for( int i = 0; i < s.length();  ) {
			int r = 0;
			if( i + 2 < s.length() && s.charAt( i + 2 ) =='#' )  {
				String str = s.substring( i, i + 2);

				r = Integer.parseInt( str);

				i = i + 3;// move to digit after #
			} else {
				r = s.charAt(i) - '0';
				i++;
			}

			//System.out.println( r );
			result += (char) ( r - 1 + 'a');

		}

		return result;
	}
}
