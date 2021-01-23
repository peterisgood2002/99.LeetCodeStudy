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
			
			if( i == 1702766719 || j == 1702766719 ) {
				int test = 0;
			}
			
			if( bad ==  false ) {
				if( i == middle ) {
					return (int) j;
				}
				i = middle;
			} else {
				
				if( j == middle ) {
					return (int) i;
				}
				j = middle;
			}
			
		} while(  i < j);
		
		return middle;
		
	}
	
	public static boolean isBadVersion(int version) {
		return version >= badVersion;
	}
}
