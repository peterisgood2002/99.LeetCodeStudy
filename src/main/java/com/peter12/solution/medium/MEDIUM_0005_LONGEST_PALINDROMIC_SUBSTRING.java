package com.peter12.solution.medium;

import java.util.HashMap;

public class MEDIUM_0005_LONGEST_PALINDROMIC_SUBSTRING {
	public static String longestPalindrome(String s) {
		
		int begin = 0;
		int end = 0;
		for( int i = 0; i < s.length(); i++ ) {
			//Odd Palindrome
			int oddLength = getPalindromeString(i, i, s);
			int evenLength = getPalindromeString(i, i+1, s);
			
			int length = ( oddLength < evenLength)? evenLength: oddLength;
			
			if( end - begin < length ) {
				begin = i - (length - 1) / 2;
				end = i + length / 2;
			}
		}
		
		return s.substring(begin, end + 1);
	}
	
	public static int getPalindromeString( int begin, int end, String data ) {
		
		while( begin >= 0 && end < data.length() && data.charAt(begin) == data.charAt(end) ) {
			begin--;
			end++;
		}
		
		return end - begin - 1;
	}
}
