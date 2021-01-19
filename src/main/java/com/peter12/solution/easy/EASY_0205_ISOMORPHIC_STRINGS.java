package com.peter12.solution.easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Vector;

public class EASY_0205_ISOMORPHIC_STRINGS {
	public static boolean isIsomorphic(String s, String t) {
		/**
		 * Solution: https://www.geeksforgeeks.org/check-if-two-given-strings-are-isomorphic-to-each-other/
		 */
		int i = 0;
		int j = 0;
		
		HashMap<String, String> replace = new HashMap<String, String>();
		List<String> visitS = new Vector<String>();
		while ( i == j && i < s.length() ) {
			String chS = s.substring( i, i + 1 );
			String chT = t.substring( j, j + 1 );
			
			String r = replace.get(chT);
			
			if( r == null ) {
				if( visitS.contains(chS) ) {
					return false;
				}
				
				r = chS;
				replace.put(chT, r);
			}
			if( !r.equals(chS) ) {
				return false;
			}
			
			visitS.add(chS);
			i++; j++;
		}


		return true;
	}

	


}
