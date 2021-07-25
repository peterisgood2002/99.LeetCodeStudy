package com.peter12.solution.medium;

import java.util.HashMap;

public class MEDIUM_1371_FIND_THE_LONGEST_SUBSTRING_CONTAINING_VOWELS_IN_COUNTS {
public int findTheLongestSubstring(String s) {
        
        /*
           e   l  e  e  t
           2   2  0 34 32
        
        */
        
        HashMap<Integer, Integer> maskToIndex = new HashMap<Integer, Integer>();
        maskToIndex.put(0, -1);
        int result = 0;
        int mask = 0;
                
        for( int i = 0; i < s.length(); i++ ) {
            char ch = s.charAt(i);
            
            int bit = getBit(ch);
            if( bit >= 0 ) {
                mask ^= 1 << bit;
            }
                      
            Integer before = maskToIndex.get(mask);
            
            if( before != null ) {
                
                result = Math.max( result, i - before);
            } else {
                                             
                maskToIndex.put(mask, i );
            }
            
            
        }
        
        
        return result;
    }
    
    public int getBit( char ch ) {
        switch( ch ) {
            case 'a':
                return 0;
            case 'e':
                return 1;
            case 'i':
                return 2;
            case 'o':
                return 3;
            case 'u':
                return 4;
            default:
                return -1;
        }
    }
}
