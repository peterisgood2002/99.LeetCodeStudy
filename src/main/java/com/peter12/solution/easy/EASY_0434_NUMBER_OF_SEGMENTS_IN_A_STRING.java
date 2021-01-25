package com.peter12.solution.easy;

public class EASY_0434_NUMBER_OF_SEGMENTS_IN_A_STRING {
	public static int countSegments(String s) {
		if( s == null || s.length() == 0 ) {
			return 0;
			
		}
		
		String [] split = s.split("( )+");
		
		int count = 0;
		for( String sp : split) {
			if( !sp.equals("") ) {
				count++;
			}
		}
		return count;
	}
}
