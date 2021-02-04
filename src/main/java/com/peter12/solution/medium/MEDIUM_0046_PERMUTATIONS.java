package com.peter12.solution.medium;

import java.util.List;
import java.util.Vector;

public class MEDIUM_0046_PERMUTATIONS {
	public static List<List<Integer>> permute(int[] nums) {

		List<List<Integer>> result = new Vector<List<Integer>>();

		permute(0, nums, result);
		return result;
	}

	public static void permute( int index, int[] nums, List<List<Integer>> result) {
		
		if( index == nums.length  ) {
			outputResult(nums, result);
			return;
		}

		for( int i = index; i < nums.length; i++ ) {
			if( index == 0 ) {
				int test = 0;
			}
			//SWAP nums[i] and nums[index]
			swap( i, index, nums);
			permute(index + 1, nums, result);

			//SWAP Back
			swap( i, index, nums);
			
			
		}


	}

	public static void outputResult(int[] nums, List<List<Integer>> result) {

		List<Integer> data = new Vector<Integer>();

		for(Integer v : nums ) {
			data.add(v);

		}

		result.add(data);
	}



	public static void swap( int i, int j, int[] nums ) {
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}
}
