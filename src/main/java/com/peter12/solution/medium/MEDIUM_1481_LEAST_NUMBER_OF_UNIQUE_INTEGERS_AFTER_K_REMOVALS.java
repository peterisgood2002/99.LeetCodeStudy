package com.peter12.solution.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MEDIUM_1481_LEAST_NUMBER_OF_UNIQUE_INTEGERS_AFTER_K_REMOVALS {
	public static int findLeastNumOfUniqueInts(int[] arr, int k) {
		/*
		 * Solution: https://www.cnblogs.com/cnoodle/p/14524251.html
		 * */
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        for( int val : arr ) {
            Integer c = count.get(val);
            if( c == null ) {
                 c = 0;
            }
            
            c++;
            
            count.put(val, c);
        }
        
        int size = count.size();
        int[] c = new int[size];
        int i = 0;
        for( int key : count.keySet() ) {
            c[i] = count.get(key);
            
            i++;
        }
        
        Arrays.sort(c);
        for( int v : c ) {
            if( k >= v ) {
                k-= v;
                size--;
            } else {
                break;
            }
        }
        
        return size;
        
        
    }
}
