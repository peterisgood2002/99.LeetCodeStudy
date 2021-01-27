package com.peter12.solution.easy;

public class EASY_0521_LONGEST_UNCOMMON_SUBSEQUENCE_I {
	public static int findLUSlength(String a, String b) {
		/*
		 * Solution: https://leetcode.com/problems/longest-uncommon-subsequence-i/solution/
		 * */
		if(a.equals( b ) ) {
			return -1;
		}
		
		//1. Remove one of character of a
		return Math.max( a.length(), b.length() );
		
	}
}
