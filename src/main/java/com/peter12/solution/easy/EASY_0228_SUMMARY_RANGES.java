package com.peter12.solution.easy;

import java.util.List;
import java.util.Vector;

public class EASY_0228_SUMMARY_RANGES {
	public static List<String> summaryRanges(int[] nums) {
		List<String> result = new Vector<String>();
		
		if(nums.length == 0 ) {
			return result;
		}
		
		int begin = 0;
		int end = 0;
		int incremental = nums[begin];
		for( int i = 0; i < nums.length; i++ ) {
			
			if(nums[i] == incremental++ ) {
				end = i;
			} else {
				//Begin to end is a group
				writeResult(begin, end, nums, result);
				
				begin = i;
				end = i;
				
				incremental = nums[begin] + 1;
				
				
			}
			
			if( i == nums.length - 1 ) {
				writeResult(begin, end, nums, result);
			}
		}
		
		
		return result;
		
	}
	
	public static void writeResult(int begin, int end, int[] nums, List<String> result ) {
		if( begin == end ) {
			result.add( String.valueOf( nums[begin] ) );
		} else {
			result.add( nums[begin] +"->" + nums[end]);
		}
	}
	
	
}
