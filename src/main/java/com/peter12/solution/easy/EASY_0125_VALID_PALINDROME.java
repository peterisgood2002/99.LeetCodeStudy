package com.peter12.solution.easy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EASY_0125_VALID_PALINDROME {
	public static boolean isPalindrome(String s) {

		if(s.length() == 0 ) {
			return true;
		} 

		char[] character = s.toLowerCase().toCharArray();
		int begin = 0, end = character.length - 1;
		do {
			while( begin < character.length && !checkAlphaNumeric(character, begin)  ) {
				begin++;
			}
			while( end >= 0 && !checkAlphaNumeric(character, end) ) {
				end--;
			}

			if( begin > end) {
				return true;// We can not find any alphanumeric
			}
			
			if(character[begin] != character[end] ) {
				return false;
			} else {
				begin++; end--;
			}
		} while( begin <= end );

		return true;

	}

	public static boolean checkAlphaNumeric(char[] character, int i) {

		return ('0' <= character[i] && character[i] <= '9' ) || ('a' <= character[i] && character[i] <= 'z');
	}



}
