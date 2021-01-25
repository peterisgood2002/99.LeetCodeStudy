package com.peter12.solution.easy;

public class EASY_0520_DETECT_CAPITAL {
	public static boolean detectCapitalUse(String word) {

		char[] data = word.toCharArray();
		
		int upperCase = 0;
		for(char c : data ) {
			if('A' <= c && c <= 'Z') {
				upperCase++;
			}
		}
		
		if( upperCase == 0 || upperCase == word.length()) {
			return true;
		}
		
		if( upperCase == 1 && ('A' <= data[0] && data[0] < 'Z' ) ) {
			return true;
		}
		
		return false;
	}
}
