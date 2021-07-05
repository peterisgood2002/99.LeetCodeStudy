package com.peter12.solution.medium;

import java.util.List;
import java.util.Vector;

public class MEDIUM_0166_FRACTION_TO_RECURRING_DECIMAL {
	public static String fractionToDecimal(int numerator, int denominator) {
		if( numerator == 0 ) {
			return "0";
		}

		String result = "";
		if( ( numerator < 0 ) ^ (denominator < 0 ) ) {
			result += "-";
		}

		long num = numerator; 
		if( num < 0 ) {
			num = -num;
		}

		long deno = denominator;
		if( deno < 0 ) {
			deno = -deno;
		}

		long q = num / deno;
		long r = num % deno;


		result += ( r == 0 )? String.valueOf(q) : q + ".";

		String remain = "";
		List<Long> lr = new Vector<Long>();



		while( r != 0 ) {

			System.out.println(" r = " + r );

			for( int i = 0; i < lr.size(); i++ ) {
				if( lr.get(i) == r ) {
					remain = remain.substring(0, i ) + "(" + remain.substring(i) +")";
					return result + remain;
				}
			}


			lr.add(r);
			r *= 10;

			remain +=  r / deno;

			r %= deno;
		}

		return result + remain;
	}
}
