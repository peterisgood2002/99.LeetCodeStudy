package com.peter12.solution.easy;

public class EASY_0167_TWO_SUM_II_INPUT_ARRAY_IS_SORTED {
	public static int[] twoSum(int[] numbers, int target) {

		int i = 0; 
		int j = numbers.length - 1;
		
		do {
			
			
			if( numbers[i] + numbers[j]  == target ) {
				return new int[] { i+1, j+1 };//Your returned answers (both index1 and index2) are not zero-based.
			}
			
			int remain = target - numbers[i];
			
			if( remain > numbers[j] ) {
				//we should increment i because the statement: a[i] + a[j] < target is always true   
				i++;
			}
			
			while( remain < numbers[j] && i < j) {
				j--;// We move j because the statement a[i] + a[j] > target is always true
			}
			
			int t = 0;
		} while( i < j);
		
		return new int[2];
	}
}
