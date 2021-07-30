package com.peter12.solution.easy;

import java.util.ArrayList;
import java.util.List;

public class EASY_1408_STRING_MATCHING_IN_AN_ARRAY {
public List<String> stringMatching(String[] words) {
        
        List<String> result = new ArrayList<String>();
        for( int i = 0; i < words.length - 1; i++ ) {
            for( int j = i+1; j < words.length; j++ ) {
                String longest = ( words[i].length() > words[j].length() ) ? words[i] : words[j];
                String small = ( words[i].length() > words[j].length() ) ? words[j] : words[i];
                
                //System.out.println( "longest = " + longest + " small = " + small);
                int index = longest.indexOf( small );
                
                if( index >= 0 ) {
                    
                    if( !result.contains(small) ) {
                        result.add( small);
                    }
                    
                }
                
            }
        }
        
        return result;
    }
}
