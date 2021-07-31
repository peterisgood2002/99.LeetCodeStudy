package com.peter12.solution.easy;

public class EASY_1684_COUNT_THE_NUMBER_OF_CONSISTENT_STRINGS {
	public int countConsistentStrings(String allowed, String[] words) {
        int result = 0;
        
        for( String w : words ) {
            boolean r = true;
            for( int i = 0; i < w.length(); i++ ) {
                String c = w.substring(i, i+1);
                if( !allowed.contains(c) ) {
                    r = false;
                    break;
                }
            }
            
            if( r == true ) {
                result++;
            }
            
        }
        
        return result;
    }
}
