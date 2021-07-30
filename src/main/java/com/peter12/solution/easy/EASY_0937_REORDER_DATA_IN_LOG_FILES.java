package com.peter12.solution.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EASY_0937_REORDER_DATA_IN_LOG_FILES {
	public String[] reorderLogFiles(String[] logs) {
        List<String> digits = new ArrayList<String>();
        List<String> letters = new ArrayList<String>();
        
        for( String l : logs ) {
            int index = l.indexOf(" ");
            
            String w = l.substring( index );
            
            boolean digit = true;
            for( char ch : w.toCharArray() ) {
                if( 'a' <= ch && ch <= 'z') {
                    digit = false;
                }
            }
                        
            if(digit) {
                
                digits.add(l);
            } else {
                letters.add(l);
            }
      	      
        }
        
        Collections.sort( letters, new Comparator<String>() {
            public int compare( String o1, String o2) {
                int index1 = o1.indexOf(" ");
                int index2 = o2.indexOf(" ");
                
                String log1 = o1.substring( index1 );
                String log2 = o2.substring( index2 );
                
                if( log1.equals( log2 ) ) {
                    String id1 = o1.substring( 0, index1 );
                    String id2 = o2.substring( 0, index2 );
                    
                    return id1.compareTo(id2);
                } else {
                    return log1.compareTo( log2 );
                }
            }
        });
        
        
        String[] result = new String[ logs.length];
        int i = 0;
        for( String l : letters ) {
            result[i++] = l;
        }
        
        for( String d : digits ) {
            result[i++] = d;
        }
        
        return result;
    }
}
