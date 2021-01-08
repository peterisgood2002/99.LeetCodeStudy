package com.peter12.solution.easy;

import java.util.HashMap;
import java.util.List;
import java.util.Vector;

public class EASY_0038_COUNT_AND_SAY {
	
	public static String countAndSay(int n) {
		if( n == 1 ) {
			return "1";
		}
		
		String say = countAndSay( n - 1 );
		
		//1. count each digit
	    
		String pre = "";
		int count = 0;
		
		String result = "";
		for( int i = 0; i < say.length(); i++ ) {
						
			String ch = say.substring(i, i+ 1);
			
			if( "".equals(pre) ) {
				//Initialize
				pre = ch;
	
			}
			
			if( pre.equals(ch) ) {
				count++;
			} else {
				//1. add to digit and count List
				result += count + pre;
				
				//2. count new character
				pre = ch;
				count = 1;
							
			}
			
			//decide the last items
			if( i == say.length() - 1 ) {
				result += count + pre;
			}
		}
		
		
		
		return result;
	}
}
