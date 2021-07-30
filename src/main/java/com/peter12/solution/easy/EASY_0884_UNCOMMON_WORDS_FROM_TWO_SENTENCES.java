package com.peter12.solution.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EASY_0884_UNCOMMON_WORDS_FROM_TWO_SENTENCES {
	public String[] uncommonFromSentences(String s1, String s2) {

		/*
          We combine s1 and s2, and we will find out this solution only 1 count
		 */


		HashMap<String, Integer> count = new HashMap<String, Integer>(); // This is also our final result
		String[] split = s1.split(" " );
		for( String s : split ) {
			Integer c = count.get(s);
			if( c == null ) {
				c = 0;
			}

			c++;
			count.put(s, c);
		}

		split = s2.split(" " );
		for( String s : split ) {
			//1. Find if this string appear in s1 
			Integer c = count.get(s);
			if( c == null ) {
				c = 0;
			}

			c++;

			count.put(s, c);
		}

		List<String> result = new ArrayList<String>();
		for( HashMap.Entry<String, Integer> e : count.entrySet() ) {
			if( e.getValue()  == 1 ) {
				result.add(e.getKey() );
			}
		}

		String[] r = new String[ result.size() ];
		for( int i = 0; i < r.length;i++ ) {
			r[i] = result.get(i);
		}

		return r;

	}
}
