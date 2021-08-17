package com.peter12.solution.medium;

public class MEDIUM_1094_CAR_POOLING {
	public boolean carPooling(int[][] trips, int capacity) {

		/*
		 * Solution: https://zxi.mytechroad.com/blog/heap/leetcode-1094-car-pooling/
		 * */
		int[] location = new int[1001];

		for( int[] t : trips ) {
			int passenger = t[0];
			location[ t[2] ] -= passenger;// drop off
			location[ t[1] ] += passenger;// pick up
		}

		for( int i = 0; i < location.length; i++ ) {
			capacity -= location[i];
			if( capacity < 0 ) {
				return false;
			}

		}

		return true;
	}
}
