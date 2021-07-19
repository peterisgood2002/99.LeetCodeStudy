package com.peter12.solution.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class MEDIUM_1048_LONGEST_STRING_CHAIN {
	public static int longestStrChain(String[] words) {

		/*
		 * Solution: https://www.youtube.com/watch?v=zqe_zIkyVGQ
		 * */
		Arrays.sort( words, ( a,b ) -> ( a.length() - b.length()) );

		HashMap<String, Integer> hw = new HashMap<String, Integer>();

		int result = 0;
		for( String w : words ) {

			Integer max = 0;
			for( int i = 0; i < w.length(); i++ ) {
				StringBuilder sub = new StringBuilder();
				String left = ( i == 0 ) ? "" : w.substring( 0, i);
				String right =( i == w.length() - 1)? "" :  w.substring( i + 1);

				sub.append( left + right );

				Integer chain = hw.get(sub.toString());
				//	                 System.out.println("SUB = " + sub + " chain = " + max);
				if( chain != null ) {
					if( max < chain   ) {
						max = chain ;
					}
				}

			}

			max++;

			//	            System.out.println("W = " + w + " chain = " + max);
			hw.put(w, max);

			if( result < max ) {
				result = max;
			}

			//	            System.out.println("====================");

		}


		return result;
	}
}
