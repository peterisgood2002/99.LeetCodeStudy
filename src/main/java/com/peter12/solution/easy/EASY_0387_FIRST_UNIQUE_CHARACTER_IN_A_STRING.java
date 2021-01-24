package com.peter12.solution.easy;

import java.util.HashMap;

import com.peter12.solution.util.Util;

public class EASY_0387_FIRST_UNIQUE_CHARACTER_IN_A_STRING {
	public static int firstUniqChar(String s) {
		
		HashMap<String, Integer> count = Util.groupByCharacter(s);
			
		
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
