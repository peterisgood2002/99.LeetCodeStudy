package com.peter12.solution.medium;

import com.peter12.solution.easy.EASY_0415_ADD_STRINGS;

public class MEDIUM_0043_MULTIPLY_STRINGS {
	public static String multiply(String num1, String num2) {
			
		if( num1.equals("0") || num2.equals("0" ) ) {
			return "0";
		}
		
		
		String result = "0";
		
		int num2Size = num2.length() - 1;
		for( int i = num2Size; i >= 0 ; i-- ) {
			char digit = num2.charAt(i);
		
			
			String m = multiplySingleDigits( num1, digit);
			
			//Add Zero
			m = addZero( num2Size - i, m);
			
			result = EASY_0415_ADD_STRINGS.addStrings(result, m);
		}
		
		return result;
	}
	
	public static String multiplySingleDigits( String num, char digit) {
		int[] result = new int[num.length() + 1];
		
		int multiplican = digit - 48;
		int ri = result.length - 1;
		for( int i = num.length() - 1; i >= 0; i-- ) {
			int multiplier = num.charAt(i) - 48;
			
 			int r = multiplier * multiplican;
 			
 			result[ri] += r;
 			
			if( result[ri] >= 10 ) {
				result[ri-1] += result[ri] / 10;
				result[ri] %= 10;
			}
			
			
			
			ri--;
		}
		
		
		String r = (result[0] == 0) ? "" :String.valueOf( result[0] );
		for( int i = 1; i < result.length; i++ ) {
			r += result[i];
		}
		
		return r;
	}
	
	public static String addZero(int count, String data) {
		while( count > 0 ) {
			data += "0";
			
			count--;
		}
		
		return data;
	}
	
	
	
}
