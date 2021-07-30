package com.peter12.solution.easy;

public class EASY_1446_CONSECUTIVE_CHARACTERS {
	public int maxPower(String s) {

		int result = 0;
		int begin = 0;

		while( begin < s.length() ) {
			int end = begin;
			while( end < s.length() && s.charAt(begin) == s.charAt(end ) ) {
				end++;
			}

			//System.out.println(" begin = " + begin +" end = " + end);
			result = Math.max( result, end - begin);

			begin = end;
		}

		return result;
	}
}
