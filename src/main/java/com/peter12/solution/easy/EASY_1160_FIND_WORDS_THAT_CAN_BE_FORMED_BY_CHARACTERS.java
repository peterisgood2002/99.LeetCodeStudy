package com.peter12.solution.easy;

public class EASY_1160_FIND_WORDS_THAT_CAN_BE_FORMED_BY_CHARACTERS {
	public int countCharacters(String[] words, String chars) {

		char[] count = count( chars );

		int result = 0;
		for( String w : words ) {
			boolean good = isGood( w, count);

			System.out.println( " w = " + w + " good = " + good );
			if( good ) {
				result += w.length();
			}

		}

		return result;
	}

	public char[] count(String str ) {

		char[] ch = new char[26];
		for( char c : str.toCharArray() ) {
			ch[ c - 'a']++;
		}

		return ch;
	}
	public boolean isGood( String str, char[] count ) {
		char[] ch = count( str );

		for( int i = 0; i < ch.length; i++ ) {
			if( ch[i] > count[i] ) {
				return false;
			}
		} 

		return true;
	}
}
