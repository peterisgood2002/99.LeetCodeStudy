package com.peter12.solution.easy;

import java.util.HashMap;

import com.peter12.solution.util.Util;

public class EASY_0242_VALID_ANAGRAM {
	public static boolean isAnagram(String s, String t) {
		
		HashMap<String, Integer> countS = Util.groupByCharacter(s);
			
		
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
