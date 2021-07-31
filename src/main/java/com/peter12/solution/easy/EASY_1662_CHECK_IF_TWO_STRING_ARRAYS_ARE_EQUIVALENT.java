package com.peter12.solution.easy;

public class EASY_1662_CHECK_IF_TWO_STRING_ARRAYS_ARE_EQUIVALENT {
	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		String str1 = "";
		for(  String w : word1 ) {
			str1 += w;
		}

		String str2 = "";
		for( String w : word2 ) {
			str2 += w;
		}

		return str1.equals(str2);
	}
}
