package com.peter12.solution.easy;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.data.ListNode;

public class EASY_0155_MIN_STACK {
	 /** initialize your data structure here. */
	
	List<Integer> stack = null;
    public EASY_0155_MIN_STACK() {
        stack = new Vector<Integer>();
    }
    
    public void push(int x) {

    	stack.add(x);
    	
    }
    
    public void pop() {
        stack.remove(stack.size() - 1);
    }
    
    public int top() {
        return stack.get(stack.size() - 1 );
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        
        for( int i = 0; i < stack.size(); i++ ) {
        	if( min > stack.get(i) ) {
        		min = stack.get(i);
        	}
        }
        
        return min;
    }
}
