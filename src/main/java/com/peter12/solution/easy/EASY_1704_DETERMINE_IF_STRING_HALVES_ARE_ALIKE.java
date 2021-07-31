package com.peter12.solution.easy;

import java.util.ArrayList;
import java.util.List;

public class EASY_1704_DETERMINE_IF_STRING_HALVES_ARE_ALIKE {
	public boolean halvesAreAlike(String s) {
		s = s.toLowerCase();
		String sub1 = s.substring(0, s.length() / 2 );

		String sub2 = s.substring( s.length() / 2 );

		System.out.println("sub1 = " + sub1 + " sub2 = " + sub2);
		List<Character> vowel = new ArrayList<Character>();
		vowel.add('a');
		vowel.add('e');
		vowel.add('i');
		vowel.add('o');
		vowel.add('u');

		int vc1 = 0;
		for( char ch : sub1.toCharArray() ) {
			if( vowel.contains(ch) ) {
				vc1++;
			}
		}

		int vc2 = 0;
		for( char ch : sub2.toCharArray() ) {
			if( vowel.contains(ch) ) {
				vc2++;
			}
		}

		return vc1 == vc2;

	}
}
