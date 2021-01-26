package com.peter12.solution.easy;

import java.util.Set;

import com.peter12.solution.util.Util;

public class EASY_0459_REPEATED_SUBSTRING_PATTERN {
	public static boolean repeatedSubstringPattern(String s) {
		
		//Find the divisor of s.length
		Set<Integer> divisor  = Util.getDivisor( s.length());
		
		//For these divior, we found the rpeated substring
		char[] ch = s.toCharArray();
		
		boolean result = false;
		for( int subIndex : divisor ) {
			
			boolean isRepeated = subIndex != s.length();
			for( int i = subIndex ; i < ch.length; i++ ) {
				if( ch[i] != ch[ i % subIndex] ) {
					
					isRepeated =  false;
					break;
				}
			}
			
			if( isRepeated ) {
				result = isRepeated;
			}
		}
		
		
		return result;
	}
}
