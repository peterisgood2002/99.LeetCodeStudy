package com.peter12.solution.medium;

public class MEDIUM_1930_UNIQUE_LENGTH_3_PALINDROMIC_SUBSEQUENCES {
	public int countPalindromicSubsequence(String s) {

		int result = 0;

		boolean[] select = new boolean[26];
		for( int i = 0; i < s.length(); i++ ) {
			char first = s.charAt(i);

			if( select[first - 'a'] == false ) {

				//Last Element
				int j = s.length() - 1;
				while( j > i && s.charAt(j) != first ) {
					j--;
				}

				System.out.println(" i = " + i + " j = " + j +" result = " + result);
				//Middle Element
				boolean[] count = new boolean[26];
				for( int k = i + 1; k < j; k++) {
					char second = s.charAt(k);

					count[ second - 'a'] = true;
				}

				for( boolean c : count ) {
					if( c ) {
						result ++;
					}
				}
			}


			select[first - 'a'] = true;          


		}

		return result;

	}
}
