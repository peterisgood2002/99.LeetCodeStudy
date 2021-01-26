package com.peter12.solution.easy;

import java.util.List;
import java.util.Vector;

public class EASY_0448_FIND_ALL_NUMBERS_DISAPPEARED_IN_AN_ARRAY {
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		/*
		 * We depict our algorithm as following:
		 *    index    1, 2, 3, 4, 5, 6, 7, 8
		 *    nums     4, 3, 2, 7, 8, 2, 3, 1
		 *    
		 * 1. We calculate the difference between  nums[index] and index
		 *    index    1, 2, 3, 4, 5, 6, 7, 8
		 *    nums     4, 3, 2, 7, 8, 2, 3, 1
		 *    diff     3
		 * 2. If the difference > 0, we swap nums[index] and nums[index + 1]
		 *    index    1, 2, 3, 4, 5, 6, 7, 8
		 *    nums     7, 3, 2, 4, 8, 2, 3, 1
		 *    diff     3 
		 * 3. If nums[index] is equals to nums[index + diff], we compare the next item
		 *    index    1, 2, 3, 4, 5, 6, 7, 8
		 *    nums     3, 2, 3, 4, 8, 2, 7, 1
		 *    diff     3 
		 * 4. If the difference < 0, This is what we want
		 *    index    1, 2, 3, 4, 5, 6, 7, 8
		 *    nums     3, 2, 3, 4, 1, 2, 7, 8
		 *    diff     3, 2, 3, 4, -4
		 * */
		
		List<Integer> result = new Vector<Integer>();
		
		int index = 1;
		int i = 0;
		while( i < nums.length ) {
			int diff = nums[i] - index;
			if( diff > 0 && nums[i] != nums[ i + diff ]) {
				//SWAP nums[i + diff] and nums[i]
				int tmp = nums[i];
				nums[i] = nums[ i + diff ];
				nums[ i + diff ] = tmp;
			} else 	{
				if( diff < 0 ) {
					result.add(index);
				}
				
				index++;
				i++;
			}
		
		}
		
		
		return result;
		
	}
}
