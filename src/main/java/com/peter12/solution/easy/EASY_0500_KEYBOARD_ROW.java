package com.peter12.solution.easy;

import java.util.List;
import java.util.Vector;

public class EASY_0500_KEYBOARD_ROW {
	
	
	public static String[] findWords(String[] words) {
		
		String[] keyboardRows = new String[] {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
		
		List<String> result = new Vector<String>();
		for( String w : words ) {
			String lowCase = w.toLowerCase();
			String firstC = lowCase.substring(0, 1);
			
			int row = keyboardRows(firstC, keyboardRows);
			
			boolean inThisRows = true;
			for( int i = 1; i < lowCase.length(); i++ ) {
				String c = lowCase.substring(i, i+ 1);
				if( !keyboardRows[row].contains(c) ) {
					inThisRows = false;
				}
			}
			
			if( inThisRows ) {
				result.add(w);
			}
		}
		
		String[] r = new String[ result.size()];
		for( int i = 0; i < r.length; i++ ) {
			r[i] = result.get(i);
		}
		
		return r;
	}
	
	public static int keyboardRows(String c, String[] keyboardRows ) {
		
		for( int i = 0; i < keyboardRows.length; i++ ) {
			if( keyboardRows[i].contains(c) ) {
				return i;
			}
		}
		
		return -1;
	}
	
	
}
