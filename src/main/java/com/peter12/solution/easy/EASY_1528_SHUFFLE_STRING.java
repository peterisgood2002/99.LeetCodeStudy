package com.peter12.solution.easy;

import java.util.HashMap;

public class EASY_1528_SHUFFLE_STRING {
	public String restoreString(String s, int[] indices) {

		HashMap<Integer, Character> map = new HashMap<Integer, Character>();
		for( int i = 0; i < indices.length; i++ ) {
			map.put( indices[i], s.charAt(i) );
		}

		String result = "";

		int i = 0;
		while( i < s.length() ) {
			result += map.get(i);
			i++;
		} 

		return result;
	}
}
