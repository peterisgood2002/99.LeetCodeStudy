package com.peter12.solution.medium;

import java.util.HashMap;

public class MEDIUM_1248_COUNT_NUMBER_OF_NICE_SUBARRAYS {
	public int numberOfSubarrays(int[] nums, int k) {

		/*
        Solution: https://www.cnblogs.com/cnoodle/p/12742098.html

        2 2 2 1 2 2 1 2 2 2 1
        i           j
        2 2 2 1 2 2 1
          2 2 1 2 2 1
            2 1 2 2 1
              1 2 2 1
        2 2 2 1 2 2 1 2
          2 2 1 2 2 1 2
            2 1 2 2 1 2
              1 2 2 1 2
        2 2 2 1 2 2 1 2 2
          2 2 1 2 2 1 2 2 
            2 1 2 2 1 2 2
              1 2 2 1 2 2
        2 2 2 1 2 2 1 2 2 2
          2 2 1 2 2 1 2 2 2 
            2 1 2 2 1 2 2 2
              1 2 2 1 2 2 2

		 */

		int result = 0;
		int start = 0; int end = 0;
		int count = 0;
		while( end < nums.length ) {
			if( nums[end++] % 2 == 1 ) {
				k--;
				count = 0;// We reserve the count until next odd
			}

			while( k == 0 ) {
				k += nums[start++] % 2;

				count++;
			}

			result += count;
		}

		return result;
	}

	public int slidingWindow( int[] nums, int k ) {
		return numberLessThan( nums, k) - numberLessThan( nums, k - 1);
	}

	public int numberLessThan( int[] nums, int k ) {
		int result = 0;
		int start = 0; int end = 0;
		int odd = 0;

		while( end < nums.length ) {
			odd += nums[end++] % 2 ;

			while( odd > k ) {
				odd -= nums[start++] % 2 ;
			}

			result += end - start + 1;
		} 


		return result;
	}

	public int hashmap( int[] nums, int k) {
		/*
        Solution: https://www.cnblogs.com/cnoodle/p/12742098.html

        SUM(j) - SUM(i) = k
        SUM(i) = SUM(j) - k
		 */

		HashMap<Integer, Integer> stoc = new HashMap<Integer, Integer>();
		stoc.put(0, 1);
		int result = 0;
		int sum = 0;
		for( int j = 0; j < nums.length; j++ ) {
			sum += nums[j] % 2;

			Integer c = stoc.get(sum - k);
			if( c != null ) {
				result += c;
			}

			c = stoc.get(sum);
			if( c == null ) {
				c = 0;
			}

			stoc.put( sum, ++c );
		}

		return result;
	}
}
