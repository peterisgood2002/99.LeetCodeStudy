package com.peter12.solution.medium;

public class MEDIUM_0055_JUMP_GAME {
	public static boolean canJump(int[] nums) {
		/*
		 * Geedy Solution: https://leetcode.com/problems/jump-game/solution/
		 * we check if there is a potential jump that reaches a GOOD index 
		 * (currPosition + nums[currPosition] >= leftmostGoodIndex)
		 * Index     0 1 2 3 4 5 6 7
		 * Value     3 2 1 0 1 2 0 3
		 * Distance  3 2 1 0 2 1 0 1
		 * 
		 * */
		int lastGoodIndex = nums.length - 1;
		for( int i = nums.length - 1; i >= 0; i-- ) {
			if( i + nums[i] >= lastGoodIndex)  {
				lastGoodIndex = i;
			}
		}
		
		return lastGoodIndex == 0;
	}
	

	
	
}
