package com.peter12.solution.medium;

public class MEDIUM_0034_FIND_FIRST_AND_LAST_POSITION_OF_ELEMENT_IN_SORTED_ARRAY {
	public static int[] searchRange(int[] nums, int target) {


		int begin = 0;
		int end = nums.length - 1;

		int index = -1;
		while( begin <= end ) {
			double m = ( begin + end ) / 2;
			int middle = (int) m;

			if( nums[middle] == target ) {
				index = middle;
				break;
			}

			if( nums[middle] > target ) {
				end = middle - 1;
			}

			if( nums[middle] < target ) {
				begin = middle + 1;
			}
		} 

		if( index == -1 ) {
			return new int[] { -1, -1 };
		} else {

			/*
			 * Grows from index
			 * begin -- index -- end
			 */
			begin = index;
			while( begin >= 0 && nums[begin] == nums[index] ) {
				begin--;
			}


			end = index;
			while( end < nums.length &&  nums[end] == nums[index] ) {
				end++;
			}



			return  new int[] {begin + 1 , end - 1};


		}
	}
}
