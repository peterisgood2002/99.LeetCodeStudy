package com.peter12.solution.easy;

public class EASY_0204_COUNT_PRIMES {
	public static int countPrimes(int n) {
		if( n == 0 ) {
			return 0;
		}
		
		if( n == 1 ) {
			return 0;
		}
		
		boolean[] notPrime = new boolean[n] ;
		notPrime[0] = true;
		notPrime[1] = true;
		for( int i = 2; i < n; i++ ) {
			if( notPrime[i] == false) {
				
				for( int j = 2; i * j < n; j++ ) {
					notPrime[ i * j ] = true;
				}
			}
			
		}
		
		int result = 0;
		for( int i = 0; i < notPrime.length; i++ ) {
			if( notPrime[i] == false ) {
				result++;
			}
		}
		
		return result;
		
	}
}
