package com.peter12.solution;


import java.util.Arrays;
import java.util.HashMap;


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

		// T = a + b
		HashMap<Integer, Integer> remainToIndex = new HashMap<Integer, Integer> ();
		
		
		
		for( int i = 0; i < nums.length; i++ ) {
			Integer nextIndex = remainToIndex.get(nums[i]);
			if( nextIndex != null ) {
				int [] result = new int[] {i , nextIndex};
				Arrays.sort(result);
				
				return result;
			} 
			
			remainToIndex.put(target - nums[i], i);
			
			
		}
		
		return  new int[2];
	}

	

}
