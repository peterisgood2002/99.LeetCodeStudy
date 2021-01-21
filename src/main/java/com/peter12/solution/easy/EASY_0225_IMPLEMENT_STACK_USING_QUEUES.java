package com.peter12.solution.easy;

import java.util.ArrayDeque;
import java.util.Queue;

public class EASY_0225_IMPLEMENT_STACK_USING_QUEUES {
	
	Queue<Integer> data = null;
	Queue<Integer> operation = null;
	 /** Initialize your data structure here. */
    public EASY_0225_IMPLEMENT_STACK_USING_QUEUES() {
    	data = new ArrayDeque<Integer>();
    	
    	operation = new ArrayDeque<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        data.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int result = 0;
        
        int length = data.size();
        int i = 0;
        do {
        	result = data.poll();
        	if( i < length - 1 ) {
        		operation.add(result);
        	}
        	
        } while( ++i < length );
       
        data = operation;
        operation = new ArrayDeque<Integer>();
        return result;
    }
    
    /** Get the top element. */
    public int top() {
        int result = 0;
        
        while( !data.isEmpty() ) {
        	result = data.poll();
        	operation.add(result);
        }
        
        data = operation;
        operation = new ArrayDeque<Integer>();
        
        return result;
    } 
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return data.isEmpty();
    }
}
