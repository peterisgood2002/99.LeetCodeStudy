package com.peter12.solution.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MEDIUM_1282_GROUP_THE_PEOPLE_GIVEN_THE_GROUP_SIZE_THEY_BELONG_TO {
	public List<List<Integer>> groupThePeople(int[] groupSizes) {
		HashMap<Integer, List<Integer>> group = new HashMap<Integer, List<Integer>>();
        for( int i = 0; i < groupSizes.length; i++ ) {
            List<Integer> g = group.get( groupSizes[i] );
            
            if( g == null ) {
                g = new ArrayList<Integer>();
                group.put( groupSizes[i], g);
            }
            
            g.add(i);
        }
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for( HashMap.Entry<Integer, List<Integer>> e : group.entrySet() ) {
            int key = e.getKey();
            List<Integer> val = e.getValue();
            
            if( key == val.size() ) {
                result.add(val);
            } else {
                //Split
                List<Integer> r = null;
                for( int i = 0; i < val.size(); i++ ) {
                    if( i % key == 0 ) {
                        r = new ArrayList<Integer>();
                        result.add(r);
                        
                    }
                    
                    r.add( val.get(i));
                }
                
            }
        }
        
        
        return result;
        
        
    }
}
