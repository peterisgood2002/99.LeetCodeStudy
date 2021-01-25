package com.peter12.solution.easy;

public class EASY_0482_LICENSE_KEY_FORMATTING {
	public static String licenseKeyFormatting(String S, int K) {
		
		//1. Upper
		String data = S.toUpperCase();
		
		//3. Replace
		data = data.replace("-", "");
		
		String result = "";
		
		int i = data.length();
		while( i > 0 ) {
			int begin = i - K;
			if( begin < 0 ) {
				begin = 0;
			}
			
			String r = data.substring(begin, i);
			
			result = "-"+ r  + result;
			
			i -= K;
		}
		
		if(result.length() > 0 ) {
			return result.substring(1);
		} else {
			return result;
		}
		
	}
}
