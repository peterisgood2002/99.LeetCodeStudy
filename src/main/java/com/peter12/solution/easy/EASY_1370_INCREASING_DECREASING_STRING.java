package com.peter12.solution.easy;

public class EASY_1370_INCREASING_DECREASING_STRING {
	public String sortString(String s) {
		int[] count = new int[26];

		for( char ch : s.toCharArray() ) {
			count[ ch - 'a']++;
		}

		int total = 0;
		String result = "";
		while( total < s.length() ) {
			//Step 1 to Step3
			for( int i = 0; i < count.length;i++ ) {
				if( count[i] > 0 ) {
					result += (char)( i + 'a');

					count[i]--;

					total++;
				}
			}

			//Step 4 to 6
			for( int i = count.length - 1; i>= 0; i-- ) {
				if( count[i] > 0 ) {
					result += (char)( i + 'a');

					count[i]--;

					total++;
				}
			}


		}


		return result;

	}
}
