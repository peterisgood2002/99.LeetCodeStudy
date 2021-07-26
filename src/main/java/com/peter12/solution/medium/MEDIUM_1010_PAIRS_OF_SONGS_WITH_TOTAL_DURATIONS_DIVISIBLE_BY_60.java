package com.peter12.solution.medium;

public class MEDIUM_1010_PAIRS_OF_SONGS_WITH_TOTAL_DURATIONS_DIVISIBLE_BY_60 {
	public int numPairsDivisibleBy60(int[] time) {
		//1. divisible all time by 60
		for( int i = 0; i < time.length; i++ ) {
			time[i] %= 60;
		}



		//2. Get the pair which time[i] + time[j] = 0 | 60
		int[] count = new int[60];
		for( int t :time ) {
			count[t]++;
		}

		int result = count[0] * (count[0] - 1) / 2; //C(n ,2)

		for( int i = 1, j = 59; i < j; i++, j--) {

			result += count[i] * count[j];
		}

		result += count[30] * (count[30] - 1) / 2;

		return result;


	}
}
