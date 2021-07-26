package com.peter12.solution.medium;

import java.util.Arrays;

public class EASY_1005_MAXIMIZE_SUM_OF_ARRAY_AFTER_K_NEGATIONS {
	public int largestSumAfterKNegations(int[] nums, int k) {
        
        Arrays.sort( nums );
        
        for( int i = 0; i < k ; i++) {
            int val = - nums[0];
            
            if( val < 0 ) {
                nums[0] = val;
                continue; // we do not need to change the order if we get negative value
            }
            //We need to maintain nums is in order
            int j = 1;
            while( j < nums.length && val > nums[j] ) {
                nums[j-1] = nums[j];
                
                j++;
                
            }
            
            nums[j - 1] = val;
            
        }
        
        int result = 0;
        for( int v :nums) {
            result += v;
        }
        return result;

    }
}
