package com.peter12.solution.easy;

import java.util.HashMap;

public class EASY_0387_FIRST_UNIQUE_CHARACTER_IN_A_STRING {
	public static int firstUniqChar(String s) {
		
		HashMap<String, Integer> count = new HashMap<String, Integer>();
		for( int i = 0; i < s.length(); i++ ) {
			String ch = s.substring(i, i+1);
			Integer c = count.get(ch);
			
			if( c == null ) {
				c = 0;
			}
			
			count.put(ch, ++c);
		
		}
		
		for( int i = 0; i < s.length(); i++ ) {
			String ch = s.substring(i, i+1);
			Integer c = count.get(ch);
			
			if( c == 1 ) {
				return i;
			}
		}
		
		return -1;
	}
}
