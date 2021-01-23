package com.peter12.solution.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

public class EASY_0350_INTERSECTION_OF_TWO_ARRAYS_II {
	public static int[] intersect(int[] nums1, int[] nums2) {
		int[] smaller = ( nums1.length < nums2.length ) ? nums1: nums2;
		int[] bigger  = ( nums1.length < nums2.length ) ? nums2: nums1;
	
		HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();//<Integer, Count>
		for( int val : bigger) {
			Integer c = count.get(val);
			if( c == null ) {
				c = 0;
			}
			
			count.put(val, ++c);
		}
		
		List<Integer> lr = new Vector<Integer>();
		for( int i = 0; i < smaller.length; i++ ) {
			Integer c = count.get(smaller[i]);
			if( c != null && c != 0 ) {
				lr.add(smaller[i]);
				
				count.put(smaller[i], --c);
			}
		}
		
		int[] result = new int[lr.size()];
		for( int i = 0; i < result.length; i++ ) {
			result[i] = lr.get(i);
		}
		
		return result;
		
	}
}
