package com.peter12.solution.easy;

import java.util.Arrays;

public class EASY_1913_MAXIMUM_PRODUCT_DIFFERENCE_BETWEEN_TWO_PAIRS {
	public int maxProductDifference(int[] nums) {
        Arrays.sort( nums);
        
        return nums[ nums.length - 1] *nums[ nums.length - 2] - nums[0] * nums[1]; 
    }
}
