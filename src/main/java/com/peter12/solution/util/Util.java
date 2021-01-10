package com.peter12.solution.util;

import java.util.List;

public class Util {
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
}
