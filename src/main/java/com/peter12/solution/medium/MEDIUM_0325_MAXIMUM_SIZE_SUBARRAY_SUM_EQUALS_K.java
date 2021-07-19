package com.peter12.solution.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

/*
 * Problem:
Given an array nums and a target value k, find the maximum length of a subarray that sums to k. If there isn't one, return 0 instead.

Note: The sum of the entire nums array is guaranteed to fit within the 32-bit signed integer range.

Example 1: Given nums = [1, -1, 5, -2, 3], k = 3, return 4. (because the subarray [1, -1, 5, -2] sums to 3 and is the longest)

Example 2: Given nums = [-2, -1, 2, 1], k = 1, return 2. (because the subarray [-1, 2] sums to 1 and is the longest)

Follow Up: Can you do it in O(n) time?
 * */
public class MEDIUM_0325_MAXIMUM_SIZE_SUBARRAY_SUM_EQUALS_K {
	public static int maxLength( int[] a, int k ) {
		/*
		 * Solution: https://www.programcreek.com/2014/10/leetcode-maximum-size-subarray-sum-equals-k-java/
		 * 
		 * ---------------------
		 *        i            j
		 *      SUM(i)       SUM(j)
		 *        |------k ----|
		 * Sum(i) + k = Sum(j)
		 * 
		 *  Sum(i) = Sum(j) - k
		 * */
		
		HashMap<Integer, Integer> sumIndex = new HashMap<Integer, Integer>();//<SUM, i>
		sumIndex.put(0, -1);
		int result = 0;
		int sum = 0;
		for( int j = 0; j < a.length; j++ ) {
			sum += a[j];
			
			Integer i = sumIndex.get( sum - k );
			if( i != null ) {
				if( result < j - i) {
					result = j - i;
				}
			}
			//If there is an element in this sumIndex, 
			//it means we put it before index j and do not put it into sumIndex since we need to get max length 
			sumIndex.putIfAbsent(sum, j);
			
				
		}
		
		
		return result;
		
	}
	
	public static int getMaxLengthCloseTo( int[] a, int k ) {
		/*
		 * SUM(j) - SUM(i) <= k
		 * SUM(j) - k <= SUM(i)
		 * */
		
		TreeSet<Integer> sumi = new TreeSet<Integer>();
		
		int result = 0;
		int sum = 0;
		for( int j = 0; j < a.length; j++ ) {
			sum += a[j];
			
			Integer i = sumi.ceiling( sum - k );
			if( i != null ) {
				if( result < j - i ) {
					result = j - i;
				}
			}
			
			sumi.add(sum);
			
		}
		
		return result;
	}
}
