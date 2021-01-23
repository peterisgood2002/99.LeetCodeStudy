package com.peter12.solution.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class EASY_0349_INTERSECTION_OF_TWO_ARRAYS {
	public static int[] intersection(int[] nums1, int[] nums2) {
		 Set<Integer> s = new HashSet<Integer>();
			for( int n : nums1) {
				s.add(n);
			}
			
			Set<Integer> resultS = new HashSet<Integer>();
			for( int n : nums2 ) {
				if( s.contains(n) ) {
					resultS.add(n);
				}
			}
			
			int[] result = new int[ resultS.size() ];
			int i = 0;
			for(Integer r : resultS ) {
				result[i++] = r;
			}
			 
			return result;
		
	}
	

}
