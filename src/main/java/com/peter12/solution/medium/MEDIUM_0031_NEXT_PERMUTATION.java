package com.peter12.solution.medium;

public class MEDIUM_0031_NEXT_PERMUTATION {
	public static void nextPermutation(int[] nums) {
		/*
		 * Solution: https://leetcode.com/problems/next-permutation/solution/
		 * */

		//1. Find out a[i] > a[ i - 1] from the right
		int index = 0;
		for( int i = nums.length - 1; i > 0; i-- ) {
			if( nums[i] > nums[i - 1] ) {
				index = i - 1;
				break;
			}
		}

		//2. replace a[i-1] with the next bigger number from its right
		int secondBiggestIndex= findNextBigNumber(index, nums);

		if( secondBiggestIndex != -1 ) {
			int val = nums[ secondBiggestIndex ];
			nums[ secondBiggestIndex ] = nums[index];
			nums[index] = val;
		} else {
			index = -1;
		}


		//3. arrange a[i] to a[length] in descending order

		for( int i = index + 1; i < nums.length; i++ ) {
			for( int j = i; j < nums.length; j++ ) {
				if( nums[i] > nums[j] ) {
					int tmp = nums[j];
					nums[j] = nums[i];
					nums[i] = tmp;
				}
			}
		}

	}

	public static int findNextBigNumber(int index, int[] nums) {

		int[] maxIndex = findNextTwoBig(index, nums);
		//Find the second biggest number
		int result = -1;

		for( int i = maxIndex.length - 1; i >= 0 ; i-- ) {
			if( maxIndex[i] != index) {
				result = maxIndex[i];
				break;
			}
		}

		return result;
	}

	public static int[] findNextTwoBig(int index, int[] nums) {
		int[] result = new int[] { -1, -1 };//[
		int[] max = new int[] { Integer.MAX_VALUE, Integer.MAX_VALUE };
		for( int i = index; i < nums.length; i++ ) {
			int val = nums[i];

			if( val == 4 ) {
				int test = 0;
			}
			if( val > nums[index] ) {
				int k = i;
				for( int j = result.length - 1; j >= 0; j-- ) {
					if( result[j] == -1 ) {
						result[j] = i;
						max[j] = val;
						break;
					} else {
						if( nums[ result[j] ] > val ) { 

							//Swap
							int tmp = max[j];
							max[j] = val;
							val = tmp;

							//SWAP index
							tmp = result[j];
							result[j] = k;
							k = tmp;
						}

					}
			

				}
			}

		}

		return result;
	}
}
