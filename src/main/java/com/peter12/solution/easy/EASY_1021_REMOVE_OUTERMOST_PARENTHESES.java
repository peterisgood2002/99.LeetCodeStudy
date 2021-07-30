package com.peter12.solution.easy;

public class EASY_1021_REMOVE_OUTERMOST_PARENTHESES {
	public String removeOuterParentheses(String s) {
        //Find ((  and   ))
        
        String result = "";
        int begin = 0;
        int count = 0;// Count all parenthesis count = 0 means that this substring between begin and end is valid
        for( int end = begin; end < s.length(); end++ ) {
            
            if( s.charAt(end) == '(' ) {
                count++;
            } else if ( s.charAt(end) == ')') {
                count--;
            }
            
            if( count == 0 ) {
                System.out.println( " begin = "+ begin + " end = " + end + " sub = " + s.substring( begin + 1, end) );
                result += s.substring( begin + 1, end);
                
                begin = end + 1;
            }
        }
         
        
        return result;
    }
}
