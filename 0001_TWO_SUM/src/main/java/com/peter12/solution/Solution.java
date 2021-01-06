package com.peter12.solution;


import java.util.List;
import java.util.Vector;

/**
 * Hello world!
 *
 */
public class Solution 
{
	public static void main( String[] args )
	{
		System.out.println( "Hello World!" );
	}

	public static int[] twoSum(int[] nums, int target) {

		//1. Initialize 
		boolean [] select = new boolean[nums.length];
		for( int i = 0 ; i < nums.length; i++ ) {

			select[i] = false;
		}
		
		//if target is negative, we need to revert all nums in case stack overflow
		if( target < 0 ) {
			for( int i = 0; i < nums.length; i++ ) {
				nums[i] = - nums[i];
			}
			
			target = - target;
		}

		return getResult(select, nums, target);

	}

	public static int[] getResult(boolean[] select, int[] nums, int target) {
		if( target == 0 && !hasMinusNumber(select, nums)) {
			return getResult(select, nums);
		}

		int biggest = getBiggest(select, nums, target);
		

		return getResult(select, nums, target - biggest);
	}
	
	public static boolean hasMinusNumber(boolean[] select, int[] nums) {
		
		boolean result = false;
		
		for( int i = 0; i < nums.length; i++ ) {
			if( !select[i] && nums[i] < 0 ) {
				result = true;
			}
		}
		
		return result;
	}

	public static int getBiggest(boolean[] select, int[] nums, int target) {
		//1. Obtain the biggest number that is smaller than target and is not selected
		int number = Integer.MIN_VALUE;
		int index = -1;
		for( int i = 0; i < select.length; i++ ) {
			if( select[i] == false && nums[i] <= target && number < nums[i] || nums[i] <= 0 ) {
				number = nums[i];
				index = i;

			}
		}
		
		if( index >= 0 ) {
			select[index] = true;
			return nums[index];
		} else {
			return 0;
		}
		
	}

	public static int[] getResult(boolean[] select, int[] nums) {

		List<Integer> r = new Vector<Integer>(); 
		for( int i = 0; i < select.length; i++) {
			if( select[i] == true || nums[i] == 0) {
				r.add(i);
			}
		}

		int[] result = new int[r.size()];
		int i = 0;
		for( Integer index : r ) {
			result[i++] = index;
		}

		return result;
	}


}
