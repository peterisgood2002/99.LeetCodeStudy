package com.peter12.solution.easy;


public class EASY_0013_ROMAN_TO_INTEGER {

	public static int romanToInt(String s) {

		if( s.length() == 0 || s.length() > 15 ) {
			 return 0;
		}
		
		char[] data = s.toCharArray();

		int size = data.length - 1;
		char lastChar = data[size];
		int result = convertSymbolToInt( lastChar);
		
		for( int i = size - 1; i >= 0; i--) {
			int val = negativeWhenMeet(data[i], lastChar);
			
			result += val;
			
			lastChar = data[i];
			
		}
		
		
		if( 1 <= result && 3999 <= result) {
			
		}
		return result;
	}
	
	public static int negativeWhenMeet(char now, char last) {
		int result = convertSymbolToInt(now);
		
		if( now == 'I') {
			if( last == 'V' || last =='X') {
				return - result;
			}
		} else if ( now == 'X' ) {
			if( last == 'L' || last =='C') {
				return - result;
			}
			
		} else if ( now == 'C' ) {
			if( last == 'D' || last =='M') {
				return - result;
			}
		}
		
			
		return result;
		
	}

	public static int convertSymbolToInt(char symbol) {
		if(symbol == 'I' ) {
			return 1;
		} else if ( symbol  ==  'V') {
			return 5;
		}  else if ( symbol ==  'X') {
			return 10;
		}  else if ( symbol  ==  'L') {
			return 50;
		}  else if ( symbol  ==  'C') {
			return 100;
		}  else if ( symbol  ==  'D') {
			return 500;
		}  else if ( symbol  ==  'M') {
			return 1000;
		} else {
			return 0;
		}
		
	}
}
