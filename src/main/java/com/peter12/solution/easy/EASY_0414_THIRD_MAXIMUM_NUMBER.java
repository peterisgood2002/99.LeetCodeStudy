package com.peter12.solution.easy;

public class EASY_0414_THIRD_MAXIMUM_NUMBER {
	public static int thirdMax(int[] nums) {
		int[] result = new int[3];
		for( int i = 0; i < result.length; i++ ) {
			result[i] = Integer.MIN_VALUE;
		}
	
		for( int val : nums ) {
			
			for( int i = 0; i < result.length; i++ ) {
				if( result[i] == val ) {
					break;
				}
				
				if( result[i] == Integer.MIN_VALUE ) {
					result[i] = val;
					break;
				} else {
					//SWAP if necessary
					if( result[i] < val ) {
						int tmp = result[i];
						result[i] = val;
						val = tmp;	
					}
					
				}
			}
			
			
		}
		
		if( result[2] != Integer.MIN_VALUE ) {
			return result[2];
		} else {
			return result[0];
		}
		
	
	}
}
