package com.peter12.solution.medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import com.peter12.solution.easy.EASY_0001_TWO_SUM;

public class MEDIUM_0015_3SUM {
	public static List<List<Integer>> threeSum(int[] nums) {

		Arrays.sort(nums);
		
		/*
		 * Solution: https://fizzbuzzed.com/top-interview-questions-1/
		 * 
		 * */
		
		List<List<Integer>> result = new Vector<List<Integer>>();
		
		for( int i = 0; i < nums.length - 2; i++ ) {
			
			if( i > 0 && nums[i-1] == nums[i] ) {//Prevent from duplication
				continue;
			}
			
			int j = i + 1;
			int k = nums.length - 1;
			
			do {
				if(nums[i] + nums[j] + nums[k] > 0 ) {
					k--;
				} 

				if(nums[i] + nums[j] + nums[k] < 0 ) {
					j++;
				}
				
				if( nums[i] + nums[j] + nums[k] ==  0 ) {
					if( j < k ) {
						List<Integer>  r = new Vector<Integer>();
						r.add(nums[i]);
						r.add(nums[j]);
						r.add(nums[k]);
						
						result.add(r);
						
					}
					
					j++;
					
					//Prevent from duplication
					while( j < k && nums[j] == nums[j-1]) {
						j++;
					}
					
					
				}
				
			} while( i < k && j < k);
		}
		
		
		return result;
	}

	
	
}
