package com.peter12.solution.easy;

public class EASY_1576_REPLACE_ALL_TO_AVOID_CONSECUTIVE_REPEATING_CHARACTERS {
	public String modifyString(String s) {
        
        char[] ch = s.toCharArray();
        
        for( int i = 0; i < ch.length; i++ ) {
            if( ch[i] == '?') {
                char left = ( i - 1 >= 0) ? ch[i-1]: '\0';
                char right = ( i + 1 < ch.length ) ? ch[i+1] : '\0';
                
                ch[i] = 'a';
                while( ch[i] == left || ch[i] == right ) {
                    ch[i]++;
                }
                
                System.out.println( " i = " + i + " C = " + ch[i] );
                
            }
        }
        
        return new String(ch);
    }
}
