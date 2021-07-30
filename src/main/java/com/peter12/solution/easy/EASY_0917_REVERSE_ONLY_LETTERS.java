package com.peter12.solution.easy;

public class EASY_0917_REVERSE_ONLY_LETTERS {
	public String reverseOnlyLetters(String s) {
        char[] ch = new char[ s.length() ];
        for( int i = 0; i < ch.length; i++ ) {
            ch[i] = '\0';
        }
        
        for( int i = 0; i < s.length(); i++ ) {
            char c = s.charAt(i);
            
            if( 'a' <= c && c <= 'z' || 'A' <= c && c <= 'Z') {
                continue;
            }
            
            ch[i] = c;
        }
        /*
        for( char c : ch ) {
            if( c != '\0' ) {
                System.out.print( c + " ");
            } else {
                System.out.print( "null ");
            }
            
        } 
        
        System.out.println();
        */
        int j = s.length() - 1;
        for( int i = 0; i < s.length(); i++ ) {
            char c = s.charAt(i);
            if( 'a' <= c && c <= 'z' || 'A' <= c && c <= 'Z') {
                //Find the location in the ch[]
                while( j >= 0 && ch[j] != '\0' ) {
                   j--;
                }
                
                ch[j] = c;
            }
            
        }
        
        return new String( ch );
        
    }
}
