package com.peter12.solution.easy;

import java.util.HashMap;

public class EASY_0242_VALID_ANAGRAM {
	public static boolean isAnagram(String s, String t) {
		
		HashMap<String, Integer> countS = new HashMap<String, Integer> ();
		for( int i = 0; i < s.length(); i++ ) {
			String ch = s.substring(i, i + 1);
			Integer c = countS.get(ch);
			if( c == null ) {
				c = 0;
			}
			
			countS.put(ch, ++c);
		}
		
		for( int i = 0; i < t.length(); i++  ) {
			String ch = t.substring(i, i + 1 );
			Integer c = countS.get(ch);
			if( c == null ) {
				return false;
			}
			
			if( c == 1 ) {
				countS.remove(ch);
			} else {
				countS.put(ch, --c);
			}
			
			
		}
		
		return countS.isEmpty();

	}
}
