package com.peter12.solution.easy;

import java.util.List;
import java.util.Vector;

public class EASY_0412_FIZZ_BUZZ {
	public static List<String> fizzBuzz(int n) {

		List<String> result = new Vector<String>();
		
		for( int i = 1; i <= n; i++ ) {
			
			String r = String.valueOf(i);
			
			if( i % 3 == 0 || i % 5 == 0) {
				r = "";
				if( i % 3 == 0 ) {
					r += "Fizz";
				}
				
				if( i % 5 == 0 ) {
					r += "Buzz";
				}
				
			}
			
			result.add(r);
			
			
		}
		
		return result;
	}
}
