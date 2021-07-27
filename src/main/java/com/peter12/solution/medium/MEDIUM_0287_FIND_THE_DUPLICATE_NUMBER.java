package com.peter12.solution.medium;

public class MEDIUM_0287_FIND_THE_DUPLICATE_NUMBER {
	public int findDuplicate(int[] nums) {
        /*
         Solution: https://leetcode.com/problems/find-the-duplicate-number/solution/
        */
        
        return bitsManipulateion( nums );
    }
    
    public int binarySearch( int[] nums ) {
        /*
          Count[i]: the count less than or equals to i
          if all elements are distinct we can find count[i] = i, here is example
            nums=  1 2 3 4 5
            count= 1 2 3 4 5
          if we obtain duplicate one we will obtain count[i] >= i
            nums=  1 2 3 3 5
            count= 1 2 4 4 5
            
          ==> search the least i that count[i] >= i
        */
        
        int begin = 0;
        int end = nums.length - 1;
        
        int result = 0;
        while( begin <= end ) {
            int middle = ( begin + end ) / 2;
            
            int count = 0;
            for( int i = 0; i < nums.length; i++ ) {
                if( nums[i] <= middle ) {
                    count++;
                }
            }
            
            if( count > middle ) {
                //Duplicate
                result = middle;
                end = middle - 1;
            } else {
                begin = middle + 1;
            }
            
        }
        
        return result;
    }
    
    public int bitsManipulateion( int[] nums ) {
        /*
           consider we count every bits in the array
             nums[i]       bits
                1          0001
                2          0010
                3          0011
                4          0100
              SUMA         0122
              
             We add 3 as duplicate
             nums[i]
                1          0011
                2          0010
                3          0011
                4          0100
                3          0011
               SUMB        0133
               SUMB - SUMA = 0011 = 3
                
         */
        
        //Find the bits for this maximum value
        int bits = findMaxBits( nums);
        System.out.println(" bits = " + bits);
        int result = 0;
        for( int shift = 0; shift < bits; shift++ ) {
            int bitA = 0;
            int bitB = 0;
            for( int i = 0; i < nums.length; i++ ) {
                bitA +=  i >> shift & 1;
                bitB += nums[i] >> shift & 1;
            }
            System.out.println( " bitA = " + bitA + " bitB = " + bitB );
            if( bitB > bitA ) {
                result |= 1 << shift;
            }
            
        }
        
        return result;
        
        
    }
    
    public int findMaxBits( int[] nums ) {
        int max = 0;
        for( int v : nums ) {
            max = Math.max( max , v );
        }
        
        
        int bits = 0;
        while( max > 0 ) {
            bits++;
            max >>= 1;
        }
        
        return bits;
        
    }
}
