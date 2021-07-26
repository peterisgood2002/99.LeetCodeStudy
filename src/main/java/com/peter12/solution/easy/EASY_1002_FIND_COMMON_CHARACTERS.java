package com.peter12.solution.easy;

import java.util.ArrayList;
import java.util.List;

public class EASY_1002_FIND_COMMON_CHARACTERS {
	public List<String> commonChars(String[] A) {

		int[][] count = new int[A.length][26];

		for( int i = 0; i < A.length; i++ ) {
			String str = A[i];
			for( int j = 0; j < str.length(); j++ ) {

				count[i][ str.charAt(j) - 'a']++;
			}
		}


		List<String> result = new ArrayList<String>();

		for( int c = 0; c < 26; c++ ) {
			int show = Integer.MAX_VALUE;
			for( int r = 0; r < count.length; r++ ) {
				show = Math.min( show, count[r][c] );
			}

			if( show > 0 ) {
				for( int i = 0; i < show; i++ ) {

					result.add( String.valueOf( (char) (c + 'a') ) );
				}
			}
		}

		return result;

	}
}
