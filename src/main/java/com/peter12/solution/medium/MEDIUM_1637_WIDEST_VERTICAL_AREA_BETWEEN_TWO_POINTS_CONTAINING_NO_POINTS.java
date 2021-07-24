package com.peter12.solution.medium;

import java.util.Arrays;

public class MEDIUM_1637_WIDEST_VERTICAL_AREA_BETWEEN_TWO_POINTS_CONTAINING_NO_POINTS {
	public int maxWidthOfVerticalArea(int[][] points) {
		int[] x = new int[ points.length];

		for( int i = 0; i < points.length; i++ ) {
			x[i] = points[i][0];
		}

		Arrays.sort(x);

		int result = 0;
		for( int i = 0; i < x.length - 1; i++ ) {
			if( result < x[i+1] - x[i] ) {
				result = x[i+1] - x[i];
			}
		}

		return result;
	}
}
