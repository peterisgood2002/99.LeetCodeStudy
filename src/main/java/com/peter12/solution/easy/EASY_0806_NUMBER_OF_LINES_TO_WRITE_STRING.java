package com.peter12.solution.easy;

public class EASY_0806_NUMBER_OF_LINES_TO_WRITE_STRING {
	public int[] numberOfLines(int[] widths, String s) {

		int lines = 1;
		int count = 0;
		for( int i = 0; i < s.length(); i++) {
			int index = s.charAt(i) - 'a';

			if( count + widths[index] <= 100 ) { 
				count += widths[index];
			} else {
				//System.out.println( "Lines = " + lines + " count = " + count);
				//Write a new line
				lines++;
				count = widths[index];
			}

			//System.out.println( "ch = "+ s.charAt(i)  + "Lines = " + lines + " count = " + count);
		}

		return new int[] {lines, count};
	}
}
