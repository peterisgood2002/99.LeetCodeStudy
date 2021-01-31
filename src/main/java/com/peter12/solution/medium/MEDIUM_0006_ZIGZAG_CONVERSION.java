package com.peter12.solution.medium;

public class MEDIUM_0006_ZIGZAG_CONVERSION {
	public static String convert(String s, int numRows) {
		/*
		 * 
		 *                  4 * 4 
		 * GroupSize         10      
		    Group    |--------0------|--------------1-----------|
		 *    0     s[0]               s[6]=s[8-2]                s[12] = s[2*(8-2)]
		 *    1     s[1]         s[5]  s[7]               s[11]   s[13]
		 *    2     s[2]   s[4]        s[8]         s[10]         s[14]
		 *    3     2[3]               s[9]                       s[15]
		 * */
		
		if( numRows == 1 ) {
			return s;
		}
		
		int groupSize = numRows + numRows - 2;//6
		int group = (groupSize == 0 )? 1 : (int)Math.ceil( ((double) s.length()) / groupSize);//2
		
		String result = "";
		for( int r = 0; r < numRows; r++ ) {
						
			for( int g = 0; g < group; g++ ) {
				int beginIndex = r + g * groupSize;//0
				int endIndex = (g+1) * groupSize ;//6
				if( beginIndex  < s.length() ) {//Edge
					result += s.charAt( beginIndex );
				}
				
				if(0 < r && r < numRows - 1) {
					//s[4] & s[5]
					int otherIndex = endIndex - r;
					
					if( otherIndex < s.length() ) {
						result += s.charAt(otherIndex);
					}
					
				}
			}
		}
		
		return result;
		
	}
}
