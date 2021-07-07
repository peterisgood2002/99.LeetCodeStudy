package com.peter12.solution.medium;

import java.util.ArrayList;
import java.util.List;

public class MEDIUM_0134_GAS_STATION {
	public int canCompleteCircuit(int[] gas, int[] cost) {

		int[] remain = new int[ gas.length ];

		for( int i = 0; i < gas.length; i++ ) {
			remain[i] = gas[i] - cost[i];
		}

		List<Integer> startIndex = new ArrayList<Integer>();
		int totalRemain = 0;
		for( int i = 0; i < remain.length; i++ ) {
			if( remain[i] >= 0 ) {
				startIndex.add( i );
			}

			totalRemain += remain[i];
		}

		if( totalRemain < 0 ) {
			return -1;
		} else {


			for( int i : startIndex ) {
				int r = remain[i];

				int j = (i + 1) % remain.length;

				System.out.println( " I = " + i + " J = " + j);
				while( r >= 0 && i != j ) {
					r += remain[j];

					j = ( j + 1 ) % remain.length;

				}

				System.out.println( " r = " + r );
				if( r >= 0 ) {
					return i;
				}

			}

			return -1;
		}

	}
}
