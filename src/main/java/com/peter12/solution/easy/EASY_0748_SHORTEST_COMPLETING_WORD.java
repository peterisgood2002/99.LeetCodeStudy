package com.peter12.solution.easy;

import java.util.ArrayList;
import java.util.List;

public class EASY_0748_SHORTEST_COMPLETING_WORD {
	public String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate = licensePlate.toLowerCase();
        
        int[] lc = getCount(licensePlate);
        
        List<String> result = new ArrayList<String>();
        for( String w : words ) {
            int[] lw = getCount(w);
            
            boolean complete = true;
            for( int i = 0; i < lc.length; i++ ) {
                if( lc[i] > 0 && lc[i] > lw[i] ) {
                    complete = false;
                    break;
                }
            }
            
            if( complete ) {
                result.add(w);
            }
        }
        
        if( result.size() == 0 ) {
            return "";
        }
        
        int min = Integer.MAX_VALUE;
        int index = 0;
        for( int  i = 0; i < result.size(); i++ ) {
            String str = result.get(i);
            if( min > str.length() ) {
                min = str.length();
                index = i;
            }
        }
        return result.get(index);
        
    }
    
    public int[] getCount( String str) {
        int[] result = new int[26];
        for( int i = 0; i < str.length(); i++ ) {
            char ch = str.charAt(i);
            
            if( 'a' <= ch && ch <= 'z' ) {
                result[ ch - 'a']++;
            }
            
        }
        
        return result;
    }
}
