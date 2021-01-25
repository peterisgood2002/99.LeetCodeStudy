package com.peter12.solution.easy;

public class EASY_0441_ARRANGING_COINS {
	public static int arrangeCoins(int n) {
		
		double i = 1;
		double j = n;
		double level = 0;
		double total = 0;
		
		 do{
		
			 double middle = (i + j ) / 2;
			 level = (int) middle;
			 
			 total = level * (level+1) / 2;
			
			 if( total > n ) {
				 j = level - 1;
			 }
			 
			 if( total < n ) {
				 i = level + 1;
			 }
			 
			 if( total == n ) {
				 return (int)level;
			 }
			
			
		}while( i <= j );
			
		return (int) j;	// total(j) < n
		
		
	}
}
