package com.peter12.solution.medium;

import java.util.List;

public class MEDIUM_0120_TRIANGLE {
	public static int minimumTotal(List<List<Integer>> triangle) {
		/**
		 * Solution: https://siddontang.gitbooks.io/leetcode-solution/content/dynamic_programming/triangle.html
		 * Note that n is the number of elements in the last rows and the number of row in this triangle as well
		 * R(i, r) : the minimum total of node i in the row r
		 * R(i, r ) = T(i, r) + Min( R(i, r+1), R(i+1, r+1) )
		 * 
		 * r\i
		 *  0  11 
		 *  1  9  10 
		 *  2  7  6  10 
		 *  3  4  1  8  3
		 * 
		 * 
		 */
		
		int[] result = initialize( triangle.size(), triangle.get(triangle.size() - 1));
		for( int r = triangle.size() - 2; r >= 0; r-- ) {
			List<Integer> t = triangle.get(r);
			
			for( int i = 0; i < t.size(); i++ ) {
				int val = t.get(i);
				
				int minTotal = ( result[i] > result[i+1])? result[i+1] : result[i];
				
				result[i] = val + minTotal;
			}
		}
		
		
		
		return result[0];
	}
	
	public static int[] initialize( int size ,List<Integer> data) {
		/*
		 * L\i
		 *  0  
		 *  1  
		 *  2   
		 *  3  4  1  8  3
		 */
		int[] result = new int[ size ];
		for( int i = 0; i < size; i++ ) {
			result[i] = data.get(i);
		}
		
		return result;
	}
	
	
}
