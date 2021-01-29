package com.peter12.solution.medium;

import java.util.HashMap;

public class MEDIUM_0003_LONGEST_SUBSTRING_WITHOUT_REPEATING_CHARACTERS {
	public static int lengthOfLongestSubstring(String s) {


		/*
		 * Solution: https://medium.com/swlh/crack-leetcode-3-longest-substring-without-repeating-characters-7afae8daa5f8
		 * 
		 * */
		char[] cs = s.toCharArray();
		
		HashMap<Character, Integer> index = new HashMap<Character, Integer>();
		int result = 0;
		int start = 0;
		for( int end = 0; end < cs.length; end++) {
			//We make sure there is no repeating character between cs[start] and cs[end]
			
			Integer i = index.get( cs[end] );
			if( i == null ) {
				//record end + 1 has no repeating character
				i = end + 1;
				index.put( cs[end], i);
			} else {
				if( start < i ) {
					//There is no repeating character betweeen cs[i] and cs[end]				
					start = i;
				}
				
				index.put( cs[end], end + 1);
			}
			
			if( result < end - start + 1) {
				result = end - start + 1;
			}
			
			
			
		
		}
		
		return result;
	}
}
