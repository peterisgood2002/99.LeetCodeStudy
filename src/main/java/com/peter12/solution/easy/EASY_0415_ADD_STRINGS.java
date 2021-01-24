package com.peter12.solution.easy;

public class EASY_0415_ADD_STRINGS {
	public static String addStrings(String num1, String num2) {

		if( num1.length() > num2.length() ) {
			return addStrings( num2, num1);
		}
		
		//num2 is bigger than num1
		int[] cn1 = toIntArray( num1.toCharArray() );
		int[] cn2 = toIntArray( num2.toCharArray() );
		
		int[] result = new int[cn2.length + 1];
		
		int i = cn1.length - 1;
		int j = cn2.length - 1;
		int ri = result.length - 1;
		while( j >= 0 ) {
			int d1 = ( i >= 0 )? cn1[i] : 0;
			int d2 = cn2[j];
			
			int val = d1 + d2 + result[ri];
			
			result[ri] =  val % 10;
			
			if( val >= 10 ) {
				//Carry
				result[ ri - 1] ++;
			}
			
			i--;
			j--;
			ri--;
		}
		
		
		String sr = "";
		for( i = 0; i < result.length; i++ ) {
			if(  i == 0 && result[i] == 0 ) {
				continue;
			}
			
			sr += result[i];
		}
		return sr;
		
	}
	
	public static int[] toIntArray( char[] c ) {
		int[] result = new int[ c.length];
		
		for( int i = 0; i < c.length; i++ ) {
			result[i] = StringToInt( c[i] );
		}
		
		return result;
	}
	
	public static int StringToInt( char c ) {
		return c - 48;
	}
	
	
	
}
