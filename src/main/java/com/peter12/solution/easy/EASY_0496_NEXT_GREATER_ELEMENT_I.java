package com.peter12.solution.easy;

public class EASY_0496_NEXT_GREATER_ELEMENT_I {
	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

		int[] result = new int[nums1.length];
		for( int i = 0; i < nums1.length; i++ ) {
			
			int max = nums1[i];
			//Find index of nums2
			int j = 0;
			while( j < nums2.length && nums2[j] != max) j++;
			
			while(  j < nums2.length ) {
				if( max < nums2[j] ) {
					max = nums2[j];
					break;
				}
				
				j++;
			}
			
			if( j == nums2.length) {
				result[i] = -1;
			} else {
				result[i] = max;
			}
		}
		
		return result;

		
	}
	
	
}
