package com.peter12.solution.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;

public class MEDIUM_0547_NUMBER_OF_PROVINCES {
	public static int findCircleNum(int[][] isConnected) {
		/*
		 * The same as Friend Circle in HackerRank: 
		 * https://github.com/jayshah19949596/CodingInterviews/tree/master/TwoSigma%20Software%20Engineer%20Investments%202019/Round%201%20-%20Hackerrank%20Online%20Assessment
		 * */

		List<HashSet<Integer> > result = new ArrayList< HashSet<Integer> >();
		for( int i = 0; i < isConnected.length; i++ ) {
			HashSet<Integer> d = new HashSet<Integer>();
			d.add(i);
			result.add(d);
		}
		
		for( int i = 0; i < isConnected.length; i++ ) {
			for( int j = i + 1; j < isConnected[i].length; j++ ) {

				if( isConnected[i][j] == 1 ) {
					HashSet<Integer> left = null;
					HashSet<Integer> right = null;

					for( HashSet<Integer> circle : result ) {
						if( circle.contains(i) ) {
							left = circle;
						} 
						if ( circle.contains(j) ) {
							right = circle;
						}
					}


					if( left != null && right != null ) {
						left.addAll(right);

						if( left != right ) {
                            result.remove(right);
                        }
					}
				}


			}
		}

		return result.size();


	}
}
