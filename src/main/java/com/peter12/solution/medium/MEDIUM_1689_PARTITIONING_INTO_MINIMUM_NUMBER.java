package com.peter12.solution.medium;

import java.util.Arrays;

public class MEDIUM_1689_PARTITIONING_INTO_MINIMUM_NUMBER {
	public int minPartitions(String n) {
        int[] data = new int[ n.length()];
        for( int i = 0; i < data.length; i++ ) {
            data[i] = n.charAt(i) - '0';
        }
        
        Arrays.sort(data);
        
        return data[ data.length - 1];
    }
}
