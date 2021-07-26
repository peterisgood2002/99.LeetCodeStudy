package com.peter12.solution.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MEDIUM_0973_K_CLOSEST_POINTS_TO_ORIGIN {
	public int[][] kClosest(int[][] points, int k) {

		HashMap<Double, List<int[]>> distance = new HashMap<Double, List<int[]>>();
		List<Double> key = new ArrayList<Double>();
		for( int[] p : points ) {
			double d = Math.sqrt(p[0] * p[0] + p[1] * p[1] );

			List<int[]> l = distance.get(d);
			if( l == null ) {
				l = new ArrayList<int[]>();
				distance.put(d, l);

				key.add(d);
			}

			l.add(p);
		}

		Collections.sort(key);

		int[][] result = new int[k][];
		int count = 0;
		for( double v : key) {
			List<int[]> d = distance.get(v);

			for( int i = 0; i < d.size() && count < k; i++ ) {
				result[count++] = d.get(i);
			}

		}

		return result;
	}
}
