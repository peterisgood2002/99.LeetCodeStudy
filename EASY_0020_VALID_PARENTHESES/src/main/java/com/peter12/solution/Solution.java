package com.peter12.solution;

import java.util.List;
import java.util.Vector;

public class Solution {

	public static boolean isValid(String s) {
        
		char[] data = s.toCharArray();
		int total = 0;
		for( char c : data) {
			if( c == '(' || c == '{' || c == '[') {
				total += 1;
			} else {
				total -= 1;
			}
			
		}
	
		
		return total == 0;
    }
}
