package com.peter12.solution.medium;

public class MEDIUM_0011_CONTAINER_WITH_MOST_WATER {
	public static int maxArea(int[] height) {
		
		/*
		 * Solution: https://leetcode.com/problems/container-with-most-water/solution/
		 * */
		
		int result = 0;
		int begin = 0; int end = height.length - 1;
		
		while( begin < end) {
			int hm = ( height[begin] < height[end] ) ? height[begin]: height[end];
			
			int area = hm *( end - begin);
			if( result < area) {
				result = area;
				
				
			}
			
			//Try remove the shortest lines
			if( height[begin] < height[end] ) {
				begin++;
			} else {
				end--;
			}
			
		}
		
		
		return result;
		
		
	}
}
