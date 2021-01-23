package com.peter12.solution.easy;

public class EASY_0344_REVERSE_STRING {
	public static void reverseString(char[] s) {
		
		int middle = s.length / 2;
		
		for( int i = 0, j = s.length - 1; i < middle; i++, j--) {
			char tmp = s[i];
			s[i] = s[j];
			s[j] = tmp;
		}
	}
}
