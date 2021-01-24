package com.peter12.solution.easy;

import java.util.HashMap;
import java.util.Map.Entry;

import com.peter12.solution.util.Util;

public class EASY_0409_LONGEST_PALINDROME {
	public static int longestPalindrome(String s) {
		
		HashMap<String, Integer> count = Util.groupByCharacter(s);	
		
		int result = 0;
		int maxPrime = 0;
		
		for(Entry<String, Integer> e :count.entrySet() ) {
			Integer c = e.getValue();
			
			
			if( c % 2 == 0 ) {
				//This character can be one character in the longest palindrome.
				result += c; 
			} else {
				if( maxPrime < c ) {
					//We can add the character which count is odd and maximum. 
					maxPrime = c;
				}
			}
			
			
			
		}
		
		result += maxPrime;
		
		return result;
		
		
	}
}
