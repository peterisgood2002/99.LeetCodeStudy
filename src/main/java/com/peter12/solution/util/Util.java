package com.peter12.solution.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Util {
	
	
	public static HashMap<String, Integer> groupByCharacter(String s) {
		HashMap<String, Integer> count = new HashMap<String, Integer>();
		
		for( int i = 0; i < s.length(); i++ ) {
			String ch = s.substring(i, i+1);
			Integer c = count.get(ch);
			
			if( c == null ) {
				c = 0;
			}
			
			count.put(ch, ++c);
		}
		
		return count;
	}
	
	public static void reverse(int begin, int end, char[] s) {
		int middle = (begin + end) / 2;
		
		for( int i = begin, j = end - 1; i < middle; i++, j--) {
			char tmp = s[i];
			s[i] = s[j];
			s[j] = tmp;
		}
	}
	
	public static Set<Integer> getDivisor(int num) {
		int size = num / 2;
		
		Set<Integer> result  = new HashSet<Integer>();
		for( int i = 1; i <= size; i++ ) {
			if( num % i == 0 ) {
				result.add(i);
				
				result.add( num / i);
				
			}
		}
		
		return result;
	}
	
	public static void outputResult(int[] nums, List<List<Integer>> result) {

		List<Integer> data = new Vector<Integer>();

		for(Integer v : nums ) {
			data.add(v);

		}

		if( !result.contains(data ) ) {
			result.add(data);
		}
		
	}



	public static void swap( int i, int j, int[] nums ) {
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}
	
	public static int[][] outputResult( List<int[]> data ) {
		int [][] result = new int[ data.size()][];
		for( int i = 0; i < data.size(); i++ ) {
			result[i] = data.get(i);
		}
		return result;
	}
	
	public static void sortedByTheFirstElement(int[][] intervals ) {
		for( int i = 0; i < intervals.length; i++ ) {
			for( int j = i; j < intervals.length; j++ ) {
				if(intervals[i][0] > intervals[j][0] ) {
					int[] tmp = intervals[i];
					intervals[i] = intervals[j];
					intervals[j] = tmp;
				}
			}
		}
	}
}
