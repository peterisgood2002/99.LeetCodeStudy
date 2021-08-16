package com.peter12.solution.easy;

import java.util.HashSet;

public class EASY_1952_THREE_DIVISORS {
	public boolean isThree(int n) {

		HashSet<Integer> divisor = new HashSet<Integer>();

		int sqrt = (int) Math.sqrt(n);
		for( int i = 1; i <= sqrt; i++ ) {
			if( n % i == 0 ) {
				divisor.add(i);
				divisor.add( n / i );
			}
		}

		System.out.println( divisor.size() );
		return divisor.size() == 3;
	}
}
