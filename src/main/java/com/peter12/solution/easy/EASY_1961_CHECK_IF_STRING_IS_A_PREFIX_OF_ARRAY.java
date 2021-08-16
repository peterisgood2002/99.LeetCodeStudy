package com.peter12.solution.easy;

public class EASY_1961_CHECK_IF_STRING_IS_A_PREFIX_OF_ARRAY {
	public boolean isPrefixString(String s, String[] words) {

		String str = "";

		for( String w : words ) {
			str += w;
			int index = s.indexOf(str);
			if( index != 0 ) {
				return false;
			}

			if( str.length() == s.length() ) {
				return true;
			}

		}


		return false;


	} 
}
