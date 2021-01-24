package com.peter12.solution.easy;

public class EASY_0389_FIND_THE_DIFFERENCE {
	public static char findTheDifference(String s, String t) {
		/*
		 * Solution: a ^ a = 0
		 * */
		char[] cs = s.toCharArray();
		char[] ct = t.toCharArray();
		
		char result = 0;
		
		for( int i = 0; i < ct.length; i++ ) {
			result ^= ct[i];
			result ^= ( i < s.length() )? cs[i]: 0; 
		}
		
		return result;
	}
}
