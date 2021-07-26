package com.peter12.solution.medium;

public class MEDIUM_1011_CAPACITY_TO_SHIP_PACKAGES_WITHIN_D_DAYS {
	public int shipWithinDays(int[] weights, int days) {
		/*
          Solution: https://www.youtube.com/watch?v=CoNBRq5JSz0

             the more capacity it carry; the less day we spent.



		 */

		int min = 0;//Max weights
		int max = 0;//Sum of weights
		for( int w : weights ) {
			max += w;

			min = Math.max( min, w);
		}

		//Make sure we get the min capcity int D Days
		int result = 0;
		while( min <= max ) {

			int middle = ( min + max ) / 2;

			int day = getDays( middle, weights);


			if( day <= days) {
				//this capacity require more days, we should increase capacity
				result = middle;
				max = middle - 1;
			} else {
				min = middle + 1;
			}


		}

		return result;
	}

	public int getDays(int capacity, int[] weights ) {
		int result = 1;
		int total = 0;
		for( int w : weights ) {
			total += w;

			if( total > capacity ) {
				result++;

				total = w;
			}


		}

		return result;
	}
}
