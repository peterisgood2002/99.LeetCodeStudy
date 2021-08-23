package com.peter12.solution.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MEDIUM_0187_REPEATED_DNA_SEQUENCES {
	public List<String> findRepeatedDnaSequences(String s) {

		List<String> result = new ArrayList<String>();
		HashSet<String> letter = new HashSet<String>();
		for( int i = 0; i < s.length() - 9; i++ ) {
			String sub = s.substring( i , i + 10);
			//System.out.println( " i = " + i + " sub = " + sub);

			if( letter.contains(sub) ) {
				if( !result.contains(sub) ) {
					result.add(sub);
				}

			} 

			letter.add(sub);
		}

		return result;
	}
}

