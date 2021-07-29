package com.peter12.solution.easy;

import java.util.HashSet;

public class EASY_0804_UNIQUE_MORSE_CODE_WORDS {
	public int uniqueMorseRepresentations(String[] words) {
		String[] morse = new String[] {
				".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
		};

		HashSet<String> set = new HashSet<String>();

		for( String w :words ) {
			String str = "";
			for( int i = 0; i < w.length(); i++ ) {
				int index = w.charAt(i) - 'a';

				str += morse[index];

			}

			set.add(str);

		}

		return set.size();
	}
}
