package com.peter12.solution.medium;

public class MEDIUM_0045_JUMP_GAME_II {
	public static int jump(int[] nums) {
		/*
        A[i] = MIN( nums[i] + A[ i + nums[i]], A[i+1])
		 */
		int[] result = new int[ nums.length ];
		result[ nums.length - 1 ] = 0;
		for( int i = 0; i < nums.length - 1; i++ ) {
			result[i] = Integer.MAX_VALUE;
		}


		for( int i = nums.length - 2; i >= 0; i-- ) {
			if( nums[i] == 0 ) {
				continue;
			}

			if( i == 0 ) {
				int test = 0;
			}

			int step = 0;
			while( step < nums[i] ) {
				if( i+ step < nums.length && result[i+ step] != Integer.MAX_VALUE && result[i+ step] < result[i] ) {
					result[i] = result[i+step] + 1;
				}

				step++;
			}




			System.out.println(" I = " + i + " result = " + result[i]);
		}

		return result[0];
	}
}
