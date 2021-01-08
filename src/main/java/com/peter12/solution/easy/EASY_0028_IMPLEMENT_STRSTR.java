package com.peter12.solution.easy;

public class EASY_0028_IMPLEMENT_STRSTR {
	
	public static int strStr(String haystack, String needle) {
		
		
		if(haystack.length() == 0 && needle.length() == 0 ) {
			return 0;
		}
		
		if(haystack.length() < needle.length() ) {
			return -1;
		}
		
		int needleSize = needle.length();
		
		for( int i = 0; i < haystack.length() - needleSize; i += needleSize) {
			String sub = haystack.substring(i, i + needleSize  );
			
			if(sub.equals(needle)) {
				return i;
			}
		}
		
		return -1;
	}
}
