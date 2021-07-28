package com.peter12.solution.medium;

import java.util.Stack;

public class MEDIUM_0456_132_PATTERN {
	public boolean find132pattern(int[] nums) {

		/*
        Solution: https://leetcode.com/problems/132-pattern/solution/
		 */

		//1. keep i always the minum
		int[] min_i = new int[ nums.length];

		int min = Integer.MAX_VALUE;
		for( int i = 0; i < nums.length; i++ ) {
			min = Math.min( min, nums[i]);

			min_i[i] = min;
		}

		Stack<Integer> candidateK = new Stack<Integer>();

		for( int j = nums.length - 1; j >= 0 ; j-- ) {
			//Always keep nums[j] > nums[k]

			if( min_i[j] < nums[j] ) {
				System.out.println("========" + nums[j] +"==========");
				//This should be nums[j] or nums[k]
				if( candidateK.isEmpty() || nums[j] < candidateK.peek() ) {
					//nums[j] should be the nums[k] because  nums[j] < nums[k]  violate the criteria: nums[j] > nums[k]

					System.out.println("push to k " + nums[j]);
					candidateK.push( nums[j] );
				} else {
					//OK we find out the candidate nums[j] > nums[k] and try to find out min_i < nums[k]
					while( !candidateK.isEmpty() && nums[j] > candidateK.peek()) {
						int kval = candidateK.pop();
						if( min_i[j] < kval ) {
							return true;
						}
					}

				}

			}



		}

		return false;
	}

	public boolean bruteForece( int[] nums ) {
		int min_i = Integer.MAX_VALUE;// keep this as small as possible
		for( int j = 0; j < nums.length; j++ ) {

			min_i = Math.min( min_i, nums[j] );
			for( int k = j + 1; k < nums.length; k++ ) {
				if( min_i < nums[k] && nums[k] < nums[j] ) {
					return true;
				}
			}

		}

		return false;
	}
}
