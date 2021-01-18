package com.peter12.solution.easy;

public class EASY_0169_MAJORITY_ELEMENT {
	public static int majorityElement(int[] nums) {
		/*
		 * Solution: Boyer-Moore Voting Algorithm
		 * maintain a count, which is incremented whenever we see an instance of our current candidate for majority element and decremented whenever we see anything else.
		 * Whenever count equals 0, we effectively forget about everything in nums up to the current index and consider the current number as the candidate for majority element.
		 * */
		
		int count = 0;
		int result = 0;
		
		for( int i = 0; i < nums.length; i++ ) {
			if ( count == 0 ) {
				result = nums[i];
			}
			
			if( result == nums[i] ) {
				count++;
			} else {
				count--;
			}
		}
		
		return result;
	}
}
