package com.peter12.solution.easy;

import java.util.HashSet;

public class EASY_0575_DISTRIBUTE_CANDIES {
	 public int distributeCandies(int[] candyType) {
	        HashSet<Integer> type = new HashSet<Integer>();
	        for( int t : candyType) {
	            type.add(t);
	        }
	        
	        int eat = candyType.length / 2;
	        
	        if( eat >= type.size() ) {
	            return type.size();
	        } else {
	            return eat;
	        }
	    }
}
