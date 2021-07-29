package com.peter12.solution.easy;

import java.util.HashMap;

public class EASY_0771_JEWELS_AND_STONES {
	public int numJewelsInStones(String jewels, String stones) {

		HashMap<Character,Integer> count = new HashMap<Character,Integer>();
		for( char ch : jewels.toCharArray() ) {
			Integer c = count.get(ch);
			if( c == null ) {
				c = 0;
			}

			c++;
			count.put( ch, c);
		}

		int result = 0;
		for( char ch : stones.toCharArray() ) {
			Integer c = count.get(ch);
			if( c != null ) {
				result++;
			}
		}

		return result;
	}
}
