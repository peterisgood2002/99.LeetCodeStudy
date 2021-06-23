package com.peter12.solution.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MEDIUM_0128_LONGEST_CONSECUTIVE_SEQUENCE {
	public static int longestConsecutive(int[] nums) {

        /*
            https://www.youtube.com/watch?v=P6RZZMu_maU
        */
        
        Set<Integer> set = new HashSet<Integer>();
        for( int val : nums ) {
            set.add(val);
        }
        
        int max = 0;
        
        for( int val : nums ) {
            if( !set.contains( val - 1) ) {
                //This is the first element
                int last = val + 1;;
                while( set.contains( last ) ) {
                    last++;
                }
                
                if( max < last - val ) {
                    max = last - val;
                }
                
            }
        }
        
        return max;
        
    
        
    }
}
