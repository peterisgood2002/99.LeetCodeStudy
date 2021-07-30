package com.peter12.solution.easy;

public class EASY_0942_DI_STRING_MATCH {
	public int[] diStringMatch(String s) {
        int n = s.length() + 1;
        
        int[] result = new int[n];
        
        int min = 0;
        int max = n - 1;
        
        for( int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if( ch == 'I' ) {
                result[i] = min++;
            } else {
                result[i] = max--;
            }
        }
        
        result[ s.length() ] = max;
        
        return result;
    }
}
