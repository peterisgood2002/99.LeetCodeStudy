package com.peter12.solution.medium;

import java.util.ArrayList;
import java.util.List;

public class MEDIUM_0658_FIND_K_CLOSEST_ELEMENTS {
	public List<Integer> findClosestElements(int[] arr, int k, int x) {

		/*
            Solution: https://www.programmersought.com/article/57453994883/
            We find out the index s which makes both s and s+k have almost the same difference to x   
            that is arr[s] - x ~ arr[s+k] - x we need to delete n - k elements

                   1  2 3 4 5 x = 3
           a - x  -2 -1 0 1 2
                   B      E ==> notice that M is the left side of 0 and diffM is negative 
		 */
		int begin = 0;
		int end = arr.length - 1;
		int delete = arr.length - k;

		while( delete > 0 ) {
			if( x - arr[begin] > arr[end] - x ) {
				//we need to move left
				begin++;
			} else {
				end--;
			}

			delete--;
		}


		List<Integer> result = new ArrayList<Integer>();
		for( int i = begin; i < begin + k; i++ ) {
			result.add( arr[i]);
		}


		return result;
	}
}
