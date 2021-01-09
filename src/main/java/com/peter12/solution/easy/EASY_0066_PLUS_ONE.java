package com.peter12.solution.easy;

import java.util.List;
import java.util.Vector;

public class EASY_0066_PLUS_ONE {
	public static int[] plusOne(int[] digits) {

		int data = 0;
		for( int i = 0; i < digits.length; i++) {
			data += digits[digits.length - 1 - i ] * Math.pow(10, i);
		}
		
		data++;

		List<Integer> r = new Vector<Integer>();
		while( data >= 1 ) {
			r.add( data % 10);
			
			data /= 10;
		}
		
		int size = r.size();
		int[] result = new int[ size ];
		for(int i = 0; i < size; i++  ) {
			result[i] = r.get(size - 1 - i);
		}
		
		return result;
	}
}
