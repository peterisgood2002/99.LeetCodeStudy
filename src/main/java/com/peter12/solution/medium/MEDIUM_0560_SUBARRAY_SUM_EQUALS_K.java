package com.peter12.solution.medium;

import java.util.HashMap;

public class MEDIUM_0560_SUBARRAY_SUM_EQUALS_K {
	public int subarraySum(int[] nums, int k) {

		/*
        Solution: https://leetcode.com/problems/subarray-sum-equals-k/solution/
        SUM(j) - SUM(i) = k

        SUM(i) = SUM(j) - k
		 */
		HashMap<Integer, Integer> sumToCount = new HashMap<Integer, Integer>(); 
		sumToCount.put(0, 1);
		int result = 0;

		int total = 0;
		for( int j = 0; j < nums.length; j++ ) {
			total += nums[j];

			Integer count = sumToCount.get( total - k );

			if( count != null) {

				result += count;
			}

			count = sumToCount.get( total );
			if( count == null ) {
				count = 0;
			}

			sumToCount.put(total, ++count);

		}


		return result;
	}
}
