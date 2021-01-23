package com.peter12.solution.easy;

import java.util.HashMap;

public class EASY_0383_RANSOM_NOTE {
	public static boolean canConstruct(String ransomNote, String magazine) {

		HashMap<String, Integer> count = new HashMap<String, Integer>();
		
		for( int i = 0; i < magazine.length(); i++ ) {
			String ch = magazine.substring(i,  i + 1 );
			
			Integer c = count.get(ch);
			if( c == null ) {
				c = 0;
			}
			
			count.put(ch, ++c);
		}
		
		for(int i = 0; i < ransomNote.length(); i++ ) {
			String ch = ransomNote.substring( i, i + 1 );
			Integer c = count.get(ch);
			
			if( c == null || c == 0 ) {
				return false;
			}
			
			count.put(ch, --c);
		}
		
		return true;
	}
}
