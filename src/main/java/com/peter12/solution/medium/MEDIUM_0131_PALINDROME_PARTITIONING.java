package com.peter12.solution.medium;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.easy.EASY_0125_VALID_PALINDROME;
import com.peter12.solution.util.Util;

public class MEDIUM_0131_PALINDROME_PARTITIONING {
	public static List<List<String>> partition(String s) {
		
		List<List<String>> result = new Vector<List<String>>();
		
		partition(0, s, null, result);
		
		return result;
	}
	
	public static void partition(int begin, String s, List<String> r, List<List<String>> result) {
		
		if( r == null ) {
			r = new Vector<String>();
		}
		
		if(  begin >= s.length() ) {
			result.add(new Vector<String>(r));
			return;
		}
		
		for( int i = begin; i < s.length(); i++ ) {
				
			boolean palindrome = isPalindrome( s, begin, i );
			if( palindrome ) {
				String sub = s.substring(begin, i+1);
				r.add(sub);
				partition( i + 1, s , r, result);
					
				r.remove( r.size() - 1);
			}
				
				
		}
		
	}
	
	public static boolean isPalindrome( String s, int begin, int end ) {
		
		while( begin < end ) {
			if( s.charAt(begin++) != s.charAt(end--) ) {
				return false;
			}
		}
		
		return true;
	}
	
}
