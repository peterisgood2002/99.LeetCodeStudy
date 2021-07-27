package com.peter12.solution.medium;

public class MEDIUM_0400_NTH_DIGIT {
	public int findNthDigit(int n) {
        /*
         Solution: https://www.programmersought.com/article/8347922292/
         
         Digit    Range       Count    Total Digits
           1     1    - 9      9          1 * 9
           2     10   - 99     90         2 * 90
           3     100  - 999    900        3 * 900
           4     1000 - 9999   9000       4 * 9000
        
        */
        
        int digit = 1;
        long count = 9;
        long start = 1;
        while( n > digit * count ) {
            n -= digit * count;
            
            count *= 10;
            start *= 10;
            digit++;
        }
        
        System.out.println(" start = " + start + " n = " + n + " digit = " + digit);
        
        start += ( n - 1 ) /digit;
        
        String result = String.valueOf(start);
         
        return result.charAt( (n - 1) % digit ) -'0';
        
    }
}
