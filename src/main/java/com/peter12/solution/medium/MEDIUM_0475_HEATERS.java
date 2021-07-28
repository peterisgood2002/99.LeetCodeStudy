package com.peter12.solution.medium;

import java.util.Arrays;

public class MEDIUM_0475_HEATERS {
	public int findRadius(int[] houses, int[] heaters) {
        int result = 0;
        
        Arrays.sort( heaters );
        
        
        for( int h : houses ) {
            int small = findSmallestR(h, heaters );
            
            result = Math.max( result, small);
        }
        
        return result;
    }
    
    public int findSmallestR( int h, int[] heaters) {
        
        int begin = 0;
        int end = heaters.length - 1;
        
        while( begin <= end ) {
            int mid = ( begin + end ) / 2;
            
            if( h == heaters[mid] ) {
                return 0;
            }
            
            if( h < heaters[mid] ) {
                end = mid - 1;
            } else {
                begin = mid + 1;
            }
        }
        
        //Not find
        
        System.out.println( "end = " + end + " begin = " + begin );
        if( 0 <= end && begin < heaters.length ) {
            return Math.min( h - heaters[end], heaters[begin] - h );
        } else if ( end == -1) {
            return heaters[begin] - h;
        } else {
            return h - heaters[end];
        }
        
        
    }
}
