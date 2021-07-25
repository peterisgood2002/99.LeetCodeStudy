package com.peter12.solution.medium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

public class MEDIUM_0763_PARTITION_LABELS {
	public List<Integer> partitionLabels(String s) {
		//1. Find the last element for every characters
        int[] last = new int[26];
        for( int i = 0; i < s.length(); i++ ) {
            last[ s.charAt(i) - 'a' ] = i;
        }
        
        int groupB = 0;
        int groupE = 0;
        
        List<Integer> result = new ArrayList<Integer>();
        for( int i = 0; i < s.length(); i++ ) {
            
            groupE = Math.max( groupE, last[s.charAt(i) - 'a'] );
            
            if( groupE == i ) {
                //We find one group
                result.add( groupE - groupB + 1);
                groupB = groupE + 1;
            }
            
        }
        
        return result;
    }
}
