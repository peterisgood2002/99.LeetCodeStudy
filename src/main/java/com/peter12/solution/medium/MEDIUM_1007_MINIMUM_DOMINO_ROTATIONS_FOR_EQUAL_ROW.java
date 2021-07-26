package com.peter12.solution.medium;

public class MEDIUM_1007_MINIMUM_DOMINO_ROTATIONS_FOR_EQUAL_ROW {
	public int minDominoRotations(int[] tops, int[] bottoms) {
        int maxTopValue = maxValue( tops);
        int maxBottomValue = maxValue(bottoms);
        
        System.out.println( "TOP = " + maxTopValue + " BOTTOM = " + maxBottomValue);
        //rotate Top to bottom
        int rTtoB = rotate(maxTopValue,  tops, bottoms);
        int rBtoT = rotate(maxBottomValue, bottoms, tops);
        
        if( rTtoB == -1 && rBtoT == -1 ) {
            return -1;
        } else if( rTtoB == -1 ) {
            return rBtoT;
        } else if( rBtoT == -1){
            
            return rTtoB;
        } else {
            return Math.min(rTtoB, rBtoT );
        }
        
    }
    
    public int rotate( int maxValue, int[] a, int[] b ) {
        
        int result = 0;
        for( int i = 0; i < a.length; i++ ) {
            
            
            if( a[i] != maxValue  ) {
                if( b[i] !=  maxValue) {
                    return -1;
                    
                } else {
                    result++;
                }
            }
        }
        
        return result;
    }
    public int maxValue( int[] data ) {
        
        int[] count = new int[7];
        for( int i : data) {
            count[i]++;
        }
        
        int max = 0;
        int result = 0;
        for( int i = 0; i < count.length; i++ ) {
            
            if( max < count[i] ) {
                max = count[i];
                result = i;
            }
            
        }
                
        return result;
    }
}
