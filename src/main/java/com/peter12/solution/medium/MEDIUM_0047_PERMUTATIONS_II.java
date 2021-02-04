package com.peter12.solution.medium;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.util.Util;

public class MEDIUM_0047_PERMUTATIONS_II {
	public static List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> result = new Vector<List<Integer>>();

		permute(0, nums, result);
		return result;
	}

	public static void permute( int index, int[] nums, List<List<Integer>> result) {

		if( index == nums.length  ) {
			Util.outputResult(nums, result);
			return;
		}

		for( int i = index; i < nums.length; i++ ) {


			//SWAP nums[i] and nums[index]
			Util.swap( i, index, nums);
			permute(index + 1, nums, result);

			//SWAP Back
			Util.swap( i, index, nums);
		}

	}



}
