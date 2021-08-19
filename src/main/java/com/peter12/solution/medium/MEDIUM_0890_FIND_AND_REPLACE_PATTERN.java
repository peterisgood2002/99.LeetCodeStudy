package com.peter12.solution.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class MEDIUM_0890_FIND_AND_REPLACE_PATTERN {
	public List<String> findAndReplacePattern(String[] words, String pattern) {
		List<String> result = new ArrayList<String>();

		for( String w : words ) {
			if( isMatch( w, pattern ) ) {
				result.add(w);
			}
		}

		return result;
	}

	public boolean isMatch( String word, String pattern ) {
		if( word.length() != pattern.length() ) {
			return false;
		} 

		HashMap<Character, Character> map = new HashMap<Character, Character>();

		HashSet<Character> see = new HashSet<Character>();
		for( int i = 0; i < pattern.length(); i++ ) {
			char p = pattern.charAt(i);
			Character c = map.get( p );

			if( c == null ) {
				char w = word.charAt(i);

				if( see.contains(w) ) {
					//We see this character before
					return false;
				}

				map.put(p, w );
				see.add( w );
			} else {

				if( c != word.charAt(i) ) {
					return false;
				}
			}
		}

		return true;
	}
}
