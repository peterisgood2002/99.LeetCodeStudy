package com.peter12.solution.easy;

import java.util.Arrays;

public class EASY_0453_MINIMUM_MOVES_TO_EQUAL_ARRAY_ELEMENTS {
	public static int minMoves(int[] nums) {
	
		/**
		 * 
		 * Solution: https://medium.com/@terracotta_ko/leetcode-453-minimum-moves-to-equal-array-elements-b1a8da3ff6d8
		 */
		/*
		 *             2  6  9
		 * (2 6 8)+1   3  7  9
		 * (2 6 7)+2   4  8  9
		 * (2 6 6)+3   5  9  9 ==> move 3 = (9 - 6) * 1
		 * (2 6 5)+4   6 10  9
		 * (2 5 5)+5   7 10 10
		 * (2 5 5)+6   8 11 10
		 * (2 4 4)+7   9 11 11
		 * (2 4 3)+8  10 12 11
		 * (2 3 3)+9  11 12 12
		 * (2 3 2)+10 12 13 12
		 * (2 2 2)+11 13 13 13 ==> move 8 = (6 - 2) * 2
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
