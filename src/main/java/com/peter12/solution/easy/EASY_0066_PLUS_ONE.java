package com.peter12.solution.easy;

import java.util.List;
import java.util.Vector;

public class EASY_0066_PLUS_ONE {
	public static int[] plusOne(int[] digits) {

		//Initialize
		int[] data = new int[digits.length + 1];
		data[0] = 0;
		for( int i = 0; i < digits.length; i++ ) {
			data[i + 1] = digits[i];
		}
		
		//plus 1
		int size = data.length - 1;
		int val = data[size] + 1;
		do {
			if(val < 10 ) {
				data[size] = val;
			} else {
				data[size] = 0;
				val = ++data[ --size];
			}
		} while(val >= 10);
		
		//assemble result
		size = (data[0] == 0 ) ? data.length - 1: data.length;
		int dataIndex = (data[0] == 0 ) ? 1: 0;
		
		int[] result = new int[size];
		for( int i = 0; i < result.length; i++ ) {
			result[i] = data[ dataIndex++ ];
		}
		
		return result;
	}
}
