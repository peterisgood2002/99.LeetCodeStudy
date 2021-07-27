package com.peter12.solution.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MEDIUM_0373_FIND_K_PAIRS_WITH_SMALLEST_SUMS {
	public class Elements implements Comparable<Elements> {
        public int sum;
        public List<Integer> pair;
        
        public Elements( int s, List<Integer> p ) {
            sum = s;
            pair = p;
        }
        
        public int compareTo( Elements o ) {
            return sum - o.sum;
        }
        
    }
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        
        PriorityQueue<Elements> pq = new PriorityQueue<Elements>();
        
        for( int i = 0; i < nums1.length ; i++ ) {
            
            for( int j = 0; j < nums2.length; j++ ) {
                
                List<Integer> pair = new ArrayList<Integer>();
                pair.add( nums1[i] );
                pair.add( nums2[j] );
                int sum = nums1[i] + nums2[j];
                
                pq.add( new Elements( sum, pair) );
            }
        }
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        int i = 0; 
        
        while( i < k && !pq.isEmpty() ) {
            result.add( pq.poll().pair );
            
            i++;
        }
        return result;
    }
}
