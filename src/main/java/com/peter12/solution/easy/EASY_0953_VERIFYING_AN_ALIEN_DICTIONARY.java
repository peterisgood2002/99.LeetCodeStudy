package com.peter12.solution.easy;

public class EASY_0953_VERIFYING_AN_ALIEN_DICTIONARY {
	public boolean isAlienSorted(String[] words, String order) {
        int[] seq = new int[26];
        
        for( int i = 0; i < order.length(); i++ ) {
            seq[order.charAt(i) - 'a' ] = i;
        }
        
        for( int i = 0; i < words.length - 1; i++ ) {
            String w1 = words[i];
            String w2 = words[i+1];
            
            boolean lex = lexOrder( w1, w2, seq);
            
            if( lex == false) {
                return false;
            }
        }
        
        return true;
    }
    
    public boolean lexOrder( String w1, String w2, int[] seq ) {
        int size = w1.length() > w2.length() ? w2.length() : w1.length();
            
        for( int j = 0; j < size; j++ ) {
               
            int i1 = seq[ w1.charAt(j) - 'a'];
            int i2 = seq[ w2.charAt(j) - 'a'];
            //System.out.println(" i1 = " + i1 + " i2 = " + i2);
            if( i1 < i2 ) { 
                return true;
            } else if ( i1 > i2 ) {
                return false;
            }
                
                
        }
        
        // they all the same
        if( w1.length() <= w2.length() ) {
            return true;
        } else {
            return false;
        }
        
    }
}
