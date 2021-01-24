package com.peter12.solution.easy;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class EASY_0401_BINARY_WATCH {
	public static List<String> readBinaryWatch(int num) {
		
		/*
		 * Solution: https://medium.com/competitive-programming/leetcode-401-binary-watch-e65f005a52e3
		 * I treat this problem so hard
		 * */
		
		List<String> result = new Vector<String>();
		
		for( int i = 0; i <= num; i++ ) {
			if( i == 2 ) {
				int test = 0;
			}
			
			List<String> hours = getPossbibleResult(4, i);
			List<String> minutes = getPossbibleResult(8 , num - i);
			
			for( String h : hours ) {
				for( String m : minutes) {
					int ih = Integer.valueOf(h);
					int im = Integer.valueOf(m);
					
					if( ih < 12 && im < 60 ) {
						result.add(h +":" + m);
					}
					
				}
			}
		}
		
		Collections.sort(result);
		return result;
	}
	
	public static List<String> getPossbibleResult( int totalbit, int numberOfLightOn) {
		boolean showLeading = (totalbit == 4) ? false: true;
		
		List<String> result = new Vector<String>();
	
		int[] bits = new int[totalbit];
		
		getPossbileResultImpl(numberOfLightOn, showLeading, bits, result);
		return result;
	}
	
	private static void getPossbileResultImpl(int numberOfLightOn, boolean showLeading, int[] bits, List<String> result) {
		
		if( numberOfLightOn == 0 ) {
			String r = bitToInteger(showLeading, bits);
			
			if( !result.contains(r) ) {
				result.add(r);
			}
			
			return ;
		}
	
		for( int i = 0; i < bits.length; i++ ) {
			
			if( bits[i]  == 0 ) {
				bits[i] = 1;
				
				getPossbileResultImpl( numberOfLightOn - 1, showLeading, bits, result);
				
				bits[i] = 0;
			}
			
		}
		
	}
	
	private static void showBits( int[] bits ) {
		for( int val : bits) {
			System.out.print( String.valueOf(val) );
		}
		
		System.out.print("\n");
	}
	
	public static String bitToInteger(boolean showLeading, int[] bits) {
		
		int result = 0;
		for( int i = 0; i < bits.length; i++ ) {
			result |= bits[i];
			if( i < bits.length - 1 ) {
				result <<= 1;
			}
			
		}
		
		if(result < 10 && showLeading ) {
			return "0" + result;
		}
		
		return String.valueOf(result);
		
	}
}
