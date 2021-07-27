package com.peter12.solution.easy;

public class EASY_0852_PEAK_INDEX_IN_A_MOUNTAIN_ARRAY {
	public int peakIndexInMountainArray(int[] arr) {

		int begin = 0;
		int end = arr.length - 1;

		while( begin <= end ) {

			int middle = ( begin + end ) / 2;

			if( begin + 1 == end ) {
				if( arr[begin] > arr[end ] ) {
					return begin;
				} else {
					return end;
				}
			}
			if( arr[middle - 1 ] < arr[middle] && arr[middle] > arr[middle + 1 ] ) {
				return middle;
			}

			if( arr[middle - 1 ] < arr[middle] && arr[middle] < arr[middle + 1 ] ) {
				//B     M     E
				//1 2 3 4 5 6 1
				begin = middle + 1;
			}

			if( arr[middle - 1 ] > arr[middle] && arr[middle] > arr[middle + 1 ] ) {
				//B     M     E
				//1 6 5 4 3 2 1
				end = middle - 1;
			}
		}

		return -1;
	}
}
