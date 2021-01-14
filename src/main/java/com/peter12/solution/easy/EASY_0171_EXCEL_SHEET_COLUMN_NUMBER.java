package com.peter12.solution.easy;

public class EASY_0171_EXCEL_SHEET_COLUMN_NUMBER {
	public static int titleToNumber(String s) {
		char[] ch = s.toCharArray();
		int size = ch.length;
		
		int result = 0;
		for( int i = 0; i < size; i++ ) {
			int pow = (size -1)- i;
			int val = convertCharToInt(ch[i]);
			
			result += val * Math.pow(26, pow);
		}
		
		return result;
	}
	
	public static int convertCharToInt(char c ) {
		return (int)(c) - 64;
	}
}
