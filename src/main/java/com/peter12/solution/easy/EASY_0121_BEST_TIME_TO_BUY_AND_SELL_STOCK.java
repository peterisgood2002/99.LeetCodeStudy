package com.peter12.solution.easy;

public class EASY_0121_BEST_TIME_TO_BUY_AND_SELL_STOCK {
	public static int maxProfit(int[] prices) {
		if(prices.length < 2 ) {
			return 0;
		}
 		
		/*This issue is the same as Kadane¡¦s Algorithm
		 * Link:https://medium.com/algorithms-and-leetcode/best-time-to-buy-sell-stocks-on-leetcode-the-ultimate-guide-ce420259b323
		 * 
		 * Max_Profit(n) = Max( Price(i) - Min Price , Max_Profit(n-1))
		 * */
		
		int maxProfit = 0;
		int previousMinPrice = prices[0];
		for( int i = 1; i < prices.length; i++ ) {
	
			
			int profit = prices[i] - previousMinPrice;
			
			if( profit > maxProfit) {
				maxProfit = profit;
			}
			
			//Determine min price
			if( previousMinPrice > prices[i] ) {
				previousMinPrice = prices[i];
			}
		}
		
		return maxProfit;
	}
}
