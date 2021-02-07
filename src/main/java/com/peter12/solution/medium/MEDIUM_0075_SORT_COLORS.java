package com.peter12.solution.medium;

import com.peter12.solution.util.Util;

public class MEDIUM_0075_SORT_COLORS {
	public static void sortColors(int[] nums) {
		
		/*
		 * Solution: https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/
		 * 
		 * 0 - endloc0 - i - beginloc2 - length
		 * 0 0    0    1 ? ?    2      2   2
		 * */
		int endloc0 = 0;
		int beginloc2 = nums.length - 1;
		
		
		int i = 0;
		while( i <= beginloc2 ) {
			
			if( nums[i] == 2 ) {
				Util.swap(i, beginloc2, nums);
				beginloc2--;
		
			} else if( nums[i] == 0 ) {
				Util.swap(i, endloc0, nums);
		
				endloc0++;
				i++;
			} else if(  nums[i] == 1 ) {
				i++;	
				
			}		
			
		}
	}
}
