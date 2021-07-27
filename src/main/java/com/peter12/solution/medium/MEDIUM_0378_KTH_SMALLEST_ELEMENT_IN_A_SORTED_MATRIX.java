package com.peter12.solution.medium;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MEDIUM_0378_KTH_SMALLEST_ELEMENT_IN_A_SORTED_MATRIX {
	public int kthSmallest(int[][] matrix, int k) {

		/*
		 * Solution: https://www.cnblogs.com/grandyang/p/5727892.html
		 * */
		PriorityQueue<Integer> result = new PriorityQueue<Integer>( new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}

		});

		int n = matrix.length;

		int total = 0;
		for( int i = 0; i < n; i++ ) {
			for( int j = 0; j < n; j++ ) {

				result.add( matrix[i][j] );

				if( result.size() > k ) {
					result.poll(); //Remove all elements that are not k smallest

				}
			}
		}

		return result.poll();
	}
}
