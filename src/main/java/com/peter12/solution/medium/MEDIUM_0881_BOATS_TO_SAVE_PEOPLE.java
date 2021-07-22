package com.peter12.solution.medium;

import java.util.Arrays;

public class MEDIUM_0881_BOATS_TO_SAVE_PEOPLE {
	public int numRescueBoats(int[] people, int limit) {
		Arrays.sort( people );

		int result = 0;
		int begin = 0;
		int end = people.length - 1;

		while( begin <= end ) {
			result++;
			if( people[begin] + people[end] <= limit) {
				begin++; //means that the lightest person is group with the heaviest one
			} 

			end--;


		}

		return result;
	}
}
