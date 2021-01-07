package com.peter12.solution;

import java.util.List;
import java.util.Vector;

public class Solution {
	public static int reverse(int x) {

		int data = x;
		List<Integer> digit = new Vector<Integer>();
		boolean negative = data < 0;

		if( negative) {
			data = -data;
		}

		while( data != 0 ) {
			digit.add(data % 10);

			data /= 10;
		}


		double result = 0;
		int size = digit.size() - 1;
		for( int i = 0; i <= size ; i++) {
			result += Math.pow(10, size - i) * digit.get(i);

		}

		if(negative) {
			result = -result;
		}


		double max = Math.pow(2, 31) - 1;
		double min = -Math.pow(2, 31);

	    if( min <= result && result <= max ) {
	    	return (int) result;
	    } else {
	    	return 0;
	    }
			
		
	}
}
