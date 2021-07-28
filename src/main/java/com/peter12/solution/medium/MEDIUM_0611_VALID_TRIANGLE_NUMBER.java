package com.peter12.solution.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MEDIUM_0611_VALID_TRIANGLE_NUMBER {
	public int triangleNumber(int[] nums) {
        /*
          Solution: https://zxi.mytechroad.com/blog/math/leetcode-611-valid-triangle-number/
          a + b > c
                   
          2 3 4 5 5 6 
          a       b c ==>5
          a     b   c ==>3
         */
        if( nums.length < 3 ) {
            return 0;
        }
        
        Arrays.sort( nums );
        
        int result = 0;
        for( int c = nums.length - 1; c >= 2; c-- ) { // Form a triangle
            int a = 0;
            int b = c - 1;
            
            while( a < b ) {
                if( nums[a] + nums[b] > nums[c] ) {
                    
                    result += b - a;
                    
                    b--;//We look for the next bigger one
                } else {
                    a++;// We can not find a + b > c between a and b so we increment a 
                }
            }
        }
        
        
        return result;
        
    }
}
