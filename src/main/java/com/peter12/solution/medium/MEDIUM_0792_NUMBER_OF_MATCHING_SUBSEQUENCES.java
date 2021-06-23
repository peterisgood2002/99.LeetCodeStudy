package com.peter12.solution.medium;

import java.util.HashMap;
import java.util.List;
import java.util.Vector;

public class MEDIUM_0792_NUMBER_OF_MATCHING_SUBSEQUENCES {
	public static int numMatchingSubseq(String s, String[] words) {

		/*
        Solution: https://www.youtube.com/watch?v=Vch3pFgmKD8
		 */
		HashMap<Character, List<String> >  map = new HashMap<Character, List<String>>();
		for( char c: s.toCharArray() ) {

			List<String> m = map.get(c);
			if( m == null ) {
				m = new Vector<String>();
				map.put(c, m);
			}
		}

		for( String w : words ) {

			if( w.length() > s.length() ) {
				continue;
			}

			List<String> m = map.get( w.charAt(0) );
			if( m != null ) {
				m.add(w);
			}
		}      

		int result = 0;
		for( char c : s.toCharArray() ) {
			List<String> m = map.get(c);

			List<String> newm = new Vector<String>();

			for( String w : m ) {

				if( w.length() == 1 ) {
					result++;
				} else {
					String sub = w.substring(1);

					if( sub.charAt(0) == c ) {
						newm.add(sub);
					} else {
						List<String> ms = map.get( sub.charAt(0) );
						if( ms != null ) {
							ms.add(sub);
						}
					}     



				}

			}

			map.put(c, newm);


		}


		return result;
	}

}
