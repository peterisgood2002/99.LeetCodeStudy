package com.peter12.solution.easy;

public class EASY_0852_PEAK_INDEX_IN_A_MOUNTAIN_ARRAY {
	public int peakIndexInMountainArray(int[] arr) {

		int begin = 0;
        int end = arr.length - 1;
        
        while( begin <= end ) {
            
            int middle = ( begin + end ) / 2;
            
            if( arr[middle] < arr[middle + 1 ] ) {
                begin = middle + 1;
            } else {
                end = middle;
            }
        }
        
        return begin;
	}
}
