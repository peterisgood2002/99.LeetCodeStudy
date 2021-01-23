package com.peter12.solution.easy;

public class EASY_0278_FIRST_BAD_VERSION {
	public static int firstBadVersion(int n) {
		
		//Binary Search
		boolean bad = true;
		
		int i = 1; 
		int j = n;
		
		do {
			
			int middle = ( i + j ) / 2;
			bad = isBadVersion( middle );
			
			if( bad ==  false ) {
				if( i == middle ) {
					return j;
				}
				i = middle;
			} else {
				j = middle;
			}
			
		} while(  i < j);
		
		return i;
		
	}
	
	public static boolean isBadVersion(int version) {
		return version >= 4;
	}
}
