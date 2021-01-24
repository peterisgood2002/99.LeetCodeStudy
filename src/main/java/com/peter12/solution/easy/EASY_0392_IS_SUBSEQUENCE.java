package com.peter12.solution.easy;

public class EASY_0392_IS_SUBSEQUENCE {
	public static boolean isSubsequence(String s, String t) {
		
		if( s.length() == 0 ) {
			return true;
		}
		
		
		char[] cs = s.toCharArray();
		char[] ct = t.toCharArray();
		
		int i = 0; 
		int j = 0;
		
		do {
			while(j < ct.length && cs[i] != ct[j] ) j++;
			
			if( j == ct.length  ) {
				return false;
			}
			
			i++;
			j++;
		} while ( i < cs.length );
		
		return true;
	}
}
