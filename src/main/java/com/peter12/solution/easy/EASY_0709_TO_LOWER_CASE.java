package com.peter12.solution.easy;

public class EASY_0709_TO_LOWER_CASE {
	public String toLowerCase(String s) {
		char[] ch = s.toCharArray();

		for(int i = 0; i < ch.length; i++ ) {

			if( 'A' <= ch[i] && ch[i] <= 'Z') {
				ch[i] = (char) (ch[i] - 'A' + 'a' );
			}

		}

		return new String(ch);
	}
}
