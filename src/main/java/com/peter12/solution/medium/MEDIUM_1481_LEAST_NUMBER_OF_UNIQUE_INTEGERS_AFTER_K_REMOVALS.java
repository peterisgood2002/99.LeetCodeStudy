package com.peter12.solution.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MEDIUM_1481_LEAST_NUMBER_OF_UNIQUE_INTEGERS_AFTER_K_REMOVALS {
	public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        for( int val : arr ) {
            Integer c = count.get(val);
            if( c == null ) {
                 c = 0;
            }
            
            c++;
            
            count.put(val, c);
        }
        
        HashMap<Integer, List<Integer>> cList = new HashMap<Integer, List<Integer>>();
        List<Integer> key = new ArrayList<Integer>();
        for( HashMap.Entry<Integer, Integer> e : count.entrySet() ) {
            List<Integer> l = cList.get( e.getValue() );
            
            if( l == null ) {
                l = new ArrayList<Integer>();
                cList.put(e.getValue(), l );
                
                key.add( e.getValue() );
            }
            
            l.add(e.getKey() );
        }
        
        Collections.sort(key);
        
        int result = 0;
        for( int c : key ) {
            List<Integer> l = cList.get(c);
            
            if( k <= 0 ) {
                result += l.size();
            } else {
                 int remove = k / c;
            
                if( remove > l.size() ) {
                     k -= c * l.size();
                } else {
                    result += l.size() - remove;
                    k -= c * remove;
                }  
            }
            
        }
        
        
        return result;
        
        
    }
}
