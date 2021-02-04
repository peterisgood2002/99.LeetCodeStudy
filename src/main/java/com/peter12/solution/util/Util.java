package com.peter12.solution.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Util {
	public static boolean equalsForArray(int[][] a, int[][] b) {
		if( a.length != b.length ) {
			return false;
		}
		
		for( int i = 0; i < a.length; i++ ) {
			if( a[i].length != b[i].length ) {
				return false;
			}
			
			for( int j = 0; j < a[i].length; j++ ) {
				if( a[i][j] != b[i][j] ) {
					return false;
				}
			}
			
		}
		
		return true;
	}
	
	public static boolean equalsForArray(int[] a, int[] b ) {
    	if( a.length != b.length) {
    		return false;
    	}
    	
    	for( int i = 0; i < a.length; i++ ) {
    		if( a[i] != b[i] ) {
    			return false;
    		}
    	}
    	
    	return true;
    }
	
	public static boolean  equalsForList( List<List<Integer>> a, List<List<Integer>> b ) {
		if( a.size() != b.size() ) {
			return false;
		}
		
		for( int i = 0; i < a.size(); i++ ) {
			if( !equalForList(a.get(i), b.get(i)) ) {
				return false;
			}
		}
		
		return true;
		
	}
	
	public static boolean equalForList(List<Integer> a, List<Integer> b) {
		if( a.size() != b.size() ) {
			return false;
		}
		
		for( int i = 0; i < a.size(); i++ ) {
			if( a.get(i) != b.get(i) ) {
				return false;
			}
		}
		
		return true;
	}
	
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
}
