package com.peter12.solution;

import java.util.List;
import java.util.Vector;

public class Solution {

	public static boolean isValid(String s) {
		if( s .equals("") ) {
			return true;
		} else if ( s.length() == 1 ) {
			return false;
		} 
		
        //1. Get the first element of String
		char first = s.charAt(0);
		
		//2. retrieve the reciprocal element from the last element of String
		char corresponding = getReciprocalElement(first);
		if( corresponding == 'A') {
			return false;
		}
		
		int last = s.indexOf(corresponding);
		if( last == -1 ) {
			//We can not find related part
			return false;
		} 
		
		
		//3. split the String into two parts
		String firstPart = s.substring(1, last);
		String secondPart = s.substring(last + 1);
		if( last == 1 ) {
			return isValid(secondPart);
		} else {
			return isValid(firstPart) && isValid(secondPart);
		}
		
		
	
		
    }
	
	
	public static char getReciprocalElement(char c) {
		if( c == '(') {
			return ')';
		}
		
		if( c == '[') {
			return ']';
		}
		
		if( c == '{') {
			return '}';
		}
		
		return 'A';
	}
}
