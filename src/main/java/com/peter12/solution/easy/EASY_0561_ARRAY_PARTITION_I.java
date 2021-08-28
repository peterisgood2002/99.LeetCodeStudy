package com.peter12.solution.easy;

import java.util.Arrays;

public class EASY_0561_ARRAY_PARTITION_I {
	public int arrayPairSum(int[] nums) {
        Arrays.sort( nums );
        
        int result = 0;
        for( int i = 0; i < nums.length; i+=2 ) {
            System.out.println( " a = " + nums[i] + " b = " + nums[i+1] );
            result += Math.min( nums[i], nums[i+1]);
        }
        
        return result;
    }
}
