package com.peter12.solution.medium;

import java.util.List;
import java.util.Vector;

public class MEDIUM_0093_RESTORE_IP_ADDRESSES {
	public static List<String> restoreIpAddresses(String s) {
		
		List<String> result = new Vector<String>();
		
		if( s.length() == 0 ) {
			return result;
		}
		
		List<Integer> r = new Vector<Integer>();
		char c = s.charAt(0);
		
		if( c == '0' ) {
			r.add(0);
			restoreIpAddresses(r, s.substring(1), result);
		} else {
			restoreIpAddresses(r, s, result);
		}
		
		return checkResult(result, s);
	}
	
	public static List<String> checkResult( List<String> data, String s ) {
		List<String> result = new Vector<String>();
		
		for( String d : data) {
			//The length of our result should the same as the original string
			String t = d.replace(".", "");
			
			if( s.length() == t.length() ) {
				result.add(d);
			}
		}
		
		return result;
	}
	
	public static void restoreIpAddresses(List<Integer> r, String s, List<String> result ) {
		
		if( s.length() == 0) {
			
			if( r.size() == 4 ) {
				String ip = "";
				for( int v : r ) {
					ip += v +".";
				}
				ip = ip.substring(0, ip.length() - 1);//0.0.0.0.
				result.add(ip);
			}
			
			return;
		}
		
		if( r.size() > 4 ) {
			//IP should only have 4 integer
			return;
		}
		
		
		int size = ( s.length() >= 3) ? 3 : s.length();
		for( int i = 1; i <= size; i++ ) {
			
			String sub = s.substring(0, i);
			int val = Integer.parseInt(sub);
			if( 0 <= val && val <= 255 ) {
				
				
				r.add(val);
				
				restoreIpAddresses( r, s.substring(i), result);
				
				r.remove( r.size()- 1);
			
			}
			
		}
		
	}
}
