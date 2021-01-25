package com.peter12.solution.easy;

import java.math.MathContext;

public class EASY_0492_CONSTRUCT_THE_RECTANGLE {
	public static int[] constructRectangle(int area) {
		int srt = (int)Math.floor( Math.sqrt(area) );
		
		while ( area % srt != 0 ) {
			srt--;
		}
		
		int l = (int)srt;
		int w = (int) area / srt;
		
		if( l < w ) {
			int tmp = l;
			l = w;
			w = tmp;
		}

		return new int[] {l, w};

	}
}
