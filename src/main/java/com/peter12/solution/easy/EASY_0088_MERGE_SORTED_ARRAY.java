package com.peter12.solution.easy;

public class EASY_0088_MERGE_SORTED_ARRAY {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		
		if( nums2.length == 0 || n == 0 ) {
			return;
		}
		
		int size = m + n;
		
		
		int[] result = new int[size];
		for( int i = 0, n1 = 0, n2 = 0; i < size; i++ ) {
			
			if( n1 >= m ) {
				//Add the rest of nums2
				result[i] = nums2[n2++];
				continue;
			}
			
			if( n2 >= n ) {
				result[i] = nums1[n1++];
				continue;
			}
			
			if( nums1[n1] <= nums2[n2] ) {
				result[i] = nums1[n1++];
			} else {
				result[i] = nums2[n2++];
			}
		}
		
		for( int i = 0; i < nums1.length; i++ ) {
			nums1[i] = result[i];
		}
		
	}
}
