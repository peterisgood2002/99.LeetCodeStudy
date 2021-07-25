package com.peter12.solution.medium;

import java.util.HashMap;

public class MEDIUM_1915_NUMBER_OF_WONDERFUL_SUBSTRINGS {
	public static long wonderfulSubstrings(String word) {

		/*
          Solution: https://algomonster.medium.com/leetcode-1915-number-of-wonderful-substrings-fd94fc49de77
          1. bit mask means the number of character for this prefix is odd or even
              a b a
                                          ba
              when i == 3 ==> bit mask = 010 
          2. Even case: 
             If there are the same bit mask pattern in i and j, we can say that there are all even number of character between i and j.
             Because Even - Even = Even and Odd - Odd = Even

          3. Only One letter is odd:
             Flip one bit and check if there is the same bit mask 

		 */
		HashMap<Integer, Integer> maskToCount = new HashMap<Integer, Integer>();//This is a bit mask which means the number of character is odd or even
		maskToCount.put(0, 1);//Initial
		long result = 0;
		int mask = 0;

		for( int i = 0; i < word.length(); i++ ) {
			int shift = word.charAt(i) - 'a';

			mask ^= 1 << shift;

			//Even case: sll letter are even number
			//System.out.println( "=======EVEN====== " );
			Integer count = maskToCount.get( mask );
			if( count == null ) {
				count = 0;
			}
			result += count;
			//System.out.println("i = " + i + " mask = " + mask + " count = " + count + " result = " + result);

			//System.out.println( "=======ODD======");
			//Only One letter is odd
			result += oneLetterOdd( mask, maskToCount);
			//System.out.println( "=======FINAL======");
			count++;
			//System.out.println( " result = " + result);
			maskToCount.put(mask, count);
		}

		return result;

	}

	public static int oneLetterOdd( int mask, HashMap<Integer, Integer> maskToCount) {

		/*
          abaaabb = 010 Flip
          abaa    = 011 
		 */
		int bits = 'j' - 'a';
		int result = 0;
		for( int j = 0; j <= bits; j++ ) {
			int odd = mask ^( 1 << j);
			Integer c = maskToCount.get(odd);

			if( c != null ) {
				result += c;
			}
		}

		//System.out.println(" result = " +result);
		return result;
	}

}
