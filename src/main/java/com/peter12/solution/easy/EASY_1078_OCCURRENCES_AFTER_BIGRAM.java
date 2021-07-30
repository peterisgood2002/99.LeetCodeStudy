package com.peter12.solution.easy;

import java.util.ArrayList;
import java.util.List;

public class EASY_1078_OCCURRENCES_AFTER_BIGRAM {
	public String[] findOcurrences(String text, String first, String second) {

		String[] split = text.split(" ");

		List<String> r = new ArrayList<String>();
		for(int i = 0; i < split.length - 2; i++ ) {
			if( split[i].equals( first ) && split[i+1].equals(second) ) {
				if( i + 2 < split.length ) {
					r.add( split[i+2]);
				}
			}
		}

		String[] result = new String[ r.size() ];
		for( int i = 0; i < result.length;i++) {
			result[i] = r.get(i);
		}

		return result;

	}
}
