package com.peter12.solution.medium;

import java.util.List;

public class MEDIUM_0139_WORD_BREAK {
	public static boolean wordBreak(String s, List<String> wordDict) {
		
		/*
        https://www.youtube.com/watch?v=Sx9NNgInc3A
		 */
		boolean[] result = new boolean[ s.length() + 1 ];
        result[0] = true;
        
        for( int i = 1; i < s.length(); i++ ) {
            for( int j = 0; j < i; j++ ) {
                String sub = s.substring(j ,i );
                
                if( result[j] && wordDict.contains( sub ) ) {
                    result[i] = true;
                    break;
                }
            }
        }
        
        return result[ result.length - 1];
	}


}
