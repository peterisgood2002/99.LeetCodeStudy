package com.peter12.solution.easy;

public class EASY_0058_LENGTH_OF_LAST_WORD {
	public static int lengthOfLastWord(String s) {
		String[] split = s.split(" ");
		
		if( split.length == 0 ) {
			return 0;
		} else {
			return split[split.length - 1].length();
		}
	}
}
