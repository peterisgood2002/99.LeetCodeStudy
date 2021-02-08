package com.peter12.solution.medium;

public class MEDIUM_0091_DECODE_WAYS {
	public static int numDecodings(String s) {
		
		//Dyanmic Programming
		int[] result = new int[s.length()];
		
		//Determine the last two value
		int size = s.length() - 1;
		setResult( s.charAt(size), 1, size, result);
	
		
		
		//Else
		for( int i = size - 1; i >= 0 ; i-- ) {
			
			int r = result[ i+ 1];
			boolean valid = isValidForTheNextTwoC(i, s);
			
			if( valid ) {
				if( i == size - 1 ) {
					r++;
				} else if( i < size - 1 ) {
					r += result[i+2];
				}
				
			}
			
			setResult( s.charAt(i), r, i, result);
			
			
		}
		
		
		return result[0];
		
		
	}

	public static boolean isValidForTheNextTwoC(int i, String s ) {
		String twoC = s.substring(i, i+ 2);
		int val = Integer.parseInt(twoC);
		
		if( 10 <= val && val <= 26 ) {
			return true;
			
		}
		
		return false;
		
	}
	
	public static void setResult( char c, int val, int i, int[] result ) {
		if(c == '0' ) {
			result[i] = 0;
		} else {
			result[i] = val;
		}
	}
}
