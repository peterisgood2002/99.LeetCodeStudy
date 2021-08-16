package com.peter12.solution.easy;

import java.util.HashMap;
import java.util.HashSet;

public class EASY_1941_CHECK_IF_ALL_CHARACTERS_HAVE_EQUAL_NUMBER_OF_OCCURRENCES {
	public boolean areOccurrencesEqual(String s) {

		HashMap<Character, Integer> count = new HashMap<Character, Integer> ();

		for( char ch : s.toCharArray() ) {
			Integer c = count.get(ch);

			if( c == null ) {
				c = 0;
			}

			c++;

			count.put( ch, c );
		}

		HashSet<Integer> result = new HashSet<Integer> ();
		for( int c : count.values() ) {
			result.add(c);
		}

		return result.size() == 1;
	}
}
