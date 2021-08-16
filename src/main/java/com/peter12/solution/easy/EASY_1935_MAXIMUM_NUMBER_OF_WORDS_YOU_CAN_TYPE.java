package com.peter12.solution.easy;

public class EASY_1935_MAXIMUM_NUMBER_OF_WORDS_YOU_CAN_TYPE {
	public int canBeTypedWords(String text, String brokenLetters) {

		String[] split = text.split(" ");

		int result = 0;
		for( String s : split ) {

			boolean count = true;
			for( char c : s.toCharArray() ) {
				if( brokenLetters.indexOf(c) >= 0 ) {
					count = false;
				}
			}

			if( count ) {
				result++;
			}

		}

		return result;
	}
}
