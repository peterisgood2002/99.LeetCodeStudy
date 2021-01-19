package com.peter12.solution.easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Vector;

public class EASY_0205_ISOMORPHIC_STRINGS {
	public static boolean isIsomorphic(String s, String t) {
		HashMap<String, Integer> cs = countCharacter(s);
		HashMap<String, Integer> ct = countCharacter(t);
		
		HashMap<Integer, List<String>> revertCt = new HashMap<Integer, List<String>>();
		
		for( Entry<String, Integer> entry : ct.entrySet()) {
			int count = entry.getValue();
			List<String> d = revertCt.get( count );
			if( d == null ) {
				d = new Vector<String>();
				revertCt.put(count, d);
			}
			
			d.add( entry.getKey() );
		}
		
		for( Entry<String, Integer> entry : cs.entrySet()) {
			int count = entry.getValue();
			
			List<String> replaceC = revertCt.get(count);
			if( replaceC == null || replaceC.size() == 0) {
				return false;
			}
			
			replaceC.remove(0);
			
		}
		
		return true;
	}
	
	public static HashMap<String, Integer> countCharacter(String s ) {
		
		HashMap<String, Integer> result = new HashMap<String, Integer>();
		for( int i = 0; i < s.length(); i++ )  {
			String c = s.substring(i,  i + 1);
			
			Integer count = result.get(c);
			
			if( count == null ) {
				count = 1;
			} else {
				count++;
			}
			
			result.put(c, count);
			
		}
		
		return result;
	}
}
