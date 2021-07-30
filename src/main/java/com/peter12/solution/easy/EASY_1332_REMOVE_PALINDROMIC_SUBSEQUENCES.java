package com.peter12.solution.easy;

public class EASY_1332_REMOVE_PALINDROMIC_SUBSEQUENCES {
	public int removePalindromeSub(String s) {

		/*
          Solution: https://www.cnblogs.com/cnoodle/p/14505461.html
		 */

		if( s.length() == 0 ) {
			return 0;
		}

		if( isPalindrom(s ) ) {
			return 1;
		} else {
			//Remove 1 charcter and then remove the other
			return 2;
		}

	}

	public boolean isPalindrom( String s ) {
		int i = 0;
		int j = s.length() - 1;

		while( i <= j ) {
			if( s.charAt(i) != s.charAt(j) ) {
				return false;

			}

			i++;
			j--;

		}

		return true;
	}
}
