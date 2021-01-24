package com.peter12.solution.easy;

import java.util.HashMap;
import java.util.Map.Entry;

import com.peter12.solution.util.Util;

public class EASY_0409_LONGEST_PALINDROME {
	public static int longestPalindrome(String s) {
		
		HashMap<String, Integer> count = Util.groupByCharacter(s);	
		
		int result = 0;
		
		for(Entry<String, Integer> e :count.entrySet() ) {
			Integer c = e.getValue();
			
			result += c / 2 * 2; //Add Even Character
			
			if( result % 2 == 0 && c % 2 == 1 ) {
				//We have a character which count is odd
				result++;
			}
			
			
		}
		
		
		return result;
		
		
	}
}
