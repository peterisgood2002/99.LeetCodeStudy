package com.peter12.solution.medium;

public class MEDIUM_0633_SUM_OF_SQUARE_NUMBERS {
	public boolean judgeSquareSum(int c) {
		int end = (int) Math.sqrt(c) + 1;
		int begin = 0;


		while( begin <= end ) {//Can duplicate
			int sum = begin * begin + end * end;
			if( sum == c ) {
				return true;
			}

			if(sum > c ) {
				end--;
			}

			if( sum < c ) {
				begin++;
			}
		}

		return false;
	}
}
