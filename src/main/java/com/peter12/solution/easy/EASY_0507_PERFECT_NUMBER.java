package com.peter12.solution.easy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class EASY_0507_PERFECT_NUMBER {
	public static boolean checkPerfectNumber(int num) {
		int size = num / 2;
		
		Set<Integer> divisor  = new HashSet<Integer>();
		for( int i = 1; i < size; i++ ) {
			if( num % i == 0 ) {
				divisor.add(i);
				
				divisor.add( num / i);
				
			}
		}
		
		int total = 0;
		for( int d : divisor ) {
			if(d != num ) {
				total += d;
			}
		}
		
		return total == num;
		
 	}
}
