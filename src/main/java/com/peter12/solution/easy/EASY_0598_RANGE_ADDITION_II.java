package com.peter12.solution.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class EASY_0598_RANGE_ADDITION_II {
	public int maxCount(int m, int n, int[][] ops) {

		if( ops == null || ops.length == 0 ) {
			return m * n;
		}

		HashSet<int[]> set = new HashSet<int[]>();
		for( int[] o : ops ) {
			set.add(o);
		}

		int[] min = new int[]{ Integer.MAX_VALUE, Integer.MAX_VALUE};
		for( int[] s : set ) {
			min[0] = Math.min(min[0], s[0]);
			min[1] = Math.min(min[1], s[1]);
		}

		return min[0] * min[1];

	}
}
