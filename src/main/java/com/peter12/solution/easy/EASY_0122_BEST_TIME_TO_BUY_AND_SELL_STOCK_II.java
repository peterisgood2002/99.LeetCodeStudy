package com.peter12.solution.easy;

public class EASY_0122_BEST_TIME_TO_BUY_AND_SELL_STOCK_II {
	public static int maxProfit(int[] prices) {
		int result = 0;
		
		for( int i = 1; i < prices.length ; i++ ) {
			int todayProfit = prices[i] - prices[i-1];
			
			if(todayProfit > 0 ) {
				result += todayProfit;
			}
		}
		
		return result;
	}
	

	
}
