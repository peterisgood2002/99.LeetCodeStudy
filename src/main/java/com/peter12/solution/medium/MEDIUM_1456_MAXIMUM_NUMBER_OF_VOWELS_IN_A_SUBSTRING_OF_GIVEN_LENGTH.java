package com.peter12.solution.medium;

public class MEDIUM_1456_MAXIMUM_NUMBER_OF_VOWELS_IN_A_SUBSTRING_OF_GIVEN_LENGTH {
	public int maxVowels(String s, int k) {

		char[] chs = s.toCharArray();
		int i = 0;
		int j = 0;
		int total = 0;
		while( j < k ) {
			if( isVowel(chs[j] ) ) {
				total++;
			}

			j++;
		}
		int result = total;
		while( j < chs.length ) {

			System.out.println( " i = " + i + " j = " + j + " total = " + total);
			if( isVowel( chs[i] ) ) {
				total--;
			}

			if( isVowel( chs[j] ) ) {
				total++;
			}

			if( result < total ) {
				result = total;
			}   

			i++;
			j++;
		}

		return result;
	}

	public boolean isVowel( char c ) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}
}
