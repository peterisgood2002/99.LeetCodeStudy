package com.peter12.solution.easy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EASY_0125_VALID_PALINDROME {
	public static boolean isPalindrome(String s) {
		
		if(s.length() == 0 ) {
			return true;
		} 
		
		
		String data = s.toLowerCase();
		
		int firstAlphaNumeric = findAlphaNumeric(data, false);
		int lastAlphaNumeric = findAlphaNumeric(data, true);
		
		if( firstAlphaNumeric > lastAlphaNumeric) {
			return true;// We can not find any alphanumeric
		}
		
		
		if(data.charAt(firstAlphaNumeric) == data.charAt(lastAlphaNumeric) ) {
			
			if( firstAlphaNumeric == lastAlphaNumeric) {
				return true;
			}
			
			String sub =  data.substring(firstAlphaNumeric + 1, lastAlphaNumeric);
			
			
			return isPalindrome(sub );
		} 
		
		return false;
		
	}
	
	public static int findAlphaNumeric(String s, boolean backward) {
		StringBuilder data =new StringBuilder(s);
		
		if( backward ) {
			data = data.reverse();
		}
		
		char[] character = data.toString().toCharArray();
		int i = 0; 
		do {
		
			if( ( '0' <= character[i] && character[i] <= '9' ) || ('a' <= character[i] && character[i] <= 'z') ){
				
				break;
			} 
		} while( ++i < character.length);
		
		if(backward ) {
			return data.length() - 1 - i;
		} else {
			return i;
		}
	}
	
	
	
}
