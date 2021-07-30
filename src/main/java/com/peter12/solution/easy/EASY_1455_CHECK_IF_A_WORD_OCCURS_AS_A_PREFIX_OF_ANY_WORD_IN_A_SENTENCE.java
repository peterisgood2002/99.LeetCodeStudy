package com.peter12.solution.easy;

public class EASY_1455_CHECK_IF_A_WORD_OCCURS_AS_A_PREFIX_OF_ANY_WORD_IN_A_SENTENCE {
	public int isPrefixOfWord(String sentence, String searchWord) {
		String[] split = sentence.split(" ");

		int result = -1;
		for( int i = 0; i < split.length; i++ ) {

			int index = split[i].indexOf( searchWord );
			//System.out.println( "split = " + split[i] +" index = " + index);
			if( index == 0 ) {
				return i + 1;
			}
		}

		return result;
	}
}
