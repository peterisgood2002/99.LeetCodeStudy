package com.peter12.solution.medium;

public class MEDIUM_0189_ROTATE_ARRAY {
	public void rotate(int[] nums, int k) {
        /*
          Solution: https://www.cnblogs.com/grandyang/p/4298711.html
        */
        
        if( nums.length == 0 || k % nums.length == 0 ) {
            return;
        }
        
        k %= nums.length;
        int size = nums.length;
        
        reverse(nums, 0, size - 1 - k);
        reverse(nums, size - k, size - 1);
        reverse(nums, 0 , size - 1);
    }
    
    public void reverse( int[] nums, int begin, int end ) {
        while( begin <= end ) {
            int tmp = nums[begin];
            nums[begin] = nums[end];
            nums[end] = tmp;
            
            begin++;
            end--;
        }
        
    }
}
