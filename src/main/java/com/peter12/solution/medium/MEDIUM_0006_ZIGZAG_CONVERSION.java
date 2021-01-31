package com.peter12.solution.medium;

public class MEDIUM_0006_ZIGZAG_CONVERSION {
	public static String convert(String s, int numRows) {
		/*
		 * 
		 *                  4 * 4 
		 * GroupSize         10      
		    Group    |--------1---------|--------------2------------|
		 *    0     s[0]               s[6]=s[3*2]                s[12] = s[3*4]
		 *    1     s[1]         s[5]  s[7]               s[11]   s[13]
		 *    2     s[2]   s[4]        s[8]         s[10]         s[14]
		 *    3     2[3]               s[9]                       s[15]
		 * */
		
		int groupSize = numRows * 2 + ( numRows - 2);
		int group = ( s.length() / groupSize ) + 1;
		int index = (2 * numRows) - 2;
		String result = "";
		
		for( int r = 0; r < numRows; r++ ) {
			//First characters in first edge
			if( r == 2) {
				int test = 0;
			}
			
			result += s.charAt(r);
			
			//Other characters
			for( int g = 1; g <= group; g++ ) {
				int i = g * index;
				if( 0 < r  && r < numRows - 1&& i - r < s.length()) {
					result += s.charAt(i - r);
				}
				
				if( i + r< s.length() ) {
					result += s.charAt(i + r);
				}
				
			}
			
		}
		
		return result;
		
	}
}
