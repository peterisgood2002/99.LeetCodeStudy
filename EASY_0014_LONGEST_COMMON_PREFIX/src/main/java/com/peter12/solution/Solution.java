package com.peter12.solution;

import java.util.List;
import java.util.Vector;

public class Solution {

	public static String longestCommonPrefix(String[] strs) {

		String result = "";
		
		//1. Find the smallest string
		int smallestLength = Integer.MAX_VALUE;
		for(String s : strs ) {
			if( s.length() < smallestLength ) {
				smallestLength = s.length();
			}
		}
		
		//2. Compare each character
		for( int i = 0; i < smallestLength; i++ ) {
			
			char word = strs[0].charAt(i);
			boolean commonPrefix = true;
			
			for( int j = 1; j < strs.length; j++ ) {
				if( word != strs[j].charAt(i) ) {
					commonPrefix = false;
					break;
				}
				
			}
			
			if(commonPrefix ) {
				result += word;
			}
		}
		
		return result;
	}
}
