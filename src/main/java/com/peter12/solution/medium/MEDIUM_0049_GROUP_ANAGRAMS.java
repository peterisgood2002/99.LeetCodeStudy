package com.peter12.solution.medium;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Vector;

public class MEDIUM_0049_GROUP_ANAGRAMS {
	public static List<List<String>> groupAnagrams(String[] strs) {
		
		HashMap<HashMap<Character, Integer>, List<String> > result = new HashMap<HashMap<Character, Integer>, List<String> >();
		
		for( String s : strs ) {
			HashMap<Character, Integer> key = groupByCharacter(s);
			
			List<String> r = result.get(key);
			if( r == null ) {
				r = new Vector<String>();
				result.put(key, r);
			}
			
			r.add(s);
		}
		
		List<List<String>> lr = new Vector<List<String>>();
		for( Entry< HashMap<Character, Integer>, List<String> > e : result.entrySet()) {
			lr.add( e.getValue() );
		}
		
		return lr;
	}
	
	public static HashMap<Character, Integer> groupByCharacter( String s ) {
		HashMap<Character, Integer> result = new HashMap<Character, Integer>();
		
		for( int i = 0; i < s.length(); i++ ) {
			char c = s.charAt(i);
			
			Integer count = result.get(c);
			if( count == null ) {
				count = 0;
				
			}
			
			result.put( c, ++count );

		}
		
		
		return result;
	}
}
