package com.peter12.solution.easy;

public class EASY_0278_FIRST_BAD_VERSION {
	
	public static int badVersion = 0;
	public static int firstBadVersion(int n) {
		
		//Binary Search
		boolean bad = true;
		
		double i = 1; 
		double j = n;
		int middle = 0;
		do {
			double m = ( i + j ) / 2;
			middle = (int) m;
			bad = isBadVersion( middle );
			
			
			if( bad ==  false ) {
				
				i = middle + 1;
			} else {
				
				j = middle - 1;
			}
			
		} while(  i <= j);
		
		return (int) i;
		
	}
	
	public static boolean isBadVersion(int version) {
		return version >= badVersion;
	}
}
