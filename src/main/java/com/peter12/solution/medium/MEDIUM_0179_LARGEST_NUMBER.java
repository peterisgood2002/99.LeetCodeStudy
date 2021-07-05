package com.peter12.solution.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MEDIUM_0179_LARGEST_NUMBER {
	public static  String largestNumber(int[] nums) {
		List<String> result = new ArrayList<String>();
		for( int n : nums ) {
			result.add( String.valueOf(n) );
		}

		Collections.sort( result, new Comparator<String>() {
			public int compare( String o1, String o2 ) {
				String a = o1 + o2;
				String b = o2 + o1;

				return -a.compareTo(b);

			}
		});

		if( result.get(0).equals("0") ) {
            return "0";
        }
		
		String r = "";
		for( String v : result ) {
			r += v;
		}

		return r;
	}


}
