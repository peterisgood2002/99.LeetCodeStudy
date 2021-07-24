package com.peter12.solution.medium;

public class MEDUIM_1828_QUERIES_ON_NUMBER_OF_POINTS_INSIDE_A_CIRCLE {
	public int[] countPoints(int[][] points, int[][] queries) {
		/* x^2 + y ^ 2 <= r ^ 2*/
        
        int[] result = new int[queries.length];
        
        for( int i = 0; i < queries.length; i++ ){
            int[] q = queries[i];
            double rsqr = Math.pow(q[2], 2);
            for( int[] p : points) {
                
                double total = Math.pow(p[0] - q[0], 2 ) + Math.pow( p[1] - q[1], 2 );
                
                if( total <= rsqr) {
                    result[i]++;
                }
            }
            
        }
        
        
        return result;
        
    }
}
