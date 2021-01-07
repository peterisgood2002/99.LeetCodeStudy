package com.peter12.solution;

import java.util.List;
import java.util.Vector;

public class Solution {

	public static boolean isValid(String s) {
		if( s .equals("") ) {
			return true;
		} else if ( s.length() == 1 ) {
			return false;
		} else if ( s.length() == 2 ) {
			return s.equals("()") || s.equals("[]") || s.equals("{}");
		}
		
		String data = s;
		data = remove(data, "()");
		data = remove(data, "[]");
		data = remove(data, "{}");
		
		if( !data.equals(s)) {
			return isValid(data);
		} else {
			return false;
		}
		
		
    }
	
	public static String remove( String s, String parentheses) {
		
		while( s.contains(parentheses)) {
			 s = s.replace(parentheses, "");
		
		}
		
		return s;
	}
	
}
