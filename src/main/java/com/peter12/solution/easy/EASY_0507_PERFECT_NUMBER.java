package com.peter12.solution.easy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import com.peter12.solution.util.Util;

public class EASY_0507_PERFECT_NUMBER {
	public static boolean checkPerfectNumber(int num) {
		
		
		Set<Integer> divisor  = Util.getDivisor(num);
		
		int total = 0;
		for( int d : divisor ) {
			if(d != num ) {
				total += d;
			}
		}
		
		return total == num;
		
 	}
}
