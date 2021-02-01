package com.peter12.solution.medium;

import java.util.List;
import java.util.Vector;

public class MEDIUM_0017_LETTER_COMBINATIONS_OF_A_PHONE_NUMBER {
	public static List<String> letterCombinations(String digits) {

		if( digits.length() == 0 ) {
			return new Vector<String>();
		}
		
		if( digits.length() == 1 ) {
			return digitToString(digits);
		}
		
		List<String> first = digitToString(digits.substring(0, 1));
		List<String> others = letterCombinations(digits.substring(1));
		
		List<String> result = new Vector<String>();
		for( String f : first ) {
			for( String o : others ) {
				result.add( f + o);
			}
		}
		
		return result;
		
	}
	
	public static List<String> digitToString( String digit ) {
		int val = Integer.parseInt(digit);
		char ch = getFirstCharacter(val);
		
		List<String> result = new Vector<String>();
		
		result.add(String.valueOf(ch));
		result.add(String.valueOf( (char)(ch+1) ));
		result.add(String.valueOf( (char)(ch+2) ));
		
		if(val == 7 || val == 9 ) {
			result.add(String.valueOf((char)(ch+3)));
		}
		
		return result;
	}
	
	public static char getFirstCharacter( int val ) {
		if( val <= 6) {
			return (char) ('a' + (val - 2) * 3);
		}
		
		if( val == 7 ) {
			return 'p';
		}
		
		if( val == 8 ) {
			return 't';
		}
		
		if( val == 9 ) {
			return 'w';
		}
		
		return 'a';
	}
}
