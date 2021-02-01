package com.peter12.solution.medium;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class MEDIUM_0018_4SUM {
	public static List<List<Integer>> fourSum(int[] nums, int target) {
		
		Arrays.sort(nums);
		
		int[] index = new int[4];
		List<List<Integer>> result = new Vector<List<Integer>>();
		kSum(target, 0, 0, index, nums, result);
		
		return result;
		
	}
	
	public static  void kSum(int target, int begin, int k, 
			int[] index, int[] nums,
			List<List<Integer>> result) {
		if( index.length - k  == 2 ) {
			twoSum(target, begin, nums,index, result);
			
			return ;
		}
		
		while( begin < nums.length - 2) {
			index[k] = begin;
			
			kSum(target, ++begin, k+1, index, nums, result );
			
			//Prevent from duplication
			while( begin < nums.length - 2 && nums[begin-1] == nums[begin] ) {
				begin++;
			}
		}
	}
	
	public static void twoSum(int target, int begin, int[] nums, int[] index, List<List<Integer>> result) {
		
		int size = index.length - 1;
		int end = nums.length - 1;
		while( begin < end ) {
			index[size - 1] = begin;
			index[size] = end;
			int total = sum(index, nums);
			
			if( total == target  ) {
				getIntegers(nums, index, result);
				
				begin++;
				
				//Prevent from duplication
				while( begin < end && nums[begin-1] == nums[begin] ) {
					begin++;
				}
			}
			
			if( total > target ) {
				end--;
			}
			
			 if( total < target ) {
				 begin++;
			 }
		}
	}
	
	public static int sum(int[] index, int[] nums ) {
		int result = 0;
		
		for( int i : index) {
			result += nums[ i ];
			
		}
		
		return result;
			
			
	}
	
	public static void getIntegers(int[] nums, int[] index, List<List<Integer>> result) {
		List<Integer> r = new Vector<Integer>();
		
		for( int i : index ) {
			r.add( nums[i] );
		}
		
		result.add(r);
	}
}
