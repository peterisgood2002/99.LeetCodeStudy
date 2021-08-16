package com.peter12.solution.easy;

public class EASY_1957_DELETE_CHARACTERS_TO_MAKE_FANCY_STRING {
	public String makeFancyString(String s) {
		if( s.length() < 3 ) {
            return s;
        }
        
        StringBuilder result = new StringBuilder();
        int i = 0;
        while( i < s.length() ) {
            
            int j = i;
            while( j < s.length() && s.charAt(i) == s.charAt(j) ) {
                j++;
            }
            
            if( j - i >= 3 ) {
                result.append( s.substring(i, i + 2) );
            } else {
                result.append( s.substring(i, j) );
            }
            
            i = j;
        }
         
        return result.toString();
    }
}
