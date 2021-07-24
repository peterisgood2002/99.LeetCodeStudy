package com.peter12.solution.medium;

public class MEDIUM_1409_QUERIES_ON_A_PERMUTATION_WITH_KEY {
	public int[] processQueries(int[] queries, int m) {

		int[] data = new int[m];

		for( int i = 0; i < m; i++ ) {
			data[i] = i + 1;
		}

		int[] result = new int[queries.length];
		for( int i = 0; i < queries.length; i++ ) {

			int j = 0;
			while( j < data.length && queries[i] != data[j] ) {

				j++;
			}

			result[i] = j;

			while( j > 0 ) {
				data[j] = data[j-1];
				j--;
			}

			data[0] = queries[i];


		} 

		return result;
	}
}
