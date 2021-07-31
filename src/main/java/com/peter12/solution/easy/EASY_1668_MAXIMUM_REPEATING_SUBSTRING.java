package com.peter12.solution.easy;

public class EASY_1668_MAXIMUM_REPEATING_SUBSTRING {
	public int maxRepeating(String sequence, String word) {

		int result = 0;
		for( int i = 0; i < sequence.length(); i++ ) {
			if( sequence.charAt(i) == word.charAt(0) ) {
				//We may start to find out k -repeating
				int k = i;

				int j = 0;
				while( k < sequence.length() && sequence.charAt(k) == word.charAt(j) ) {
					k++;
					j = ( j + 1 ) % word.length();
				}

				k = ( k - i ) / word.length();

				result = Math.max( result, k);
			}
		}



		return result;
	}

	public int solution(String sequence, String word) {
		String w = word;
		int result = 0;
		while( w.length() <= sequence.length() ) {
			if( sequence.contains(w) ) {
				result++;
				w += word;
			} else {
				break;
			}
		}


		return result;

	}
}
