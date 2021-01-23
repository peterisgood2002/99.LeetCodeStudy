package com.peter12.solution.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class EASY_0290_WORD_PATTERN {
	public static boolean wordPattern(String pattern, String s) {
		
		String[] split = s.split(" ");
		
		if( split.length != pattern.length() ) {
			return false;
		}
		
		int patternIndex = 0;
		Set<String> seen = new HashSet<String>();
		
		HashMap<String, String> match = new HashMap<String, String> ();//<PATTERN, WORD>
		for( int i = 0; i < pattern.length(); i++ ) {
			String p = pattern.substring(i, i+ 1);
			
			String m = match.get(p);
			if( m == null ) {
				m = split[i];
				match.put(p, m);
				
				if( seen.contains(split[i]) ) {
					//We have seen this word and it should map to other pattern
					return false;
				}
				
				seen.add(split[i]);
			}
			
			
			if( !m.equals( split[i] ) ) {
				return false;
			}
			
		}
		
		return true;
		
	}
}
