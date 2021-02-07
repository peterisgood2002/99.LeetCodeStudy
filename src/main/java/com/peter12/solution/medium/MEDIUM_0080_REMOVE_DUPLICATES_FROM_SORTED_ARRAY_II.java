package com.peter12.solution.medium;

import com.peter12.solution.util.Util;

public class MEDIUM_0080_REMOVE_DUPLICATES_FROM_SORTED_ARRAY_II {
	public static int removeDuplicates(int[] nums) {
		int result = nums.length;
		int value = nums[ result - 1];
		int endOfValue = result - 1;
		
		for( int i = nums.length - 1; i >= 0 ; i-- ) {
			if( nums[i] == value ) {
				if(  (endOfValue + 1 ) - i > 2 ) {
					/*
					 *            i   e   r
					 *      1 1 1 2 2 2 3 3
					 * SWAP           3 3
					 *            i e   r 
					 * */
					moveLeft(endOfValue, nums);
					
					result--;
					endOfValue--;
				}
			}  else {
				/*
				 *                i   e  r  
				 *      1 1 1 2 2 2 3 3
				 * SWAP           3   2
				 *            i e   r 
				 * */
				 value = nums[i];
				 endOfValue = i;
			}
		}
		
		return result;
	}
	
	public static void moveLeft( int begin, int[] nums ) {
		
		while( begin < nums.length - 1) {
			Util.swap(begin, begin + 1, nums);
			begin++;
		}
	}
}
