package com.peter12.solution.easy;

import java.util.Arrays;

public class EASY_0453_MINIMUM_MOVES_TO_EQUAL_ARRAY_ELEMENTS {
	public static int minMoves(int[] nums) {
	
		/*
		 *   2  6  9
		 *   3  7  9
		 *   4  8  9
		 *   5  9  9 ==> move 3 = (9 - 6) * 1
		 *   6 10  9
		 *   7 10 10
		 *   8 11 10
		 *   9 11 11
		 *  10 12 11
		 *  11 12 12
		 *  12 13 12
		 *  13 13 13 ==> move 8 = (6 - 2) * 2
		 *  
		 *    1  2  3  4  5
		 *    2  3  4  5  5 ==> move 1 = (5 - 4 ) * 1
		 *    3  4  5  6  5
		 *    4  5  6  6  6 ==> move 2 = (4 - 3 ) * 2
		 *    5  6  7  7  6
		 *    6  7  8  7  7
		 *    7  8  8  8  8 ==> move 3 = (3 - 2 ) * 3
		 *    8  9  9  9  8
		 *    9 10 10  9  9 
		 *   10 11 10 10 10 
		 *   11 11 11 11 11 ==> move 4 = (2 - 1) * 4
		 * */
		
		Arrays.sort(nums);
		
		int move = 0;
		
		for( int i = nums.length - 1; i >= 1; i--  ) {
			int diff = Math.abs( nums[i] - nums[i - 1] );
			int factor = nums.length - i;
			
			move += diff * factor;
			
			
		}
		
		return move;
		
	}
}
