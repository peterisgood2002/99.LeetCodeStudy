package com.peter12.solution.easy;

import java.util.Arrays;

public class EASY_0455_ASSIGN_COOKIES {
	public static int findContentChildren(int[] g, int[] s) {
		
		/*
		 * Solution:http://www.mazong1123.com/assign-cookie-solution-explanation/
		 * */
		
		Arrays.sort(g);
		Arrays.sort(s);
		
		/**
		 * we can loop the 1st array from last element to the first element, 
		 * check if any matched number exists in the 2nd
		 */
		int result = 0;
		int i = g.length - 1;
		int j = s.length - 1;
		while ( i >= 0 && j >= 0 ) {
			if( s[j] >= g[i] ) {
				result++;
				i--;
				j--;
			} else {
				i--;
			}
			
			
		}
		
		return result;
		
	}
}
