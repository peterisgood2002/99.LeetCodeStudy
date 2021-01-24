package com.peter12.solution.easy;

public class EASY_0414_THIRD_MAXIMUM_NUMBER {
	public static int thirdMax(int[] nums) {
		int[] resultIndex = new int[3];
		for( int i = 0; i < resultIndex.length; i++ ) {
			resultIndex[i] = -1;
		}

		for( int i = 0; i < nums.length; i++ ) {

			int val = nums[i];

			setResult(i, val, resultIndex, nums);
		}




		if( resultIndex[2] != -1 ) {
			return  nums[ resultIndex[2] ];
		} else {
			return  nums[ resultIndex[0] ];
		}


	}
	
	public static void setResult( int index, int val, int[] resultIndex, int[] nums ) {
		for( int i = 0; i < resultIndex.length; i++ ) {
			if( resultIndex[i] == -1 ) {
				resultIndex[i] = index;
				return;
			}


			int max = nums[ resultIndex[i] ];
			if( max == val ) {
				return;
			}
			
			//SWAP if necessary
			if( max < val ) {
				int tmp = resultIndex[i];
				resultIndex[i] = index;
				index = tmp;	
			}

		}
	}
}
