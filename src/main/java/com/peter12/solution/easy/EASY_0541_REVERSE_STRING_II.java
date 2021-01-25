package com.peter12.solution.easy;

import com.peter12.solution.util.Util;

public class EASY_0541_REVERSE_STRING_II {
	public static String reverseStr(String s, int k) {
		char[] ch = s.toCharArray();
		
		for(int i = 0; i < ch.length; i+= 2*k ) {
			if( i + k >= ch.length) {
				Util.reverse(i, ch.length, ch);
			} else {
				Util.reverse(i, i+k, ch);
			}
			
			
		}
		
		String result = new String(ch);
		
		return result;
	}
}
