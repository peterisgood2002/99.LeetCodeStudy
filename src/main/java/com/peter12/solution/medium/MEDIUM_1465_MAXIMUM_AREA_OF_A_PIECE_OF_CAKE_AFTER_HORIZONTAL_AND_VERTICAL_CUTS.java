package com.peter12.solution.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MEDIUM_1465_MAXIMUM_AREA_OF_A_PIECE_OF_CAKE_AFTER_HORIZONTAL_AND_VERTICAL_CUTS {
	public static int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
		/*
		 * Solution: https://www.youtube.com/watch?v=x1wpxxzpiFY
		 * */
		List<Integer> x = new ArrayList<Integer>();
        List<Integer> y = new ArrayList<Integer>();
        
        x.add(0);
        y.add(0);
        
        for( int v : horizontalCuts) {
            y.add(v);
        }
        for( int v : verticalCuts ) {
            x.add(v);
        }
        
        x.add(w);
        y.add(h);
        
        Collections.sort(x);
        Collections.sort(y);
        
        //display(x);
        //display(y);
        
        
        long width = 0;
        for( int i = 1; i < x.size(); i++ ) {
            width = Math.max( width, x.get(i) - x.get(i-1) );
            
        }
        
        long height = 0;
        for( int i = 1; i < y.size(); i++ ) {
            height = Math.max(height,  y.get(i) - y.get(i-1));
        }
        
        long result = width * height;
        
        
        return (int)(result % 1000000007) ;
	}
}
