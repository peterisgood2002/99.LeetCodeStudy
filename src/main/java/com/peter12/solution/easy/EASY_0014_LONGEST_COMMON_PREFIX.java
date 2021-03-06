package com.peter12.solution.easy;

import java.util.List;
import java.util.Vector;

public class EASY_0014_LONGEST_COMMON_PREFIX {

	public static String longestCommonPrefix(String[] strs) {

		String result = "";
		
		//1. Find the smallest string
		int smallestLength = Integer.MAX_VALUE;
		for(String s : strs ) {
			if( s.length() < smallestLength ) {
				smallestLength = s.length();
			}
		}
		
		if(smallestLength == Integer.MAX_VALUE) {
			return result;
		}
		
		//2. Compare each character
		for( int i = 0; i < smallestLength - 1; i++ ) {
			
			char word = strs[0].charAt(i);
			boolean commonPrefix = true;
			
			for( int j = 1; j < strs.length; j++ ) {
				if( word != strs[j].charAt(i) ) {
					return result;
				}
				
			}
			
			if(commonPrefix ) {
				result += word;
			}
		}
		
		return result;
	}
}
