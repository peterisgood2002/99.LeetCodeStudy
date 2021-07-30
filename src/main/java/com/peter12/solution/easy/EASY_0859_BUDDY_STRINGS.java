package com.peter12.solution.easy;

public class EASY_0859_BUDDY_STRINGS {
	public boolean buddyStrings(String s, String goal) {

		/*
		 * Solution: https://leetcode.com/problems/buddy-strings/solution/
		 * */
		if( s.length() != goal.length() ) {
			return false;
		}
		if( s.equals( goal ) ) {
			//If some characters has more than 2 counts, we swap them
			int[] count = new int[26];
			for( char ch : s.toCharArray() ) {
				count[ ch - 'a'] ++;
			}

			for( int c : count ) {
				if( c > 1 ) {
					return true;
				}
			}

			return false;
		}


		String diffS = "";
		String diffG = "";

		for( int i = 0; i < s.length(); i++ ) {
			if( s.charAt(i) != goal.charAt(i) ) {
				diffS += s.charAt(i);
				diffG += goal.charAt(i);
			}
		}

		System.out.println(" diffS = " + diffS + " diffG = " + diffG);


		if( diffS.length() == 2 ) {

			if( diffS.charAt(0) == diffG.charAt(1) && diffS.charAt(1) == diffG.charAt(0) ) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;

		}

	}
}
