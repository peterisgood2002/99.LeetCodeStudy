package com.peter12.solution.medium;

import java.util.ArrayList;
import java.util.List;

public class MEDIUM_1769_MINIMUM_NUMBER_OF_OPERATIONS_TO_MOVE_ALL_BALLS_TO_EACH_BOX {
	public int[] minOperations(String boxes) {

		List<Integer> pos1 = new ArrayList<Integer>();
		char[] ch = boxes.toCharArray();
		for( int i = 0; i < ch.length; i++ ) {
			if( ch[i] == '1' ) {
				pos1.add(i);
			}
		}

		int[] result = new int[ ch.length];
		for( int i = 0; i < result.length; i++ ) {
			for( int v : pos1 ) {
				if( i != v ) {
					result[i] += Math.abs(v - i);
				}

			}
		}

		return result;

	}
}
