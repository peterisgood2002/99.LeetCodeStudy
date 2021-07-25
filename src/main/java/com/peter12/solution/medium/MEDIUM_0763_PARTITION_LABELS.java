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
		HashMap<Character, int[] > range = new  HashMap<Character, int[] >();
        for( int i = 0; i < s.length(); i++ ) {
            char ch = s.charAt(i);
            
            int[] r = range.get(ch);
            if( r == null ) {
                r = new int[2];
                
                range.put(ch, r);
                r[0] = i;
                r[1] = i;
            } else {
                r[1] = i;
            }
            
        }
        
        
        List<int[]> values = new ArrayList<int[]>();
        for( int[] v : range.values() ) {
            values.add(v);
        }
        
        values.sort((int[] a, int[] b ) -> a[0] - b[0]);
        List<Integer> result = new ArrayList<Integer>();
        
        int total = 0;
        int begin = 0;
        int end = 0;
        
        for( int[] r : values ) {
            
            
            System.out.println(  "[ x, y ] = [" + r[0] + "," + r[1] +"]");
            if( end < r[0] ) {
                //Another Group
                
                System.out.println( "Another Group [ x, y ] = [" + r[0] + "," + r[1] +"]");
                result.add( end - begin + 1 );
                total = 0;
                begin = r[0];
            }
            
            if( end < r[1] ) {
                end = r[1];
            }
            
            System.out.println( "BEGIN = " + begin + " END = " + end);
            total++;
        }
        
        //Add the last group
        result.add(end - begin + 1);
        return result;
    }
}
