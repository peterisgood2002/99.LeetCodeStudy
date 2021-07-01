package com.peter12.solution.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EASY_0599_MINIMUM_INDEX_SUM_OF_TWO_LISTS {
	public static String[] findRestaurant(String[] list1, String[] list2) { 
		 HashMap<String, Integer> index = new HashMap<String, Integer>();
	        
	        for( int i = 0; i < list1.length; i++ ) {
	            index.put( list1[i], i);
	        }
	        
	        HashMap<Integer, List<String>> index2 = new HashMap<Integer, List<String>>();
	        for( int i = 0; i < list2.length; i++ ) {
	           
	            Integer in = index.get( list2[i]  );
	            
	            if( in != null ) {
	                int r = in + i;
	                
	                List<String> result = index2.get(r);
	                if( result == null ) {
	                    result = new ArrayList<String>();
	                    
	                    index2.put(r, result);
	                    
	                }
	                
	                result.add( list2[i]);
	            }
	        }
	        
	        int min = Integer.MAX_VALUE;
	        for( int k : index2.keySet() ) {
	            if( min > k ) {
	                min = k;
	            }
	        }
	        
	        List<String> result = index2.get(min);
	        String[] r = new String[ result.size() ];
	        
	        return result.toArray(r);
	}
}
