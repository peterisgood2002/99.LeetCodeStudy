package com.peter12.solution.medium;

public class MEDIUM_0071_SIMPLIFY_PATH {
	public static String simplifyPath(String path) {
		
		String result ="";
		
		String[] split = path.split("/");
	
		for( String s: split) {
			result = operate(s, result);
		}
		return result;
	}
	
	public static String operate(String s, String result) {
		if( s.length() == 0 ) {
			return result;
		}
		
		if( ".".equals(s)) {
			return result;
		}
		
		if( "..".equals(s) || "...".equals(s) ) {
			if( result.length() == 0 ) {
				return result;
			}
			
			
			//Remove to parent directory
			int last = result.lastIndexOf('/');
			if( last  >= 0 ) {
				return result.substring(0, last);
			} else {
				return "/";
			}
			
		}
		
		return result + "/" + s;
	}
}
