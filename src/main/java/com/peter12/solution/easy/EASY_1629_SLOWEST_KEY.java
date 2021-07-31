package com.peter12.solution.easy;

public class EASY_1629_SLOWEST_KEY {
	public char slowestKey(int[] releaseTimes, String keysPressed) {
		int max = releaseTimes[0];
		int maxi = 0;
		char maxc = keysPressed.charAt(0);
		for( int i = 1; i < releaseTimes.length; i++ ) {
			int diff = releaseTimes[i] - releaseTimes[ i - 1 ];

			//System.out.println( "i = " + i + " diff = " + diff + " max = " + max);

			if( max < diff ) {
				max = diff;
				maxi = i;
				maxc = keysPressed.charAt(i);
			} else if ( max == diff && maxc < keysPressed.charAt(i) ) {
				maxi = i;
				maxc = keysPressed.charAt(i);
			}
		}

		return maxc;
	}
}
