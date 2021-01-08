package com.peter12.solution.easy;

import java.util.HashMap;

public class EASY_0038_COUNT_AND_SAY {
	
	public static String countAndSay(int n) {
		if( n == 1 ) {
			return "1";
		}
		
		String say = countAndSay( n - 1 );
		
		//1. count each digit
		HashMap<String, Integer> count = new HashMap<String, Integer>();
		for( int i = 0; i < say.length(); i++ ) {
			String ch = say.substring( i, i + 1 );
			Integer c = count.get(ch);
			
			if( c != null ) {
				c++;
			} else {
				c = 1;
			}
			
			count.put(ch, c);
		}
		
		//2. Say
		String result = "";
		for( int i = 0; i < say.length(); i++ ) {
			String ch = say.substring( i, i + 1 );
			Integer c = count.remove(ch);
			if( c != null ) {
				result += c.toString() + ch; 
			}
			
		}
		
		return result;
		
		
	}
}
