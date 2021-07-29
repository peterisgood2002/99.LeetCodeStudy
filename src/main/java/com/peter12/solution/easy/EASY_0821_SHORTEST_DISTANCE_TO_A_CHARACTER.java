package com.peter12.solution.easy;

public class EASY_0821_SHORTEST_DISTANCE_TO_A_CHARACTER {
	public int[] shortestToChar(String s, char c) {
		int[] result = new int[ s.length() ];

		//From left to right
		int preIndex = -1;
		for( int i = 0; i < s.length(); i++ ) {
			if( s.charAt(i) == c ) {

				int count = 1;
				for(int j = i - 1; j > preIndex; j-- ) {
					result[j] = count;

					count++;
				}

				preIndex = i;
			}
		}


		//From right to left
		preIndex = s.length();
		for( int i = s.length() - 1; i >= 0; i-- ) {
			if( s.charAt(i)  == c ) {
				int count = 1;
				for( int j = i + 1; j < preIndex; j++ ) {
					if( result[j] != 0 ) {
						result[j] = Math.min( count, result[j]);
					} else {
						result[j] = count;
					}


					count++;
				}

				preIndex = i;
			}

		}

		return result;
	}
}
