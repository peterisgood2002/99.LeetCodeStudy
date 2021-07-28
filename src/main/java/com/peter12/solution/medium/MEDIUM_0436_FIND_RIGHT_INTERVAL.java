package com.peter12.solution.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MEDIUM_0436_FIND_RIGHT_INTERVAL {
	public class Interval implements Comparable<Interval> {
        public int index;
        public int[] intervals;
        
        public Interval( int i, int[] a ) {
            index = i;
            intervals = a;
        }
        
        public int compareTo( Interval o ) {
            return  intervals[0] - o.intervals[0];
                
        }
        
        public String toString() {
            return "[" + intervals[0] + "," + intervals[1]+ "]";
        }
        
    }
    public int[] findRightInterval(int[][] intervals) {
        
        List<Interval> data = new ArrayList<Interval>();
        for( int i = 0; i < intervals.length; i++ ) {
            data.add( new Interval( i, intervals[i] ) );
        }
        
        Collections.sort( data );
        
        for( int i = 0; i < data.size(); i++ ) {
            System.out.println( data.get(i) );
        }
        
        int[] result = new int[data.size()];
        
        for( int i = 0; i < data.size(); i++ ) {
            
            Interval left = data.get(i);
            result[left.index] = rightIndex(left, data);
            
        }
        
        
        return result;
    }
    
    public int rightIndex( Interval t, List<Interval> data) {
        int begin = 0;
        int end = data.size() - 1;
        int target = t.intervals[1];
        while( begin <= end ) {
            
            int middle = ( begin + end ) / 2;
            
            Interval d = data.get( middle );
            
            if(target == d.intervals[0] ) {
                return d.index;
            }
            
            if( target < d.intervals[0] ) {
                end = middle - 1;
            } else {
                begin = middle + 1;
            }
        }
        
        if( begin < data.size() ) {
            return data.get(begin).index;
        } else {
            return -1;
        }
        
    }
}
